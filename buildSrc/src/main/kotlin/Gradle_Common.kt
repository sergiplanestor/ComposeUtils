import com.android.build.api.dsl.BuildFeatures
import com.android.build.api.dsl.BuildType
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.DefaultConfig
import com.android.build.api.dsl.ProductFlavor
import org.gradle.api.JavaVersion
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions

typealias Plugins = GradlePlugin
internal typealias BF = BuildFeatures
internal typealias BT = BuildType
internal typealias DC = DefaultConfig
internal typealias PF = ProductFlavor
internal typealias CExt<T, U, V, W> = CommonExtension<T, U, V, W>

fun KotlinJvmOptions.jvmTarget(target: String = "11") {
    jvmTarget = target
}

fun <T : BF, U : BT, V : DC, W : PF> CExt<T, U, V, W>.applyCompileOptions() {
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}