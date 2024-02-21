using System;
using System.ComponentModel;
using Android.Content;
using Android.Views;
using Android.Widget;
using Com.Example.Androidtvlibrary.Main.Adapter;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;
using View = Android.Views.View;

namespace XamarinPausedADSDemo.Droid
{
    public class CustomView : PlayerView, IVisualElementRenderer, IViewRenderer
    {

        // private FrameLayout PlayerView;

        public CustomView(Context context) : base(context)
        {
            // Context context = Android.App.Application.Context;
            // PlayerView = new PlayerView(context);
        }

        public SizeRequest GetDesiredSize(int widthConstraint, int heightConstraint)
        {
            throw new NotImplementedException();
        }

        public void SetElement(VisualElement element)
        {
            throw new NotImplementedException();
        }

        public void SetLabelFor(int? id)
        {
            throw new NotImplementedException();
        }

        public void UpdateLayout()
        {
            throw new NotImplementedException();
        }

        public VisualElement Element { get; }
        public VisualElementTracker Tracker { get; }
        public ViewGroup ViewGroup { get; }
        public View View { get; }
        public event EventHandler<VisualElementChangedEventArgs> ElementChanged;
        public event EventHandler<PropertyChangedEventArgs> ElementPropertyChanged;
        public void MeasureExactly()
        {
            throw new NotImplementedException();
        }
    }
}