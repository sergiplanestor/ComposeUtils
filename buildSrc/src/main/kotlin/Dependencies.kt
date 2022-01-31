import org.gradle.api.artifacts.dsl.DependencyHandler

object DependencyVersion {
    const val androidxCore = "1.7.0"
    const val androidxRuntime = "2.4.0"
    const val androidxExtensions = "2.2.0"
    const val androidxViewModel = "2.4.0"
    const val kotlinCoroutines = "1.6.0"
    const val compose = "1.0.5"
    const val composeMaterial3 = "1.0.0-alpha03"
    const val composeActivity = "1.4.0"
    const val composeNavigation = "2.4.0"
}

object Dependency {

    const val androidxCore = "androidx.core:core-ktx:${DependencyVersion.androidxCore}"
    const val androidxRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${DependencyVersion.androidxRuntime}"
    const val androidxExtensions = "androidx.lifecycle:lifecycle-extensions:${DependencyVersion.androidxExtensions}"
    const val androidxViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${DependencyVersion.androidxViewModel}"

    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${DependencyVersion.kotlinCoroutines}"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${DependencyVersion.kotlinCoroutines}"

    const val androidxComposeUi = "androidx.compose.ui:ui:${DependencyVersion.compose}"
    const val androidxComposeMaterial3 = "androidx.compose.material3:material3:${DependencyVersion.composeMaterial3}"
    const val androidxComposeUiPreview = "androidx.compose.ui:ui-tooling-preview:${DependencyVersion.compose}"
    const val androidxComposeActivity = "androidx.activity:activity-compose:${DependencyVersion.composeActivity}"
    const val androidxComposeNavigation = "androidx.navigation:navigation-compose:${DependencyVersion.composeNavigation}"
    const val androidxComposeViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${DependencyVersion.composeNavigation}"
}

fun DependencyHandler.androidCore() {
    impl(Dependency.androidxCore)
}

fun DependencyHandler.androidRuntime() {
    impl(Dependency.androidxRuntime)
}

fun DependencyHandler.androidExtensions() {
    impl(Dependency.androidxExtensions)
}

fun DependencyHandler.androidViewModel() {
    impl(Dependency.androidxViewModel)
}

fun DependencyHandler.ktxCoroutines() {
    impl(Dependency.kotlinCoroutinesCore)
    impl(Dependency.kotlinCoroutinesAndroid)
}

fun DependencyHandler.compose() {
    impl(Dependency.androidxComposeUi)
    impl(Dependency.androidxComposeMaterial3)
    impl(Dependency.androidxComposeUiPreview)
    impl(Dependency.androidxComposeActivity)
    impl(Dependency.androidxComposeNavigation)
    impl(Dependency.androidxComposeViewModel)
    test(Test.androidxComposeJUnit, isUiTest = true)
    apply(Test.androidxComposeTooling, ImplType.DebugImpl)
}

fun DependencyHandler.test() {
    test(Test.junit)
    test(Test.androidxJUnit, isUiTest = true)
    test(Test.androidxEspressoCore, isUiTest = true)
}

object TestVersion {
    const val junit = "4.13.2"
    const val androidxJUnit = "1.1.3"
    const val androidxEspressoCore = "3.4.0"
    const val androidxComposeJUnit = DependencyVersion.compose
    const val androidxComposeTooling = DependencyVersion.compose
}

object Test {
    const val junit = "junit:junit:${TestVersion.junit}"
    const val androidxJUnit = "androidx.test.ext:junit:${TestVersion.androidxJUnit}"
    const val androidxEspressoCore = "androidx.test.espresso:espresso-core:${TestVersion.androidxEspressoCore}"
    const val androidxComposeJUnit = "androidx.compose.ui:ui-test-junit4:${TestVersion.androidxComposeJUnit}"
    const val androidxComposeTooling = "androidx.compose.ui:ui-tooling:${TestVersion.androidxComposeTooling}"
}