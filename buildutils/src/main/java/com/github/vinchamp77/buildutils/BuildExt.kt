package com.github.vinchamp77.buildutils

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast

class BuildExt {

    /* Reference: https://en.wikipedia.org/wiki/Android_version_history#Overview */
    class VERSION {
        companion object {

            /* API 33 - Android 13 (Tiramisu) */
            @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.TIRAMISU)
            fun isNotificationRuntimePermissionNeeded(): Boolean
                = Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU

            /* API 31 - Android 12 (Snow Cone) */
            @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S)
            fun isDynamicColorSupported(): Boolean
                = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

            /* API 26 - Android Oreo (Oatmeal Cookie) */
            @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.O)
            fun isNotificationChannelSupported(): Boolean
                    = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O

            /* API 23 - Android Marshmallow (Macadamia Nut Cookie) */
            @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.M)
            fun isFlagImmutableSupported(): Boolean
                = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
            @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.M)
            fun isShowRequestPermissionRationaleSupported(): Boolean
                = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
        }
    }
}