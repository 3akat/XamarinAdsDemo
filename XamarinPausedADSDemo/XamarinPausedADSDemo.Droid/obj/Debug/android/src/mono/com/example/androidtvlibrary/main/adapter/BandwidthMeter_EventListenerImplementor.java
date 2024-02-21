package mono.com.example.androidtvlibrary.main.adapter;


public class BandwidthMeter_EventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.BandwidthMeter.EventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBandwidthSample:(IJJ)V:GetOnBandwidthSample_IJJHandler:Com.Example.Androidtvlibrary.Main.Adapter.IBandwidthMeterEventListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.IBandwidthMeterEventListenerImplementor, PausedAdsAndroidTV.Binding", BandwidthMeter_EventListenerImplementor.class, __md_methods);
	}


	public BandwidthMeter_EventListenerImplementor ()
	{
		super ();
		if (getClass () == BandwidthMeter_EventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.IBandwidthMeterEventListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onBandwidthSample (int p0, long p1, long p2)
	{
		n_onBandwidthSample (p0, p1, p2);
	}

	private native void n_onBandwidthSample (int p0, long p1, long p2);

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
