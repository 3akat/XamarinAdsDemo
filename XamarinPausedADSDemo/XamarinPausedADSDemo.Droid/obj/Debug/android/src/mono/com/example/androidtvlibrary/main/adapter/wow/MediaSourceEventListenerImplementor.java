package mono.com.example.androidtvlibrary.main.adapter.wow;


public class MediaSourceEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.wow.MediaSourceEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Wow.IMediaSourceEventListenerImplementor, PausedAdsAndroidTV.Binding", MediaSourceEventListenerImplementor.class, __md_methods);
	}


	public MediaSourceEventListenerImplementor ()
	{
		super ();
		if (getClass () == MediaSourceEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Wow.IMediaSourceEventListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
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
