import org.gradle.api.Project
import org.gradle.api.component.SoftwareComponent
import org.gradle.api.publish.PublicationContainer
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.create

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