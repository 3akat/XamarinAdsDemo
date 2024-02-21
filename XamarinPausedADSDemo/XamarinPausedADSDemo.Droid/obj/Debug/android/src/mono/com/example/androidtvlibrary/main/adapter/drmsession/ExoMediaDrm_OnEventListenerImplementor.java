package mono.com.example.androidtvlibrary.main.adapter.drmsession;


public class ExoMediaDrm_OnEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.drmsession.ExoMediaDrm.OnEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onEvent:(Lcom/example/androidtvlibrary/main/adapter/drmsession/ExoMediaDrm;[BII[B)V:GetOnEvent_Lcom_example_androidtvlibrary_main_adapter_drmsession_ExoMediaDrm_arrayBIIarrayBHandler:Com.Example.Androidtvlibrary.Main.Adapter.Drmsession.IExoMediaDrmOnEventListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Drmsession.IExoMediaDrmOnEventListenerImplementor, PausedAdsAndroidTV.Binding", ExoMediaDrm_OnEventListenerImplementor.class, __md_methods);
	}


	public ExoMediaDrm_OnEventListenerImplementor ()
	{
		super ();
		if (getClass () == ExoMediaDrm_OnEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Drmsession.IExoMediaDrmOnEventListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onEvent (com.example.androidtvlibrary.main.adapter.drmsession.ExoMediaDrm p0, byte[] p1, int p2, int p3, byte[] p4)
	{
		n_onEvent (p0, p1, p2, p3, p4);
	}

	private native void n_onEvent (com.example.androidtvlibrary.main.adapter.drmsession.ExoMediaDrm p0, byte[] p1, int p2, int p3, byte[] p4);

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
