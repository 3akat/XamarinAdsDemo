package mono.com.example.androidtvlibrary.main.adapter.player;


public class AudioSink_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.player.AudioSink.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAudioSessionId:(I)V:GetOnAudioSessionId_IHandler:Com.Example.Androidtvlibrary.Main.Adapter.Player.IAudioSinkListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"n_onPositionDiscontinuity:()V:GetOnPositionDiscontinuityHandler:Com.Example.Androidtvlibrary.Main.Adapter.Player.IAudioSinkListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"n_onUnderrun:(IJJ)V:GetOnUnderrun_IJJHandler:Com.Example.Androidtvlibrary.Main.Adapter.Player.IAudioSinkListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Player.IAudioSinkListenerImplementor, PausedAdsAndroidTV.Binding", AudioSink_ListenerImplementor.class, __md_methods);
	}


	public AudioSink_ListenerImplementor ()
	{
		super ();
		if (getClass () == AudioSink_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Player.IAudioSinkListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onAudioSessionId (int p0)
	{
		n_onAudioSessionId (p0);
	}

	private native void n_onAudioSessionId (int p0);


	public void onPositionDiscontinuity ()
	{
		n_onPositionDiscontinuity ();
	}

	private native void n_onPositionDiscontinuity ();


	public void onUnderrun (int p0, long p1, long p2)
	{
		n_onUnderrun (p0, p1, p2);
	}

	private native void n_onUnderrun (int p0, long p1, long p2);

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
