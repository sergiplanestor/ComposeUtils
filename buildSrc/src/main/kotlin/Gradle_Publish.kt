import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.component.SoftwareComponent
import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.publish.PublicationContainer
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.provideDelegate

private val group: String by lazy { "com.github.sergiplanestor" }

private fun Project.publishing(configure: Action<PublishingExtension>): Unit =
    (this as ExtensionAware).extensions.configure("publishing", configure)

fun Project.publish(src: Any) {
    afterEvaluate {
        publishing {
            publications {
                release(this, src)
                debug(this, src)
            }
        }
    }
}

fun Project.release(container: PublicationContainer, src: Any) {
    container.create<MavenPublication>("release-${project.name}") {
        applyPublishConfig(this@release, src, isDebug = false)
    }
}

fun Project.debug(container: PublicationContainer, src: Any) {
    container.create<MavenPublication>("debug-${project.name}") {
        applyPublishConfig(this@debug, src, isDebug = true)
    }
}

private fun Project.artifactId(isDebug: Boolean): String =
    project.name + if (isDebug) "-debug" else ""

private fun Project.components(isDebug: Boolean): SoftwareComponent? =
    components.find { it.name == (if (isDebug) "debug-" else "release-") + name }

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
