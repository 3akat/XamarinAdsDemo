package mono.com.example.androidtvlibrary.main.adapter;


public class VideoFrameMetadataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.example.androidtvlibrary.main.adapter.VideoFrameMetadataListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onVideoFrameAboutToBeRendered:(JJLcom/example/androidtvlibrary/main/adapter/Format;Landroid/media/MediaFormat;)V:GetOnVideoFrameAboutToBeRendered_JJLcom_example_androidtvlibrary_main_adapter_Format_Landroid_media_MediaFormat_Handler:Com.Example.Androidtvlibrary.Main.Adapter.IVideoFrameMetadataListenerInvoker, PausedAdsAndroidTV.Binding\n" +
			"";
		mono.android.Runtime.register ("Com.Example.Androidtvlibrary.Main.Adapter.IVideoFrameMetadataListenerImplementor, PausedAdsAndroidTV.Binding", VideoFrameMetadataListenerImplementor.class, __md_methods);
	}


	public VideoFrameMetadataListenerImplementor ()
	{
		super ();
		if (getClass () == VideoFrameMetadataListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Example.Androidtvlibrary.Main.Adapter.IVideoFrameMetadataListenerImplementor, PausedAdsAndroidTV.Binding", "", this, new java.lang.Object[] {  });
	}


	public void onVideoFrameAboutToBeRendered (long p0, long p1, com.example.androidtvlibrary.main.adapter.Format p2, android.media.MediaFormat p3)
	{
		n_onVideoFrameAboutToBeRendered (p0, p1, p2, p3);
	}

	private native void n_onVideoFrameAboutToBeRendered (long p0, long p1, com.example.androidtvlibrary.main.adapter.Format p2, android.media.MediaFormat p3);

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
