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
    implementation(Dependencies.grcpNetty)
    implementation(Dependencies.grcpKotlinSub)
    implementation(Dependencies.wireServerGenerator)
    api(Dependencies.wireRuntime)
}

wire {
    sourcePath {
        srcDir("${rootProject.projectDir}/schema")
    }

    kotlin {
        rpcRole = "server"
        rpcCallStyle = "blocking"
        singleMethodServices = false
        grpcServerCompatible = true
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
