package mono.com.example.androidtvlibrary.main.adapter.wow;


public class TrackSelector_InvalidationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.wow.TrackSelector.InvalidationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTrackSelectionsInvalidated:()V:GetOnTrackSelectionsInvalidatedHandler:Com.Example.Androidtvlibrary.Main.Adapter.Wow.TrackSelector/IInvalidationListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Wow.TrackSelector+IInvalidationListenerImplementor, PausedAdsAndroidTV.Binding", TrackSelector_InvalidationListenerImplementor.class, __md_methods);
	}


	public TrackSelector_InvalidationListenerImplementor ()
	{
		super ();
		if (getClass () == TrackSelector_InvalidationListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Wow.TrackSelector+IInvalidationListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onTrackSelectionsInvalidated ()
	{
		n_onTrackSelectionsInvalidated ();
	}

	private native void n_onTrackSelectionsInvalidated ();

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
