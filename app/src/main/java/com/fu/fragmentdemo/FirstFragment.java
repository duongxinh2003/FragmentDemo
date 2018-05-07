package com.fu.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

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
        getBinding().setPresenter(this);
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

    public void onClick() {
        UserInfoDialog dialog = new UserInfoDialog();
        dialog.show(getFragmentManager(), "Custom Dialog");
        Log.d("Show","abc");
    }
}
