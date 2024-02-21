package mono.com.google.ads.interactivemedia.v3.api;


public class CompanionAdSlot_ClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ads.interactivemedia.v3.api.CompanionAdSlot.ClickListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCompanionAdClick:()V:GetOnCompanionAdClickHandler:Com.Google.Ads.Interactivemedia.V3.Api.ICompanionAdSlotClickListenerInvoker, InteractiveMediaAds\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Ads.Interactivemedia.V3.Api.ICompanionAdSlotClickListenerImplementor, InteractiveMediaAds", CompanionAdSlot_ClickListenerImplementor.class, __md_methods);
	}


	public CompanionAdSlot_ClickListenerImplementor ()
	{
		super ();
		if (getClass () == CompanionAdSlot_ClickListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Ads.Interactivemedia.V3.Api.ICompanionAdSlotClickListenerImplementor, InteractiveMediaAds", "", this, new java.lang.Object[] {  });
	}


	public void onCompanionAdClick ()
	{
		n_onCompanionAdClick ();
	}

	private native void n_onCompanionAdClick ();

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
