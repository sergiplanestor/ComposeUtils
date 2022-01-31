enum class Feature {
    DataBinding,
    ViewBinding,
    Compose
}

fun <T : BF, U : BT, V : DC, W : PF> CExt<T, U, V, W>.withFeatures(vararg features: Feature) {
    buildFeatures {
        features.forEach {
            when (it) {
                Feature.DataBinding -> {
                    if (this is com.android.build.api.dsl.LibraryBuildFeatures) {
                        dataBinding = true
                    } else {
                        dataBinding { isEnabled = true }
                    }
                }
                Feature.ViewBinding -> {
                    viewBinding = true
                }
                Feature.Compose -> {
                    compose = true
                }
            }
        }
    }
}