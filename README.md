# BuildUtils Android Library
Simple Android build utilities to avoid hard coding and improve code readability.

Instead of hard coding like this,
```kotlin
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
    /*...*/
}
```
you can use `BuildExt`
```kotlin
if (BuildExt.VERSION.isDynamicColorSupported()) {
    /*...*/
}
```
to provide better code readability.

## Setup
### 1. Import JitPack Android Library
Add `maven { url 'https://jitpack.io' }` in
<details open>
  <summary>groovy - settings.gradle</summary>

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven { url 'https://jitpack.io' }
    }
}
```
</details>

<details open>
  <summary>kotlin - settings.gradle.kts</summary>

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven ("https://jitpack.io")
    }
}
```
</details>

### 2. Add dependency
<details open>
  <summary>groovy - build.gradle</summary>

```gradle
dependencies {
    implementation "com.github.vinchamp77:buildutils:0.0.3"
}
```
</details>
<details open>
  <summary>kotlin - build.gradle.kts</summary>

```gradle
dependencies {
    implementation("com.github.vinchamp77:buildutils:0.0.3")
}
```
</details>

## Usage
### Import
```kotlin
import vtsen.hashnode.dev.buildutils.BuildExt
```

### Examples
#### Check Dynamic Color Support

```kotlin
if (BuildExt.VERSION.isDynamicColorSupported()) {
    /*...*/
}
```
