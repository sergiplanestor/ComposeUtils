import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

sealed class ImplType(open val configName: String) {
    object Implementation : ImplType("implementation")
    object Api : ImplType("api")
    object Kapt : ImplType("kapt")
    data class Project(override val configName: String) : ImplType(configName)
    object TestImpl : ImplType("testImplementation")
    object AndroidTestImpl : ImplType("androidTestImplementation")
    object DebugImpl : ImplType("debugImplementation")
    data class Other(override val configName: String) : ImplType(configName)
}

fun DependencyHandler.apply(name: String, type: ImplType = ImplType.Implementation) {
    if (type !is ImplType.Project) {
        add(type.configName, name)
    } else {
        add(type.configName, project(name))
    }
}

fun DependencyHandler.test(name: String, isUiTest: Boolean = false) {
    apply(name, if (isUiTest) ImplType.AndroidTestImpl else ImplType.TestImpl)
}

fun DependencyHandler.impl(name: String, isApi: Boolean = false, isKapt: Boolean = false) {
    apply(
        name,
        when {
            isApi -> ImplType.Api
            isKapt -> ImplType.Kapt
            else -> ImplType.Implementation
        }
    )
}

fun DependencyHandler.module(name: String, isApi: Boolean = false) {
    apply(
        name = name.let { if (!it.startsWith(":")) ":$it" else it },
        type = ImplType.Project(if (isApi) ImplType.Api.configName else ImplType.Implementation.configName)
    )
}