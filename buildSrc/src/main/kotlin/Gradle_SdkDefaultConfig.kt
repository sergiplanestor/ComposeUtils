import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension

fun BaseAppModuleExtension.applyAppDefaultConfig() {
    compileSdk = SdkConfig.compile
    buildToolsVersion = SdkConfig.buildTools
    defaultConfig {
        applicationId = SdkConfig.appId
        minSdk = SdkConfig.min
        compileSdk = SdkConfig.compile
        targetSdk = SdkConfig.target
        versionCode = BuildVersion.code
        versionName = BuildVersion.name
        testInstrumentationRunner = SdkConfig.instrumentationRunner
        vectorDrawables { useSupportLibrary = true }
    }
}

fun LibraryExtension.applyLibModuleDefaultConfig() {
    compileSdk = SdkConfig.compile
    defaultConfig {
        minSdk = SdkConfig.min
        compileSdk = SdkConfig.compile
        targetSdk = SdkConfig.target
        testInstrumentationRunner = SdkConfig.instrumentationRunner
        vectorDrawables { useSupportLibrary = true }
        consumerProguardFiles("consumer-rules.pro")
    }
}