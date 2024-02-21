using Octane.Xamarin.Forms.VideoPlayer.Constants;
using Octane.Xamarin.Forms.VideoPlayer.Events;
using Xamarin.Forms;
using XamarinPausedADSDemo.PlatfoemInterfaces;

namespace XamarinPausedADSDemo
{
    public partial class MainPage : ContentPage
    {
        private readonly IPlatformCode _platformCode;

        public MainPage()
        {
            InitializeComponent();
            _platformCode = DependencyService.Get<IPlatformCode>();
            _platformCode.InitAds(MainLayout);
        }

        private void OnPlayerStateChanged(object sender,
            VideoPlayerStateChangedEventArgs videoPlayerStateChangedEventArgs)
        {
            switch (videoPlayerStateChangedEventArgs.CurrentState)
            {
                case PlayerState.Paused:
                    _platformCode.StartAds(true);
                    break;
                case PlayerState.Playing:
                    break;
                case PlayerState.Completed:
                    break;
                case PlayerState.Error:
                    break;
            }
        }
    }
}