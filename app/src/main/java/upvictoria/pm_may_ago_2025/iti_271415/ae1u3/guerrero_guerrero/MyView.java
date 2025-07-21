package upvictoria.pm_may_ago_2025.iti_271415.ae1u3.guerrero_guerrero;


import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyView extends GLSurfaceView {
    private final MyRenderer mRenderer;

    public MyView(Context context) {
        super(context);
        setEGLContextClientVersion(2); // OpenGL ES 2.0
        mRenderer = new MyRenderer();
        setRenderer(mRenderer);
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
