// OpenGLScreen.kt
package upvictoria.pm_may_ago_2025.iti_271415.ae1u3.guerrero_guerrero

import android.opengl.GLSurfaceView
import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun OpenGLScreen() {
    AndroidView(factory = { context ->
        GLSurfaceView(context).apply {
            setEGLContextClientVersion(2)
            setRenderer(MyRenderer())
            renderMode = GLSurfaceView.RENDERMODE_CONTINUOUSLY
        }
    })
}
