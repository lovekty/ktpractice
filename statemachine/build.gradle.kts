plugins {
    alias { libs.plugins.kotlin.jvm }
    alias { libs.plugins.kotlin.plugin.spring }
    alias { libs.plugins.springboot }
}

dependencies {
    implementation(libs.springboot.base)
    implementation(libs.springboot.actuator)
    implementation(libs.spring.statemachine.starter) {
        exclude(group = "org.springframework.boot")
    }
    implementation("org.springframework.statemachine:spring-statemachine-data-mongodb:4.0.0")
}
