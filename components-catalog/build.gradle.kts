plugins {
    libPlugins().forEach(::id)
}

android {
    applyLibModuleDefaultConfig()

    applyLibFlavors()

    applyCompileOptions()

    kotlinOptions { jvmTarget() }

    withFeatures(Feature.Compose)

    composeOptions { kotlinCompilerExtensionVersion = DependencyVersion.compose }

    excludeCommonPackages()
}

dependencies {

    module(name = "core")
    module(name = "components")

    androidCore()
    androidRuntime()
    androidExtensions()
    androidViewModel()

    ktxCoroutines()

    compose()

    test()
}