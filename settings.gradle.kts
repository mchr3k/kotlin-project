pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = ("kotlinproject")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include(
    "library-kotlin"
)
