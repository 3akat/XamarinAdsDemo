package mono.com.example.androidtvlibrary.main.adapter;


public class TransferListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.TransferListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBytesTransferred:(Lcom/example/androidtvlibrary/main/adapter/DataSource;Lcom/example/androidtvlibrary/main/adapter/DataSpecTest;ZI)V:GetOnBytesTransferred_Lcom_example_androidtvlibrary_main_adapter_DataSource_Lcom_example_androidtvlibrary_main_adapter_DataSpecTest_ZIHandler:Com.Example.Androidtvlibrary.Main.Adapter.ITransferListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"n_onTransferEnd:(Lcom/example/androidtvlibrary/main/adapter/DataSource;Lcom/example/androidtvlibrary/main/adapter/DataSpecTest;Z)V:GetOnTransferEnd_Lcom_example_androidtvlibrary_main_adapter_DataSource_Lcom_example_androidtvlibrary_main_adapter_DataSpecTest_ZHandler:Com.Example.Androidtvlibrary.Main.Adapter.ITransferListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"n_onTransferInitializing:(Lcom/example/androidtvlibrary/main/adapter/DataSource;Lcom/example/androidtvlibrary/main/adapter/DataSpecTest;Z)V:GetOnTransferInitializing_Lcom_example_androidtvlibrary_main_adapter_DataSource_Lcom_example_androidtvlibrary_main_adapter_DataSpecTest_ZHandler:Com.Example.Androidtvlibrary.Main.Adapter.ITransferListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"n_onTransferStart:(Lcom/example/androidtvlibrary/main/adapter/DataSource;Lcom/example/androidtvlibrary/main/adapter/DataSpecTest;Z)V:GetOnTransferStart_Lcom_example_androidtvlibrary_main_adapter_DataSource_Lcom_example_androidtvlibrary_main_adapter_DataSpecTest_ZHandler:Com.Example.Androidtvlibrary.Main.Adapter.ITransferListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.ITransferListenerImplementor, PausedAdsAndroidTV.Binding", TransferListenerImplementor.class, __md_methods);
	}


	public TransferListenerImplementor ()
	{
		super ();
		if (getClass () == TransferListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.ITransferListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onBytesTransferred (com.example.androidtvlibrary.main.adapter.DataSource p0, com.example.androidtvlibrary.main.adapter.DataSpecTest p1, boolean p2, int p3)
	{
		n_onBytesTransferred (p0, p1, p2, p3);
	}

	private native void n_onBytesTransferred (com.example.androidtvlibrary.main.adapter.DataSource p0, com.example.androidtvlibrary.main.adapter.DataSpecTest p1, boolean p2, int p3);


	public void onTransferEnd (com.example.androidtvlibrary.main.adapter.DataSource p0, com.example.androidtvlibrary.main.adapter.DataSpecTest p1, boolean p2)
	{
		n_onTransferEnd (p0, p1, p2);
	}

	private native void n_onTransferEnd (com.example.androidtvlibrary.main.adapter.DataSource p0, com.example.androidtvlibrary.main.adapter.DataSpecTest p1, boolean p2);


	public void onTransferInitializing (com.example.androidtvlibrary.main.adapter.DataSource p0, com.example.androidtvlibrary.main.adapter.DataSpecTest p1, boolean p2)
	{
		n_onTransferInitializing (p0, p1, p2);
	}

	private native void n_onTransferInitializing (com.example.androidtvlibrary.main.adapter.DataSource p0, com.example.androidtvlibrary.main.adapter.DataSpecTest p1, boolean p2);


	public void onTransferStart (com.example.androidtvlibrary.main.adapter.DataSource p0, com.example.androidtvlibrary.main.adapter.DataSpecTest p1, boolean p2)
	{
		n_onTransferStart (p0, p1, p2);
	}

	private native void n_onTransferStart (com.example.androidtvlibrary.main.adapter.DataSource p0, com.example.androidtvlibrary.main.adapter.DataSpecTest p1, boolean p2);

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
