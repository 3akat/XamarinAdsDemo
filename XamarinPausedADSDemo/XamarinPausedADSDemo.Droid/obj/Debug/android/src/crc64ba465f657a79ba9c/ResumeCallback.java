package crc64ba465f657a79ba9c;


public class ResumeCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.ResumeCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResumeCall:()V:GetOnResumeCallHandler:Com.Example.Androidtvlibrary.Main.IResumeCallbackInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("PausedAds.CustomView.ResumeCallback, PausedAdsAndroidTV", ResumeCallback.class, __md_methods);
	}


	public ResumeCallback ()
	{
		super ();
		if (getClass () == ResumeCallback.class)
			mono.android.TypeManager.Activate ("PausedAds.CustomView.ResumeCallback, PausedAdsAndroidTV", "", this, new java.lang.Object[] {  });
	}


	public void onResumeCall ()
	{
		n_onResumeCall ();
	}

	private native void n_onResumeCall ();

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
