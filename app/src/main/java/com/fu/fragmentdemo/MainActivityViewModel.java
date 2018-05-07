package com.fu.fragmentdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.fu.fragmentdemo.BR;

public class MainActivityViewModel extends BaseObservable{
    private String text;

    public MainActivityViewModel() {
    }

    public MainActivityViewModel(String text) {
        this.text = text;
    }

    @Bindable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }
}
