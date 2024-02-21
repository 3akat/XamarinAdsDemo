package mono.com.example.androidtvlibrary.main.adapter.player;


public class EGLSurfaceTexture_TextureImageListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.player.EGLSurfaceTexture.TextureImageListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFrameAvailable:()V:GetOnFrameAvailableHandler:Com.Example.Androidtvlibrary.Main.Adapter.Player.EGLSurfaceTexture/ITextureImageListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Player.EGLSurfaceTexture+ITextureImageListenerImplementor, PausedAdsAndroidTV.Binding", EGLSurfaceTexture_TextureImageListenerImplementor.class, __md_methods);
	}


	public EGLSurfaceTexture_TextureImageListenerImplementor ()
	{
		super ();
		if (getClass () == EGLSurfaceTexture_TextureImageListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Player.EGLSurfaceTexture+ITextureImageListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onFrameAvailable ()
	{
		n_onFrameAvailable ();
	}

	private native void n_onFrameAvailable ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
