package mono.com.example.androidtvlibrary.main.adapter.player;


public class SingleTapListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.player.SingleTapListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSingleTapUp:(Landroid/view/MotionEvent;)Z:GetOnSingleTapUp_Landroid_view_MotionEvent_Handler:Com.Example.Androidtvlibrary.Main.Adapter.Player.ISingleTapListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Player.ISingleTapListenerImplementor, PausedAdsAndroidTV.Binding", SingleTapListenerImplementor.class, __md_methods);
	}


	public SingleTapListenerImplementor ()
	{
		super ();
		if (getClass () == SingleTapListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Player.ISingleTapListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public boolean onSingleTapUp (android.view.MotionEvent p0)
	{
		return n_onSingleTapUp (p0);
	}

	private native boolean n_onSingleTapUp (android.view.MotionEvent p0);

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
