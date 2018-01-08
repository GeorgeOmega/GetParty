package com.qoobico.getparty.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qoobico.getparty.R;

/**
 * Created by George Omega on 08.01.2018.
 */

public class CurActivityFragment extends AbstractTabFragment {
    private static final int LAYOUT= R.layout.fragment_example;



    public static CurActivityFragment getInstance(Context context)
    {
        Bundle args=new Bundle();
        CurActivityFragment fragment=new CurActivityFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_CurActivity));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(LAYOUT,container,false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }

}
