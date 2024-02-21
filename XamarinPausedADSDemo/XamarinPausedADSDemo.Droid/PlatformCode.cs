using Android.Content;
using Com.Example.Androidtvlibrary.Main;
using PausedAds.CustomView;
using Xamarin.Forms;
using XamarinPausedADSDemo.Droid;
using XamarinPausedADSDemo.PlatfoemInterfaces;
using Application = Android.App.Application;

[assembly: Dependency(typeof(PlatformCode))]

namespace XamarinPausedADSDemo.Droid
{
    public class PlatformCode : IPlatformCode
    {
        private PlayerView PlayerView;
        private TVTestLibrary TVTestLibrary;
        private Context context;

        public void InitAds(StackLayout MainLayout)
        {
            context = Application.Context;
            PlayerView = new PlayerView(context);
            TVTestLibrary = new TVTestLibrary();
            // MainLayout.Children.Add(PlayerView as FrameLayout);
        }

        public void StartAds(bool skipped)
        {
            TVTestLibrary.StartAdsLoader(context, skipped);
            // PlayerView.StartAds(skipped);
        }

        public void CloseAds()
        {
            PlayerView.CloseAds();
        }
    }
}