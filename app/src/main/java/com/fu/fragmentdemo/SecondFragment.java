package com.fu.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fu.fragmentdemo.databinding.FragmentSecondBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends BaseFragment<FragmentSecondBinding, SecondFragmentViewModel> {


    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreateActivity() {

    }

    @Override
    public int getVariableId() {
        return BR.secondFragViewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_second;
    }

    @Override
    public SecondFragmentViewModel setViewModel() {
        return new SecondFragmentViewModel("Second Fragment");
    }
}
