package com.fu.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fu.fragmentdemo.databinding.FragmentFirstBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends BaseFragment<FragmentFirstBinding, FirstFragmentViewModel> {


    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreateActivity() {

    }

    @Override
    public int getVariableId() {
        return BR.firstFragViewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_first;
    }

    @Override
    public FirstFragmentViewModel setViewModel() {
        return new FirstFragmentViewModel();
    }
}
