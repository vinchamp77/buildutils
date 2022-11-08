package vtsen.hashnode.dev.buildext.example.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import vtsen.hashnode.dev.buildext.example.R
import vtsen.hashnode.dev.buildext.example.ui.theme.NewEmptyComposeAppTheme

@Composable
fun MainScreen() {
    Text(text = stringResource(id = R.string.hello_android))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewEmptyComposeAppTheme(useSystemUIController = false) {
        MainScreen()
    }
}