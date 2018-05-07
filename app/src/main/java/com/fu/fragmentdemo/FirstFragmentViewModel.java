package com.fu.fragmentdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by ADMIN on 5/6/2018.
 */

public class FirstFragmentViewModel extends BaseObservable{
    private String name;
    private String number;

    public FirstFragmentViewModel() {
    }

    public FirstFragmentViewModel(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Bindable
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
