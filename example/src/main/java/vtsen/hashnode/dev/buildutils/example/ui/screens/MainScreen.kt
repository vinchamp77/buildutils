package vtsen.hashnode.dev.buildutils.example.ui.screens

import android.os.Build
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.github.vinchamp77.buildutils.BuildExt
import vtsen.hashnode.dev.buildutils.example.ui.theme.BuildUtilsExampleAppTheme

@Composable
fun MainScreen() {
    Column {
        Text(text = "App API Level (SDK Version): ${Build.VERSION.SDK_INT}")
        Text(text = "isNotificationRuntimePermissionNeeded: ${BuildExt.VERSION.isNotificationRuntimePermissionNeeded()}")
        Text(text = "isDynamicColorSupported: ${BuildExt.VERSION.isDynamicColorSupported()}")
        Text(text = "isNotificationChannelSupported: ${BuildExt.VERSION.isNotificationChannelSupported()}")
        Text(text = "isFlagImmutableSupported: ${BuildExt.VERSION.isFlagImmutableSupported()}")
        Text(text = "isShowRequestPermissionRationaleSupported: ${BuildExt.VERSION.isShowRequestPermissionRationaleSupported()}")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BuildUtilsExampleAppTheme(useSystemUIController = false) {
        MainScreen()
    }
}