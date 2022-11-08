package vtsen.hashnode.dev.buildutils.example.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import vtsen.hashnode.dev.buildutils.BuildExt
import vtsen.hashnode.dev.buildutils.example.ui.theme.NewEmptyComposeAppTheme

@Composable
fun MainScreen() {
    Text(text = "isDynamicColorSupported: ${BuildExt.VERSION.isDynamicColorSupported()}")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewEmptyComposeAppTheme(useSystemUIController = false) {
        MainScreen()
    }
}