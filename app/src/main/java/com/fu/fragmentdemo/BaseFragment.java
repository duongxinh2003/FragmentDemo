package com.fu.fragmentdemo;

import android.databinding.BaseObservable;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment<T extends ViewDataBinding,V extends BaseObservable> extends Fragment {
    private T binding;
    private V viewModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(getLayoutInflater(),getLayoutId(),container,false);
        viewModel = setViewModel();
        binding.setVariable(getVariableId(),viewModel);
        onCreateActivity();
        return binding.getRoot();
    }

    public abstract void onCreateActivity();

    public abstract int getVariableId();

    public abstract int getLayoutId();

    public abstract V setViewModel();

    public T getBinding() {
        return binding;
    }


    public V getViewModel() {
        return viewModel;
    }


}
