import org.gradle.api.Project
import org.gradle.api.component.SoftwareComponent
import org.gradle.api.publish.PublicationContainer
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.create

//import org.gradle.api.Action
//import org.gradle.api.plugins.JavaBasePlugin
//import org.gradle.api.publish.PublishingExtension
//import org.gradle.api.publish.maven.MavenPublication
//import org.gradle.api.tasks.bundling.Jar
//import org.gradle.kotlin.dsl.create
//import org.gradle.api.Project
//import org.gradle.api.plugins.ExtensionAware
//import org.gradle.api.DefaultTask
//import org.gradle.api.component.SoftwareComponent
//import org.gradle.api.publish.PublicationContainer
//import com.android.build.gradle.BaseExtension
//import org.gradle.kotlin.dsl.creating
//import org.gradle.kotlin.dsl.get
//import org.gradle.kotlin.dsl.provideDelegate
//import java.io.File
//import org.gradle.kotlin.dsl.getValue
//
//private val group: String by lazy { "com.github.sergiplanestor" }
//private var pubJar: Jar? = null
//
//private val Project.android: BaseExtension
//    get() = (this as ExtensionAware).extensions.getByName("android") as BaseExtension
//
//private inline val DefaultTask.srcFiles: Set<File>
//    get() = project.android.sourceSets.getByName("main").java.srcDirs
//
//private inline val Project.srcJar: Jar
//    get() = pubJar ?: run {
//        val jar by tasks.creating(Jar::class) {
//            group = JavaBasePlugin.DOCUMENTATION_GROUP
//            description = "Assembles sources JAR"
//            archiveClassifier.set("sources")
//            from(srcFiles)
//        }
//        jar.also { pubJar = it }
//    }
//
//private fun Project.publishing(configure: Action<PublishingExtension>): Unit =
//    (this as ExtensionAware).extensions.configure("publishing", configure)
//
//
//fun Project.publish() {
//
//    //artifacts { add("archives", srcJar) }
//
//    afterEvaluate {
//        publishing {
//            publications {
//                release(this)
//                debug(this)
//            }
//        }
//    }
//
//    pubJar = null
//}
//
//private fun Project.release(container: PublicationContainer) {
//    container.create<MavenPublication>("release") {
//        applyPublishConfig(this@release, isDebug = false)
//    }
//}
//
//private fun Project.debug(container: PublicationContainer) {
//    container.create<MavenPublication>("debug") {
//        applyPublishConfig(this@debug, isDebug = true)
//    }
//}
//
//private fun Project.artifactId(isDebug: Boolean): String =
//    project.name + if (isDebug) "-debug" else ""
//
//private fun Project.components(isDebug: Boolean): SoftwareComponent =
//    components[if (isDebug) "debug" else "release"]
//
//private fun MavenPublication.applyPublishConfig(
//    project: Project,
//    isDebug: Boolean
//) {
//    from(project.components(isDebug))
//    artifact(project.srcJar)
//
//    groupId = group
//    artifactId = project.artifactId(isDebug)
//    version = BuildVersion.name
//}

fun PublicationContainer.publication(name: String, pub: MavenPublication.() -> Unit) {
    create<MavenPublication>(name) { pub() }
}

fun PublicationContainer.release(pub: MavenPublication.() -> Unit) {
    publication("release", pub)
}

fun PublicationContainer.debug(pub: MavenPublication.() -> Unit) {
    publication("debug", pub)
}

fun Project.componentOf(name: String): SoftwareComponent =
    components.getByName(name)

val Project.releaseComponent: SoftwareComponent get() { return componentOf("release") }

val Project.debugComponent: SoftwareComponent get() { return componentOf("release") }

val Project.artifactGroup: String by lazy { "com.github.sergiplanestor" }

val Project.artifactVersion: String by lazy { BuildVersion.name }

fun Project.artifactId(isDebug: Boolean): String = project.name + if (isDebug) "-debug" else ""