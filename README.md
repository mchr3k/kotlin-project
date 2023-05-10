# kotlinproject

This was generated from [kotlin-android-template](https://github.com/cortinico/kotlin-android-template).

Key changes:

* Remove Android parts of the project
* Fix gradle exception:

```
Execution failed for task ':buildSrc:compileKotlin'.
> 'compileJava' task (current target is 20) and 'compileKotlin' task (current target is 17) jvm target compatibility should be set to the same Java version.
  Consider using JVM toolchain: https://kotl.in/gradle/jvm/toolchain
```

* Cleanup libs.versions.toml - remove unused dokka
* Upgrade `org.jlleitschuh.gradle.ktlint` to pickup the fix to this error:

```
org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':library-kotlin:runKtlintFormatOverMainSourceSet'.
Caused by: org.gradle.workers.internal.DefaultWorkerExecutor$WorkExecutionException: A failure occurred while executing org.jlleitschuh.gradle.ktlint.worker.KtLintWorkAction
Caused by: java.lang.ExceptionInInitializerError
Caused by: java.lang.reflect.InaccessibleObjectException: Unable to make field private transient java.lang.Object java.lang.Throwable.backtrace accessible: module java.base does not "opens java.lang" to unnamed module @2d72d8b1
```

* Remove `io.gitlab.arturbosch.detekt:detekt-formatting` and integrate directly with `ktlint`
* Add `com.github.jakemarsden.git-hooks` for pre-commit hooks
* Regenerate `.gitignore`
  using https://www.toptal.com/developers/gitignore?templates=java,linux,macos,gradle,kotlin,windows,intellij to remove
  android and add intellij settings
* Check in idea settings files

## Project Structure

The project includes one sub-projects, each in their own subdirectories:

- **`library-kotlin`:** The source for a UI-less Kotlin library.

The following additional top-level directories configure & support building the app & projects:

- **`buildSrc`:** Contains shared Gradle logic
  as [precompiled script plugins](https://docs.gradle.org/current/userguide/custom_plugins.html#sec:precompiled_plugins)
- **`config`:** Contains the [Detekt configuration file](https://detekt.dev/docs/introduction/configurations/).
- **`gradle`:** Contains Gradle Configuration files such as the Gradle Version Catalog and
  the [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html).

Finally, the following hidden top-level directories provide functionality for specific development systems:

- **`.github`:** Defines the [Github Actions](https://github.com/features/actions) CI tasks and templates for new pull
  requests, issues, etc.
- **`.idea`:** Sets common initial project settings when the project is opened
  in [Android Studio](https://developer.android.com/studio) or [IntelliJ IDEA](https://www.jetbrains.com/idea/).

## Contributing 🤝

Feel free to open a issue or submit a pull request for any bugs/improvements.