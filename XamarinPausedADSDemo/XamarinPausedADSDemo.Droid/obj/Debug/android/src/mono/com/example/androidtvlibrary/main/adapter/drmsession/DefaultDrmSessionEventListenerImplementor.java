package mono.com.example.androidtvlibrary.main.adapter.drmsession;


public class DefaultDrmSessionEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.drmsession.DefaultDrmSessionEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.Drmsession.IDefaultDrmSessionEventListenerImplementor, PausedAdsAndroidTV.Binding", DefaultDrmSessionEventListenerImplementor.class, __md_methods);
	}


	public DefaultDrmSessionEventListenerImplementor ()
	{
		super ();
		if (getClass () == DefaultDrmSessionEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.Drmsession.IDefaultDrmSessionEventListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}

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
