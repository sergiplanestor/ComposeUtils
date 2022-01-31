plugins {
    appPlugins().forEach(::id)
}

android {

    applyAppDefaultConfig()

    applySigningConfig(
        SigningData(
            name = release,
            keystore = file("app_keystore.jks"),
            keystorePassword = "ComposeUtils25012022!:)*",
            alias = "release_sign_key",
            password = "ComposeUtils25012022!:)*"
        )
    )

    applyAppFlavors()

    applyCompileOptions()

    kotlinOptions { jvmTarget() }

    excludeCommonPackages()
}

dependencies {

    androidCore()
    androidRuntime()

    compose()

    test()
}