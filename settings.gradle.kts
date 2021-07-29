rootProject.name = "wire-protobuf-grpc-poc"

include("server")
include("client")

pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.squareup.wire") {
                useModule("com.squareup.wire:wire-gradle-plugin:${requested.version}")
            }
        }
    }

    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}
