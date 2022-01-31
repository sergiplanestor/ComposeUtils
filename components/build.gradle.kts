plugins {
    libPlugins(/*GradlePlugin.Publish*/).forEach(::id)
}

android {
    applyLibModuleDefaultConfig()

    applyLibFlavors()

    applyCompileOptions()

    kotlinOptions { jvmTarget() }

    withFeatures(Feature.Compose)

    composeOptions { kotlinCompilerExtensionVersion = DependencyVersion.compose }

    excludeCommonPackages()

    /*println("Lib: Components ---------------------")
    components.forEach {
        println(it.name)
    }
    println("---------------------")*/
}

dependencies {

    module(name = "core")
    module(name = "compose-utils")
    implementation(project(":core")) {

    }

    androidCore()
    androidRuntime()
    androidExtensions()
    androidViewModel()

    ktxCoroutines()

    compose()

    test()
}

/*
val srcJar by tasks.creating(Jar::class) {
    group = JavaBasePlugin.DOCUMENTATION_GROUP
    description = "Assembles sources JAR"
    archiveClassifier.set("sources")
    from(project.android.sourceSets.getByName("main").java.srcDirs)
}

artifacts { archives(srcJar) }

publish(srcJar)*/
