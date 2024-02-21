package mono.com.example.androidtvlibrary.main.adapter.player;


public class TimeBar_OnScrubListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.player.TimeBar.OnScrubListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onScrubMove:(Lcom/example/androidtvlibrary/main/adapter/player/TimeBar;J)V:GetOnScrubMove_Lcom_example_androidtvlibrary_main_adapter_player_TimeBar_JHandler:Com.Example.Androidtvlibrary.Main.Adapter.Player.ITimeBarOnScrubListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"n_onScrubStart:(Lcom/example/androidtvlibrary/main/adapter/player/TimeBar;J)V:GetOnScrubStart_Lcom_example_androidtvlibrary_main_adapter_player_TimeBar_JHandler:Com.Example.Androidtvlibrary.Main.Adapter.Player.ITimeBarOnScrubListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"n_onScrubStop:(Lcom/example/androidtvlibrary/main/adapter/player/TimeBar;JZ)V:GetOnScrubStop_Lcom_example_androidtvlibrary_main_adapter_player_TimeBar_JZHandler:Com.Example.Androidtvlibrary.Main.Adapter.Player.ITimeBarOnScrubListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Player.ITimeBarOnScrubListenerImplementor, PausedAdsAndroidTV.Binding", TimeBar_OnScrubListenerImplementor.class, __md_methods);
	}


	public TimeBar_OnScrubListenerImplementor ()
	{
		super ();
		if (getClass () == TimeBar_OnScrubListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Player.ITimeBarOnScrubListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onScrubMove (com.example.androidtvlibrary.main.adapter.player.TimeBar p0, long p1)
	{
		n_onScrubMove (p0, p1);
	}

	private native void n_onScrubMove (com.example.androidtvlibrary.main.adapter.player.TimeBar p0, long p1);


	public void onScrubStart (com.example.androidtvlibrary.main.adapter.player.TimeBar p0, long p1)
	{
		n_onScrubStart (p0, p1);
	}

	private native void n_onScrubStart (com.example.androidtvlibrary.main.adapter.player.TimeBar p0, long p1);


	public void onScrubStop (com.example.androidtvlibrary.main.adapter.player.TimeBar p0, long p1, boolean p2)
	{
		n_onScrubStop (p0, p1, p2);
	}

	private native void n_onScrubStop (com.example.androidtvlibrary.main.adapter.player.TimeBar p0, long p1, boolean p2);

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
