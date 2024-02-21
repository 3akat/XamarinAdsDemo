package mono.com.example.androidtvlibrary.main.adapter.player;


public class OrientationListener_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.player.OrientationListener.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onOrientationChange:([FF)V:GetOnOrientationChange_arrayFFHandler:Com.Example.Androidtvlibrary.Main.Adapter.Player.OrientationListener/IListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Player.OrientationListener+IListenerImplementor, PausedAdsAndroidTV.Binding", OrientationListener_ListenerImplementor.class, __md_methods);
	}


	public OrientationListener_ListenerImplementor ()
	{
		super ();
		if (getClass () == OrientationListener_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Player.OrientationListener+IListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onOrientationChange (float[] p0, float p1)
	{
		n_onOrientationChange (p0, p1);
	}

	private native void n_onOrientationChange (float[] p0, float p1);

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
