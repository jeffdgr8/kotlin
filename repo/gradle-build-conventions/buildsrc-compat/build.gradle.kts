buildscript {
    // workaround for KGP build metrics reports: https://github.com/gradle/gradle/issues/20001
    project.extensions.extraProperties["kotlin.build.report.output"] = null

    val gsonVersion = libs.versions.gson.get()
    configurations.all {
        resolutionStrategy.eachDependency {
            if (requested.group == "com.google.code.gson" && requested.name == "gson") {
                useVersion(gsonVersion)
                because("Force using same gson version because of https://github.com/google/gson/pull/1991")
            }
        }
    }
}

logger.info("buildSrcKotlinVersion: " + extra["bootstrapKotlinVersion"])
logger.info("buildSrc kotlin compiler version: " + org.jetbrains.kotlin.config.KotlinCompilerVersion.VERSION)
logger.info("buildSrc stdlib version: " + KotlinVersion.CURRENT)

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("org.jetbrains.kotlin.jvm")
}

gradlePlugin {
    plugins {
        register("jps-compatible") {
            id = "jps-compatible"
            implementationClass = "org.jetbrains.kotlin.pill.JpsCompatiblePlugin"
        }
        register("kotlin-build-publishing") {
            id = "kotlin-build-publishing"
            implementationClass = "plugins.KotlinBuildPublishingPlugin"
        }
    }
}

repositories {
    mavenCentral()
    google()
    maven("https://packages.jetbrains.team/maven/p/ij/intellij-dependencies")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-dependencies")
    gradlePluginPortal()

    extra["bootstrapKotlinRepo"]?.let {
        maven(url = it)
    }
}

kotlin {
    jvmToolchain(8)

    compilerOptions {
        allWarningsAsErrors.set(true)
        optIn.add("kotlin.ExperimentalStdlibApi")
        freeCompilerArgs.add("-Xsuppress-version-warnings")
    }
}

tasks.validatePlugins.configure {
    enabled = false
}

java {
    disableAutoTargetJvm()
}

dependencies {
    implementation(kotlin("stdlib", embeddedKotlinVersion))
    implementation("org.jetbrains.kotlin:kotlin-build-gradle-plugin:${kotlinBuildProperties.buildGradlePluginVersion}")
    implementation(libs.gradle.pluginPublish.gradlePlugin)
    implementation(libs.dokka.gradlePlugin)
    implementation(libs.spdx.gradlePlugin)
    implementation(libs.dexMemberList)

    implementation(libs.shadow.gradlePlugin) {
        // https://github.com/johnrengelman/shadow/issues/807
        exclude("org.ow2.asm")
    }
    implementation(libs.proguard.gradlePlugin)

    implementation(libs.jetbrains.ideaExt.gradlePlugin)

    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.cio)

    compileOnly(libs.gradle.enterprise.gradlePlugin)

    compileOnly(gradleApi())

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${project.bootstrapKotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${project.bootstrapKotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-reflect:${project.bootstrapKotlinVersion}")
    implementation(libs.gson)
    implementation(libs.kotlinx.metadataJvm)
}

tasks.register("checkBuild")
