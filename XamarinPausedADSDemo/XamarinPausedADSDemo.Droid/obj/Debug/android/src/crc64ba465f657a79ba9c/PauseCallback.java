package crc64ba465f657a79ba9c;


public class PauseCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.PauseCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPauseCall:()V:GetOnPauseCallHandler:Com.Example.Androidtvlibrary.Main.IPauseCallbackInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("PausedAds.CustomView.PauseCallback, PausedAdsAndroidTV", PauseCallback.class, __md_methods);
	}


	public PauseCallback ()
	{
		super ();
		if (getClass () == PauseCallback.class)
			mono.android.TypeManager.Activate ("PausedAds.CustomView.PauseCallback, PausedAdsAndroidTV", "", this, new java.lang.Object[] {  });
	}


	public void onPauseCall ()
	{
		n_onPauseCall ();
	}

	private native void n_onPauseCall ();

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
