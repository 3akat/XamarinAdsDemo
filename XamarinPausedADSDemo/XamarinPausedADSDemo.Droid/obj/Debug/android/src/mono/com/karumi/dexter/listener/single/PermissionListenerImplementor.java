package mono.com.karumi.dexter.listener.single;


public class PermissionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.karumi.dexter.listener.single.PermissionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPermissionDenied:(Lcom/karumi/dexter/listener/PermissionDeniedResponse;)V:GetOnPermissionDenied_Lcom_karumi_dexter_listener_PermissionDeniedResponse_Handler:Karumi.DexterLib.Listeners.Single.IPermissionListenerInvoker, Karumi.Dexter\n" +
			"n_onPermissionGranted:(Lcom/karumi/dexter/listener/PermissionGrantedResponse;)V:GetOnPermissionGranted_Lcom_karumi_dexter_listener_PermissionGrantedResponse_Handler:Karumi.DexterLib.Listeners.Single.IPermissionListenerInvoker, Karumi.Dexter\n" +
			"n_onPermissionRationaleShouldBeShown:(Lcom/karumi/dexter/listener/PermissionRequest;Lcom/karumi/dexter/PermissionToken;)V:GetOnPermissionRationaleShouldBeShown_Lcom_karumi_dexter_listener_PermissionRequest_Lcom_karumi_dexter_PermissionToken_Handler:Karumi.DexterLib.Listeners.Single.IPermissionListenerInvoker, Karumi.Dexter\n" +
			"";
		mono.android.Runtime.register ("Karumi.DexterLib.Listeners.Single.IPermissionListenerImplementor, Karumi.Dexter", PermissionListenerImplementor.class, __md_methods);
	}


	public PermissionListenerImplementor ()
	{
		super ();
		if (getClass () == PermissionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Karumi.DexterLib.Listeners.Single.IPermissionListenerImplementor, Karumi.Dexter", "", this, new java.lang.Object[] {  });
	}


	public void onPermissionDenied (com.karumi.dexter.listener.PermissionDeniedResponse p0)
	{
		n_onPermissionDenied (p0);
	}

	private native void n_onPermissionDenied (com.karumi.dexter.listener.PermissionDeniedResponse p0);


	public void onPermissionGranted (com.karumi.dexter.listener.PermissionGrantedResponse p0)
	{
		n_onPermissionGranted (p0);
	}

	private native void n_onPermissionGranted (com.karumi.dexter.listener.PermissionGrantedResponse p0);


	public void onPermissionRationaleShouldBeShown (com.karumi.dexter.listener.PermissionRequest p0, com.karumi.dexter.PermissionToken p1)
	{
		n_onPermissionRationaleShouldBeShown (p0, p1);
	}

	private native void n_onPermissionRationaleShouldBeShown (com.karumi.dexter.listener.PermissionRequest p0, com.karumi.dexter.PermissionToken p1);

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
