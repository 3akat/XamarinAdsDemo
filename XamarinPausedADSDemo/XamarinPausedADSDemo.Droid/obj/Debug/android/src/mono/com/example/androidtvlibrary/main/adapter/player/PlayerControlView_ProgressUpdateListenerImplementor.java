package mono.com.example.androidtvlibrary.main.adapter.player;


public class PlayerControlView_ProgressUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.player.PlayerControlView.ProgressUpdateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onProgressUpdate:(JJ)V:GetOnProgressUpdate_JJHandler:Com.Example.Androidtvlibrary.Main.Adapter.Player.PlayerControlView/IProgressUpdateListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Player.PlayerControlView+IProgressUpdateListenerImplementor, PausedAdsAndroidTV.Binding", PlayerControlView_ProgressUpdateListenerImplementor.class, __md_methods);
	}


	public PlayerControlView_ProgressUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == PlayerControlView_ProgressUpdateListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Player.PlayerControlView+IProgressUpdateListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onProgressUpdate (long p0, long p1)
	{
		n_onProgressUpdate (p0, p1);
	}

	private native void n_onProgressUpdate (long p0, long p1);

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
