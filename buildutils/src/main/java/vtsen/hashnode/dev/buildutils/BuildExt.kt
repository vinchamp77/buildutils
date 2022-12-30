package vtsen.hashnode.dev.buildutils

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast

class BuildExt {

    /* Reference: https://en.wikipedia.org/wiki/Android_version_history#Overview */
    class VERSION {
        companion object {

            /* Android 13 - Tiramisu - API 33 */
            @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.TIRAMISU)
            fun isRuntimePermissionSupported(): Boolean
                = Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU

            /* Android 12 - Snow Cone - API 31 */
            @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S)
            fun isDynamicColorSupported(): Boolean
                = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

        }
    }
}