package mono.com.example.androidtvlibrary.main.adapter.Media;


public class SampleQueue_UpstreamFormatChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.Media.SampleQueue.UpstreamFormatChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onUpstreamFormatChanged:(Lcom/example/androidtvlibrary/main/adapter/Format;)V:GetOnUpstreamFormatChanged_Lcom_example_androidtvlibrary_main_adapter_Format_Handler:Com.Example.Androidtvlibrary.Main.Adapter.Media.SampleQueue/IUpstreamFormatChangedListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Media.SampleQueue+IUpstreamFormatChangedListenerImplementor, PausedAdsAndroidTV.Binding", SampleQueue_UpstreamFormatChangedListenerImplementor.class, __md_methods);
	}


	public SampleQueue_UpstreamFormatChangedListenerImplementor ()
	{
		super ();
		if (getClass () == SampleQueue_UpstreamFormatChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Media.SampleQueue+IUpstreamFormatChangedListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onUpstreamFormatChanged (com.example.androidtvlibrary.main.adapter.Format p0)
	{
		n_onUpstreamFormatChanged (p0);
	}

	private native void n_onUpstreamFormatChanged (com.example.androidtvlibrary.main.adapter.Format p0);

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
