package mono.com.example.androidtvlibrary.main.adapter;


public class AdsLoaderTest_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.AdsLoaderTest.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.IAdsLoaderTestEventListenerImplementor, PausedAdsAndroidTV.Binding", AdsLoaderTest_EventListenerImplementor.class, __md_methods);
	}


	public AdsLoaderTest_EventListenerImplementor ()
	{
		super ();
		if (getClass () == AdsLoaderTest_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.IAdsLoaderTestEventListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
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
