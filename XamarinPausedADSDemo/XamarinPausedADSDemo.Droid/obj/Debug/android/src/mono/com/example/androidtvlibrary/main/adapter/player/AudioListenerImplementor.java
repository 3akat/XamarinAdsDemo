package mono.com.example.androidtvlibrary.main.adapter.player;


public class AudioListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.player.AudioListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Player.IAudioListenerImplementor, PausedAdsAndroidTV.Binding", AudioListenerImplementor.class, __md_methods);
	}


	public AudioListenerImplementor ()
	{
		super ();
		if (getClass () == AudioListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Player.IAudioListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
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
