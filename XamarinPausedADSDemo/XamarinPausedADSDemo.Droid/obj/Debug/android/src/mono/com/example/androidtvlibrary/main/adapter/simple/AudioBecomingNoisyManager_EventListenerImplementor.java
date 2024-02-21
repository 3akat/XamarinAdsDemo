package mono.com.example.androidtvlibrary.main.adapter.simple;


public class AudioBecomingNoisyManager_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.simple.AudioBecomingNoisyManager.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAudioBecomingNoisy:()V:GetOnAudioBecomingNoisyHandler:Com.Example.Androidtvlibrary.Main.Adapter.Simple.AudioBecomingNoisyManager/IEventListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Simple.AudioBecomingNoisyManager+IEventListenerImplementor, PausedAdsAndroidTV.Binding", AudioBecomingNoisyManager_EventListenerImplementor.class, __md_methods);
	}


	public AudioBecomingNoisyManager_EventListenerImplementor ()
	{
		super ();
		if (getClass () == AudioBecomingNoisyManager_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Simple.AudioBecomingNoisyManager+IEventListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onAudioBecomingNoisy ()
	{
		n_onAudioBecomingNoisy ();
	}

	private native void n_onAudioBecomingNoisy ();

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
