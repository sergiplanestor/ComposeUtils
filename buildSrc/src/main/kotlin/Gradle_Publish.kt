import com.android.build.gradle.BaseExtension
import org.gradle.api.Action
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.component.SoftwareComponent
import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.plugins.JavaBasePlugin
import org.gradle.api.publish.PublicationContainer
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.creating
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.provideDelegate
import java.io.File

private val group: String by lazy { "com.github.sergiplanestor" }

private val Project.android: BaseExtension
    get() = (this as ExtensionAware).extensions.getByName("android") as BaseExtension

private inline val DefaultTask.srcFiles: Set<File>
    get() = project.android.sourceSets.getByName("main").java.srcDirs

private inline val Project.srcJar: Jar
    get() {
        val jar by tasks.creating(Jar::class) {
            group = JavaBasePlugin.DOCUMENTATION_GROUP
            description = "Assembles sources JAR"
            archiveClassifier.set("sources")
            from(srcFiles)
        }
        return jar
    }

private fun Project.publishing(configure: Action<PublishingExtension>): Unit =
    (this as ExtensionAware).extensions.configure("publishing", configure)

fun Project.publish() {
    afterEvaluate {
        publishing {
            publications {
                val src = srcJar
                release(this, src)
                debug(this, src)
            }
        }
    }
}

fun Project.release(container: PublicationContainer, src: Any) {
    //container.create<MavenPublication>("release-${project.name}") {
    container.create<MavenPublication>("release") {
        applyPublishConfig(this@release, src, isDebug = false)
    }
}

fun Project.debug(container: PublicationContainer, src: Any) {
    //container.create<MavenPublication>("debug-${project.name}") {
    container.create<MavenPublication>("debug") {
        applyPublishConfig(this@debug, src, isDebug = true)
    }
}

private fun Project.artifactId(isDebug: Boolean): String =
    project.name + if (isDebug) "-debug" else ""

private fun Project.components(isDebug: Boolean): SoftwareComponent? =
    //components.find { it.name == (if (isDebug) "debug-" else "release-") + name }
    components.getByName(if (isDebug) "debug" else "release")

fun MavenPublication.applyPublishConfig(
    project: Project,
    src: Any,
    isDebug: Boolean
) {
    from(project.components(isDebug))
    artifact(src)

    groupId = group
    artifactId = project.artifactId(isDebug)
    version = BuildVersion.name
}
