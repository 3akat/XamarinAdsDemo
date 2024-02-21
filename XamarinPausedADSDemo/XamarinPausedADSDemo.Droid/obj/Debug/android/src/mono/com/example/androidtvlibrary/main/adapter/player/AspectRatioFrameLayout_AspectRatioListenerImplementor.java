package mono.com.example.androidtvlibrary.main.adapter.player;


public class AspectRatioFrameLayout_AspectRatioListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.player.AspectRatioFrameLayout.AspectRatioListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAspectRatioUpdated:(FFZ)V:GetOnAspectRatioUpdated_FFZHandler:Com.Example.Androidtvlibrary.Main.Adapter.Player.AspectRatioFrameLayout/IAspectRatioListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Player.AspectRatioFrameLayout+IAspectRatioListenerImplementor, PausedAdsAndroidTV.Binding", AspectRatioFrameLayout_AspectRatioListenerImplementor.class, __md_methods);
	}


	public AspectRatioFrameLayout_AspectRatioListenerImplementor ()
	{
		super ();
		if (getClass () == AspectRatioFrameLayout_AspectRatioListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Player.AspectRatioFrameLayout+IAspectRatioListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onAspectRatioUpdated (float p0, float p1, boolean p2)
	{
		n_onAspectRatioUpdated (p0, p1, p2);
	}

	private native void n_onAspectRatioUpdated (float p0, float p1, boolean p2);

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
