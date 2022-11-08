package vtsen.hashnode.dev.buildutils

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast

class BuildExt {
    class VERSION {
        companion object {
            @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S)
            fun isDynamicColorSupported(): Boolean {
                return Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
            }
        }
    }
}