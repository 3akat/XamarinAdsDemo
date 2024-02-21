using Android.App;
using Android.Content.PM;
using Android.OS;
using Octane.Xamarin.Forms.VideoPlayer.Android;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;

namespace XamarinPausedADSDemo.Droid
{
    [Activity(Label = "XamarinPausedADSDemo", Theme = "@style/MainTheme", MainLauncher = true,
        ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
    public class MainActivity : FormsAppCompatActivity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            TabLayoutResource = Resource.Layout.Tabbar;
            ToolbarResource = Resource.Layout.Toolbar;

            base.OnCreate(savedInstanceState);
            Forms.Init(this, savedInstanceState);
            FormsVideoPlayer.Init();
            LoadApplication(new App());
            // var tvTestLibrary = new TVTestLibrary();
            // tvTestLibrary.StartAdsLoader(context: , skipped: true
            // );
        }
    }
}