plugins {
    libPlugins(GradlePlugin.Publish).forEach(::id)
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

    androidCore()
    androidRuntime()

    compose()

    test()
}

afterEvaluate {
    publishing {
        publications {
            release {
                from(releaseComponent)
                groupId = artifactGroup
                artifactId = artifactId(isDebug = false)
                version = artifactVersion
            }
            debug {
                from(debugComponent)
                groupId = artifactGroup
                artifactId = artifactId(isDebug = true)
                version = artifactVersion
            }
        }
    }
}