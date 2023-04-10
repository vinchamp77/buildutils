# BuildUtils Android Library
Simple Android build utilities to avoid hard coding build version code (API level) to improve code readability.

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
    implementation "com.github.vinchamp77:buildutils:0.0.6"
}
```
</details>
<details open>
  <summary>kotlin - build.gradle.kts</summary>

```gradle
dependencies {
    implementation("com.github.vinchamp77:buildutils:0.0.6")
}
```
</details>

## Usage
### Import
```kotlin
import com.github.vinchamp77.buildutils.BuildExt
```

### Examples
| APIs | App Examples |
| --- | --- |
| All APis demo | [MainScreen.kt](https://github.com/vinchamp77/buildutils/blob/master/example/src/main/java/vtsen/hashnode/dev/buildutils/example/ui/screens/MainScreen.kt) - Show all API usages|
| `BuildExt.VERSION.isDynamicColorSupported()`| [Theme.kt](https://github.com/vinchamp77/Demo_CleanEmptyCompose/blob/master/app/src/main/java/vtsen/hashnode/dev/newemptycomposeapp/ui/theme/Theme.kt) - Use dynamic color based on app's theme | 
| `BuildExt.VERSION.isNotificationRuntimePermissionNeeded()` | [MainScreen.kt](https://github.com/vinchamp77/AndroidNews/blob/master/app/src/main/java/vtsen/hashnode/dev/androidnews/ui/main/MainScreen.kt) - Show notification runtime permission dialog |
| `BuildExt.VERSION.isNotificationChannelSupported()`</br>`BuildExt.VERSION.isFlagImmutableSupported()` | [SyncWorker.kt](https://github.com/vinchamp77/AndroidNews/blob/master/app/src/main/java/vtsen/hashnode/dev/androidnews/app/workers/SyncWorker.kt)<br/>- Create pending intent flag</br>- Create notification channel |
