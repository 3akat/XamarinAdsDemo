using System;
using Octane.Xamarin.Forms.VideoPlayer;
using Octane.Xamarin.Forms.VideoPlayer.Constants;
using Octane.Xamarin.Forms.VideoPlayer.Events;
using Xamarin.Forms;
using XamarinPausedADSDemo.PlatfoemInterfaces;

namespace XamarinPausedADSDemo
{
    public partial class MainPage : ContentPage
    {
        private readonly IPlatformCode _platformCode;
        private VideoPlayer _player;
        private double _playerPauseTime = TimeSpan.Zero.TotalSeconds;
        private bool _isPaused;

        public MainPage()
        {
            InitializeComponent();
            _platformCode = DependencyService.Get<IPlatformCode>();

            _player = VideoPlayer;
        }

        private void OnPlayerStateChanged(object sender,
            VideoPlayerStateChangedEventArgs videoPlayerStateChangedEventArgs)
        {
            switch (videoPlayerStateChangedEventArgs.CurrentState)
            {
                case PlayerState.Paused:
                    _isPaused = true;
                    _playerPauseTime = _player.CurrentTime.TotalSeconds;
                    _platformCode.InitAds(MainLayout);
                    _platformCode.StartAds(true);
                    break;
                case PlayerState.Playing:
                    if (_playerPauseTime > TimeSpan.Zero.TotalSeconds && _isPaused)
                    {
                        _player.Seek((int)_playerPauseTime);
                    }
                    _isPaused = false;

                    break;
                case PlayerState.Completed:
                    _isPaused = false;
                    _playerPauseTime = TimeSpan.Zero.TotalSeconds;
                    break;
                case PlayerState.Error:
                    _isPaused = false;
                    _playerPauseTime = TimeSpan.Zero.TotalSeconds;
                    break;
            }
        }
    }
}