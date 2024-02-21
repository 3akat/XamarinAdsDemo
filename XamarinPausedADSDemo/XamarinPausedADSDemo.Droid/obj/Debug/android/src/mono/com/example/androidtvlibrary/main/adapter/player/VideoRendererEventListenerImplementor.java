package mono.com.example.androidtvlibrary.main.adapter.player;


public class VideoRendererEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.player.VideoRendererEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Player.IVideoRendererEventListenerImplementor, PausedAdsAndroidTV.Binding", VideoRendererEventListenerImplementor.class, __md_methods);
	}


	public VideoRendererEventListenerImplementor ()
	{
		super ();
		if (getClass () == VideoRendererEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Player.IVideoRendererEventListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}

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
