package upvictoria.pm_may_ago_2025.iti_271415.ae1u3.guerrero_guerrero


import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun OpenGLScreen() {
    val context = LocalContext.current
    AndroidView(factory = { MyView(context) })
}
