import org.gradle.kotlin.dsl.kotlin

object Dependencies {

    val kotlinVersion = "1.4.0"

    val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion"

    val grcpNetty = "io.grpc:grpc-netty:1.39.0"
    val grcpKotlinSub = "io.grpc:grpc-kotlin-stub:1.1.0"

    //val wireVersion = "3.7.0"
    val wireVersion = "4.0.0-alpha.5"

    val wireCompiler = "com.squareup.wire:wire-compiler:$wireVersion"
    val wireGradlePlugin = "com.squareup.wire:wire-gradle-plugin:$wireVersion"
    val wireGrpcClient = "com.squareup.wire:wire-grpc-client:$wireVersion"
    val wireMoshiAdapter = "com.squareup.wire:wire-moshi-adapter:$wireVersion"
    val wireReflector = "com.squareup.wire:wire-reflector:$wireVersion"
    val wireRuntime = "com.squareup.wire:wire-runtime:$wireVersion"
    val wireSchema = "com.squareup.wire:wire-schema:$wireVersion"
    val wireServerGenerator = "com.squareup.wire:wire-grpc-server-generator:$wireVersion"
}
