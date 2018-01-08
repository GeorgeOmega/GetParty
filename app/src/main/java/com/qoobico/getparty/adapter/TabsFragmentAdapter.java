package com.qoobico.getparty.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qoobico.getparty.fragment.AbstractTabFragment;
import com.qoobico.getparty.fragment.CurActivityFragment;
import com.qoobico.getparty.fragment.HistoryFragment;
import com.qoobico.getparty.fragment.YourActivityFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by George Omega on 08.01.2018.
 */

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Context context;
    private Map<Integer, AbstractTabFragment> tabs;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context=context;
        initTabsMap(context);
    }



    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position ){
        return tabs.get(position);
    }
    @Override
    public int getCount(){
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs=new HashMap<>();
        tabs.put(0, CurActivityFragment.getInstance(context));
        tabs.put(1, YourActivityFragment.getInstance(context));
        tabs.put(2, HistoryFragment.getInstance(context));
    }
}
