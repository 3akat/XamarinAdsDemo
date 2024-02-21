package mono.com.google.ads.interactivemedia.v3.api;


public class AdEvent_AdEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdEvent:(Lcom/google/ads/interactivemedia/v3/api/AdEvent;)V:GetOnAdEvent_Lcom_google_ads_interactivemedia_v3_api_AdEvent_Handler:Com.Google.Ads.Interactivemedia.V3.Api.IAdEventAdEventListenerInvoker, InteractiveMediaAds\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Ads.Interactivemedia.V3.Api.IAdEventAdEventListenerImplementor, InteractiveMediaAds", AdEvent_AdEventListenerImplementor.class, __md_methods);
	}


	public AdEvent_AdEventListenerImplementor ()
	{
		super ();
		if (getClass () == AdEvent_AdEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Ads.Interactivemedia.V3.Api.IAdEventAdEventListenerImplementor, InteractiveMediaAds", "", this, new java.lang.Object[] {  });
	}


	public void onAdEvent (com.google.ads.interactivemedia.v3.api.AdEvent p0)
	{
		n_onAdEvent (p0);
	}

	private native void n_onAdEvent (com.google.ads.interactivemedia.v3.api.AdEvent p0);

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
