import com.android.build.api.dsl.VariantDimension
import com.android.build.api.dsl.BuildType
import com.android.build.api.dsl.ApplicationBuildType
import com.android.build.api.dsl.LibraryBuildType
import com.android.build.gradle.LibraryExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import java.io.File

private fun <T : BF, U : BT, V : DC, W : PF> CExt<T, U, V, W>.proguardDefaultFile(): File =
    getDefaultProguardFile("proguard-android-optimize.txt")

private fun VariantDimension.defineProguardFiles(file: File) {
    proguardFiles(file, "proguard-rules.pro")
}

val release: String by lazy { "release" }
val debug: String by lazy { "debug" }

class Flavor(
    val name: String,
    val isMinifyEnabled: Boolean,
    val isDebuggable: Boolean,
    val suffix: String? = null,
    val signingConfigName: String? = null,
    val isRelease: Boolean = false,
    val isDebug: Boolean = false,
    val extraConfig: BuildType.() -> Unit = {}
) {
    companion object {
        fun release(
            name: String = release,
            isMinifyEnabled: Boolean = true,
            isDebuggable: Boolean = false,
            suffix: String? = null,
            signingConfigName: String? = release,
            extraConfig: BuildType.() -> Unit = {}
        ): Flavor = Flavor(
            name = name,
            isMinifyEnabled = isMinifyEnabled,
            isDebuggable = isDebuggable,
            suffix = suffix,
            signingConfigName = signingConfigName,
            isRelease = true,
            isDebug = false,
            extraConfig = extraConfig
        )

        fun debug(
            name: String = debug,
            isMinifyEnabled: Boolean = false,
            isDebuggable: Boolean = true,
            suffix: String? = "develop",
            signingConfigName: String? = null,
            extraConfig: BuildType.() -> Unit = {}
        ): Flavor = Flavor(
            name = name,
            isMinifyEnabled = isMinifyEnabled,
            isDebuggable = isDebuggable,
            suffix = suffix,
            signingConfigName = signingConfigName,
            isRelease = false,
            isDebug = true,
            extraConfig = extraConfig
        )

    }
}

fun <T : BF, U : BT, V : DC, W : PF> CExt<T, U, V, W>.flavors(isApp: Boolean, vararg flavors: Flavor) {
    buildTypes {
        flavors.forEach { flavor ->
            val block: (U, Flavor) -> Unit = { buildType, data ->
                buildType.run {
                    when (this) {
                        is ApplicationBuildType -> {
                            data.suffix?.let {
                                applicationIdSuffix = if (it.startsWith(".")) it else ".$it"
                            }
                            isDebuggable = data.isDebuggable
                            data.signingConfigName?.let {
                                signingConfig = signingConfigs.getByName(it)
                            }
                        }
                        is LibraryBuildType -> {
                            data.signingConfigName?.let {
                                signingConfig = signingConfigs.getByName(it)
                            }
                        }
                    }
                    isMinifyEnabled = data.isMinifyEnabled
                    defineProguardFiles(proguardDefaultFile())
                    data.extraConfig.invoke(this)
                }
            }
            if (flavor.isDebug || flavor.isRelease) {
                named(flavor.name) { block(this, flavor) }
            } else {
                create(flavor.name) { block(this, flavor) }
            }
        }
    }
}

fun BaseAppModuleExtension.applyAppFlavors(
    releaseSigningName: String? = null,
    debugSigningName: String? = null
) {
    flavors(
        isApp = true,
        Flavor.release(signingConfigName = releaseSigningName),
        Flavor.debug(signingConfigName = debugSigningName)
    )
}

fun LibraryExtension.applyLibFlavors() {
    flavors(
        isApp = false,
        Flavor.release(signingConfigName = null),
        Flavor.debug(signingConfigName = null, suffix = null)
    )
}