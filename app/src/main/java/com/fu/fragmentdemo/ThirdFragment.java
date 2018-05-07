package com.fu.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fu.fragmentdemo.databinding.FragmentThirdBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends BaseFragment<FragmentThirdBinding, ThirdFragmentViewModel> {


    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreateActivity() {

    }

    @Override
    public int getVariableId() {
        return BR.thirdFragViewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_third;
    }

    @Override
    public ThirdFragmentViewModel setViewModel() {
        return new ThirdFragmentViewModel();
    }

}
