plugins {
    application
    kotlin("jvm") version Dependencies.kotlinVersion
    id("com.squareup.wire") version Dependencies.wireVersion
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(Dependencies.kotlinReflect)
    implementation(Dependencies.wireGrpcClient)
    api(Dependencies.wireRuntime)
}

wire {
    sourcePath {
        srcDir("${rootProject.projectDir}/schema")
    }

    kotlin {
        rpcRole = "client"
        rpcCallStyle = "blocking"
        singleMethodServices = false
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
