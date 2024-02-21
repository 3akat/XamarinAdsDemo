package mono.com.example.androidtvlibrary.main.adapter.Media;


public class IcyDataSource_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.Media.IcyDataSource.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onIcyMetadata:(Lcom/example/androidtvlibrary/main/adapter/Media/ParsableByteArray;)V:GetOnIcyMetadata_Lcom_example_androidtvlibrary_main_adapter_Media_ParsableByteArray_Handler:Com.Example.Androidtvlibrary.Main.Adapter.Media.IcyDataSource/IListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Media.IcyDataSource+IListenerImplementor, PausedAdsAndroidTV.Binding", IcyDataSource_ListenerImplementor.class, __md_methods);
	}


	public IcyDataSource_ListenerImplementor ()
	{
		super ();
		if (getClass () == IcyDataSource_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Media.IcyDataSource+IListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onIcyMetadata (com.example.androidtvlibrary.main.adapter.Media.ParsableByteArray p0)
	{
		n_onIcyMetadata (p0);
	}

	private native void n_onIcyMetadata (com.example.androidtvlibrary.main.adapter.Media.ParsableByteArray p0);

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
