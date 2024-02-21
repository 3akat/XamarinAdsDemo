package mono.com.example.androidtvlibrary.main.adapter;


public class CameraMotionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.CameraMotionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraMotion:(J[F)V:GetOnCameraMotion_JarrayFHandler:Com.Example.Androidtvlibrary.Main.Adapter.ICameraMotionListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"n_onCameraMotionReset:()V:GetOnCameraMotionResetHandler:Com.Example.Androidtvlibrary.Main.Adapter.ICameraMotionListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.ICameraMotionListenerImplementor, PausedAdsAndroidTV.Binding", CameraMotionListenerImplementor.class, __md_methods);
	}


	public CameraMotionListenerImplementor ()
	{
		super ();
		if (getClass () == CameraMotionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.ICameraMotionListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onCameraMotion (long p0, float[] p1)
	{
		n_onCameraMotion (p0, p1);
	}

	private native void n_onCameraMotion (long p0, float[] p1);


	public void onCameraMotionReset ()
	{
		n_onCameraMotionReset ();
	}

	private native void n_onCameraMotionReset ();

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
