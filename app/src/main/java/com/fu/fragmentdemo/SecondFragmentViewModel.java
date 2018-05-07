package com.fu.fragmentdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class SecondFragmentViewModel  extends BaseObservable{
    private String data;

    public SecondFragmentViewModel() {
    }

    public SecondFragmentViewModel(String data) {
        this.data = data;
    }

    @Bindable
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
