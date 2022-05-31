plugins {
    id("java")
    id("test")
}

val version = "1.0.0" by get("somevar")

projects {
    group("com.somepackage")
    version(version)

    +"project"
    +"projectBut2"
}

dependencies {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    package("org.ow2.asm:asm:9.2")
    // Plugin added function
    test("junit:junit:4.13.2")
}

tasks {
    compileJava {
        // task.dependsOn(...)
        java.encoding.set(Encoding.UTF_8)
    }
}