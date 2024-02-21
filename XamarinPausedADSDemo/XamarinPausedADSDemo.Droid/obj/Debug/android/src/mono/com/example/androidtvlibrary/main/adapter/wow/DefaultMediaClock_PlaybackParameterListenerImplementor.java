package mono.com.example.androidtvlibrary.main.adapter.wow;


public class DefaultMediaClock_PlaybackParameterListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.wow.DefaultMediaClock.PlaybackParameterListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPlaybackParametersChanged:(Lcom/example/androidtvlibrary/main/adapter/wow/PlaybackParameters;)V:GetOnPlaybackParametersChanged_Lcom_example_androidtvlibrary_main_adapter_wow_PlaybackParameters_Handler:Com.Example.Androidtvlibrary.Main.Adapter.Wow.DefaultMediaClock/IPlaybackParameterListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Wow.DefaultMediaClock+IPlaybackParameterListenerImplementor, PausedAdsAndroidTV.Binding", DefaultMediaClock_PlaybackParameterListenerImplementor.class, __md_methods);
	}


	public DefaultMediaClock_PlaybackParameterListenerImplementor ()
	{
		super ();
		if (getClass () == DefaultMediaClock_PlaybackParameterListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Wow.DefaultMediaClock+IPlaybackParameterListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onPlaybackParametersChanged (com.example.androidtvlibrary.main.adapter.wow.PlaybackParameters p0)
	{
		n_onPlaybackParametersChanged (p0);
	}

	private native void n_onPlaybackParametersChanged (com.example.androidtvlibrary.main.adapter.wow.PlaybackParameters p0);

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
