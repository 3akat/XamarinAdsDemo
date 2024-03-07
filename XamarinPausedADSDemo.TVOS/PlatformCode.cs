using AppleTVAds;
using UIKit;
using Xamarin.Forms;
using XamarinPausedADSDemo.PlatfoemInterfaces;
using XamarinPausedADSDemo.TVOS;

[assembly: Dependency(typeof(PlatformCode))]

namespace XamarinPausedADSDemo.TVOS
{
    public class PlatformCode : IPlatformCode
    {
        public void InitAds(StackLayout MainLayout)
        {
        }

        public void StartAds(bool skipped)
        {
            var controller = new TVAdsViewController();
            var rootController = ((AppDelegate)(UIApplication.SharedApplication.Delegate)).Window.RootViewController
                .ChildViewControllers[0].ChildViewControllers[0].ChildViewControllers[0];
            var navcontroller = rootController as UINavigationController;
            if (navcontroller != null)
                rootController = navcontroller.VisibleViewController;
            rootController.PresentViewController(controller, true, null);
        }

        public void CloseAds()
        {
        }
    }
}