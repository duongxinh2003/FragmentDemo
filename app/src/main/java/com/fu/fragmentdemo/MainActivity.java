package com.fu.fragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fu.fragmentdemo.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainActivityViewModel> {


    @Override
    protected int getTabLayoutId() {
        return R.id.tabLayout1;
    }

    @Override
    protected int getViewPagerId() {
        return R.id.viewPager1;
    }

    @Override
    protected void onCreateActivity() {
    }

    @Override
    protected int getVariableId() {
        return BR.viewModel;
    }

    @Override
    protected MainActivityViewModel setViewModel() {
        return new MainActivityViewModel();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
