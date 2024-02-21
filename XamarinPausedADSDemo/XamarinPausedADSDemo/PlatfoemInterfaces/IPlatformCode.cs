using Xamarin.Forms;

namespace XamarinPausedADSDemo.PlatfoemInterfaces
{
    public interface IPlatformCode
    {
        void InitAds(StackLayout mainLayout);
        void StartAds(bool skipped);
        void CloseAds();
    }
}