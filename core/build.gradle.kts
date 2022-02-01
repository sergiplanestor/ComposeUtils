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

val srcJar by tasks.creating(Jar::class) {
    archiveClassifier.set("sources")
    from(android.sourceSets.getByName("main").java.srcDirs)
}

publish(srcJar)
