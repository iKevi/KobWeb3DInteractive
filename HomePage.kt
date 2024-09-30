import kotlinx.browser.window
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage() {
    val scope = MainScope()
    var message by remember { mutableStateOf("Loading...") }

    LaunchedEffect(Unit) {
        scope.launch {
            val response = window.fetch("http://localhost:8080/hello").await()
            message = response.text().await()
        }
    }

    Text(message)
    // The rest of your 3D scene code
}
