package mono.com.example.androidtvlibrary.main.adapter.drmsession;


public class ExoMediaDrm_OnKeyStatusChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.drmsession.ExoMediaDrm.OnKeyStatusChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onKeyStatusChange:(Lcom/example/androidtvlibrary/main/adapter/drmsession/ExoMediaDrm;[BLjava/util/List;Z)V:GetOnKeyStatusChange_Lcom_example_androidtvlibrary_main_adapter_drmsession_ExoMediaDrm_arrayBLjava_util_List_ZHandler:Com.Example.Androidtvlibrary.Main.Adapter.Drmsession.IExoMediaDrmOnKeyStatusChangeListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Drmsession.IExoMediaDrmOnKeyStatusChangeListenerImplementor, PausedAdsAndroidTV.Binding", ExoMediaDrm_OnKeyStatusChangeListenerImplementor.class, __md_methods);
	}


	public ExoMediaDrm_OnKeyStatusChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ExoMediaDrm_OnKeyStatusChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Drmsession.IExoMediaDrmOnKeyStatusChangeListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onKeyStatusChange (com.example.androidtvlibrary.main.adapter.drmsession.ExoMediaDrm p0, byte[] p1, java.util.List p2, boolean p3)
	{
		n_onKeyStatusChange (p0, p1, p2, p3);
	}

	private native void n_onKeyStatusChange (com.example.androidtvlibrary.main.adapter.drmsession.ExoMediaDrm p0, byte[] p1, java.util.List p2, boolean p3);

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
