package mono.com.google.ads.interactivemedia.v3.api;


public class AdErrorEvent_AdErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdError:(Lcom/google/ads/interactivemedia/v3/api/AdErrorEvent;)V:GetOnAdError_Lcom_google_ads_interactivemedia_v3_api_AdErrorEvent_Handler:Com.Google.Ads.Interactivemedia.V3.Api.IAdErrorEventAdErrorListenerInvoker, InteractiveMediaAds\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Ads.Interactivemedia.V3.Api.IAdErrorEventAdErrorListenerImplementor, InteractiveMediaAds", AdErrorEvent_AdErrorListenerImplementor.class, __md_methods);
	}


	public AdErrorEvent_AdErrorListenerImplementor ()
	{
		super ();
		if (getClass () == AdErrorEvent_AdErrorListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Ads.Interactivemedia.V3.Api.IAdErrorEventAdErrorListenerImplementor, InteractiveMediaAds", "", this, new java.lang.Object[] {  });
	}


	public void onAdError (com.google.ads.interactivemedia.v3.api.AdErrorEvent p0)
	{
		n_onAdError (p0);
	}

	private native void n_onAdError (com.google.ads.interactivemedia.v3.api.AdErrorEvent p0);

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
