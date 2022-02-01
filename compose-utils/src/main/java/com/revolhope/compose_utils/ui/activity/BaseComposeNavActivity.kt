package com.revolhope.compose_utils.ui.activity

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavArgumentBuilder
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


abstract class BaseComposeNavActivity : BaseComposeActivity() {

    protected lateinit var navController: NavHostController
    abstract val initNav: String

    @Composable
    override fun ScreenContent() {
        NavHost(
            navController = rememberNavController().also { navController = it },
            startDestination = initNav
        ) {
            onCreateNavGraph()
        }
    }

    abstract fun NavGraphBuilder.onCreateNavGraph()

    protected fun NavGraphBuilder.destinationOf(
        route: NavRoute,
        args: List<NamedNavArgument>,
        deepLinks: List<NavDeepLink>,
        builder: @Composable NavBackStackEntry.() -> Unit
    ) {
        composable(route.key, args, deepLinks) { builder(it) }
    }

    protected fun NavGraphBuilder.destinationOf(
        route: NavRoute,
        arg: NamedNavArgument? = null,
        deepLink: NavDeepLink? = null,
        builder: @Composable NavBackStackEntry.() -> Unit
    ) {
        destinationOf(
            route,
            arg?.let { listOf(arg) }.orEmpty(),
            deepLink?.let { listOf(deepLink) }.orEmpty(),
            builder
        )
    }

    protected fun navArgsOf(vararg args: Pair<String, NavArgumentBuilder.() -> Unit>): List<NamedNavArgument> =
        args.map { navArgument(it.first, it.second) }

    protected fun navRoute(route: String): NavRoute =
        object : NavRoute {
            override val key: String get() = route
        }

    interface NavRoute {
        val key: String
    }
}