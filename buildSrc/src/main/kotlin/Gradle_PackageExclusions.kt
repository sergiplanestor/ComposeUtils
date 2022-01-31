val commonPackageExcluded: List<String> by lazy {
    listOf(
        "META-INF/NOTICE.txt",
        "META-INF/LICENSE.txt",
        "META-INF/LICENSE",
        "META-INF/licenses/**",
        "META-INF/AL2.0",
        "META-INF/LGPL2.1",
        "META-INF/*.kotlin_module",
        "**/attach_hotspot_windows.dll",
    )
}

fun <T : BF, U : BT, V : DC, W : PF> CExt<T, U, V, W>.excludePackages(vararg values: String) {
    packagingOptions {
        resources {
            excludes.addAll(values.toList())
        }
    }
}

fun <T : BF, U : BT, V : DC, W : PF> CExt<T, U, V, W>.excludeCommonPackages(vararg values: String) {
    values.toMutableList()
        .apply { commonPackageExcluded.filter { c -> !contains(c) }.run(::addAll) }
        .toTypedArray()
        .run { excludePackages(*this) }
}