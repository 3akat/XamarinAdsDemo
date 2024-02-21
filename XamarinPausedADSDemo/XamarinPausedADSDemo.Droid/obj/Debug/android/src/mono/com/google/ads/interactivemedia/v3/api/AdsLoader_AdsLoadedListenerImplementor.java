package mono.com.google.ads.interactivemedia.v3.api;


public class AdsLoader_AdsLoadedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.ads.interactivemedia.v3.api.AdsLoader.AdsLoadedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdsManagerLoaded:(Lcom/google/ads/interactivemedia/v3/api/AdsManagerLoadedEvent;)V:GetOnAdsManagerLoaded_Lcom_google_ads_interactivemedia_v3_api_AdsManagerLoadedEvent_Handler:Com.Google.Ads.Interactivemedia.V3.Api.IAdsLoaderAdsLoadedListenerInvoker, InteractiveMediaAds\n" +
			"";
		mono.android.Runtime.register ("Com.Google.Ads.Interactivemedia.V3.Api.IAdsLoaderAdsLoadedListenerImplementor, InteractiveMediaAds", AdsLoader_AdsLoadedListenerImplementor.class, __md_methods);
	}


	public AdsLoader_AdsLoadedListenerImplementor ()
	{
		super ();
		if (getClass () == AdsLoader_AdsLoadedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Google.Ads.Interactivemedia.V3.Api.IAdsLoaderAdsLoadedListenerImplementor, InteractiveMediaAds", "", this, new java.lang.Object[] {  });
	}


	public void onAdsManagerLoaded (com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent p0)
	{
		n_onAdsManagerLoaded (p0);
	}

	private native void n_onAdsManagerLoaded (com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent p0);

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
