package com.revolhope.compose_utils.ui.activity

import androidx.compose.runtime.Composable
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavArgumentBuilder
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavDeepLink
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


abstract class BaseSingleActivity : BaseComposeActivity() {

    abstract val initNav: String

    @Composable
    override fun ScreenContent() {
        val navController = rememberNavController()
        NavHost(
            navController = navController,
            startDestination = initNav
        ) {
            onCreateNavGraph()
        }
    }

    abstract fun NavGraphBuilder.onCreateNavGraph()

    protected fun NavGraphBuilder.navDestinationOf(
        route: String,
        args: List<NamedNavArgument> = emptyList(),
        deepLinks: List<NavDeepLink> = emptyList(),
        builder: @Composable NavBackStackEntry.() -> Unit
    ) {
        composable(route, args, deepLinks) { builder(it) }
    }

    protected fun NavGraphBuilder.navDestinationOf(
        route: String,
        arg: NamedNavArgument? = null,
        deepLink: NavDeepLink? = null,
        builder: @Composable NavBackStackEntry.() -> Unit
    ) {
        navDestinationOf(
            route,
            arg?.let { listOf(arg) }.orEmpty(),
            deepLink?.let { listOf(deepLink) }.orEmpty(),
            builder
        )
    }

    protected fun navArgsOf(vararg args: Pair<String, NavArgumentBuilder.() -> Unit>): List<NamedNavArgument> =
        args.map { navArgument(it.first, it.second) }
}