plugins {
    alias { libs.plugins.kotlin.jvm }
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
//    implementation(libs.springboot.base)
    implementation(libs.jackson.module.kotlin)
    testImplementation(libs.kotlin.test.junit5)
}

kotlin {
    jvmToolchain(17)
}

abstract class GreetingToFileTask : DefaultTask() {

    @get:OutputFile
    abstract val destination: RegularFileProperty

    @TaskAction
    fun greet() {
        val file = destination.get().asFile
        file.parentFile.mkdirs()
        file.writeText("Hello!")
    }
}

val greetingFile = objects.fileProperty()

tasks.register<GreetingToFileTask>("greet") {
    destination.set(greetingFile)
}

tasks.register("sayGreeting") {
    dependsOn("greet")
    val greetingFile = greetingFile
    doLast {
        val file = greetingFile.get().asFile
        println("${file.readText()} (file: ${file.name})")
    }
}

greetingFile.set(layout.buildDirectory.file("hello.txt"))