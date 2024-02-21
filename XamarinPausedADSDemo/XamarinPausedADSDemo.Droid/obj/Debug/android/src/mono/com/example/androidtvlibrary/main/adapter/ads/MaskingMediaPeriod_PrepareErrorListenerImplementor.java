package mono.com.example.androidtvlibrary.main.adapter.ads;


public class MaskingMediaPeriod_PrepareErrorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.ads.MaskingMediaPeriod.PrepareErrorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPrepareError:(Lcom/example/androidtvlibrary/main/adapter/wow/MediaSource$MediaPeriodId;Ljava/io/IOException;)V:GetOnPrepareError_Lcom_example_androidtvlibrary_main_adapter_wow_MediaSource_MediaPeriodId_Ljava_io_IOException_Handler:Com.Example.Androidtvlibrary.Main.Adapter.Ads.MaskingMediaPeriod/IPrepareErrorListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Ads.MaskingMediaPeriod+IPrepareErrorListenerImplementor, PausedAdsAndroidTV.Binding", MaskingMediaPeriod_PrepareErrorListenerImplementor.class, __md_methods);
	}


	public MaskingMediaPeriod_PrepareErrorListenerImplementor ()
	{
		super ();
		if (getClass () == MaskingMediaPeriod_PrepareErrorListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Ads.MaskingMediaPeriod+IPrepareErrorListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onPrepareError (com.example.androidtvlibrary.main.adapter.wow.MediaSource.MediaPeriodId p0, java.io.IOException p1)
	{
		n_onPrepareError (p0, p1);
	}

	private native void n_onPrepareError (com.example.androidtvlibrary.main.adapter.wow.MediaSource.MediaPeriodId p0, java.io.IOException p1);

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
