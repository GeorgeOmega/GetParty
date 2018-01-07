package com.qoobico.getparty.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qoobico.getparty.fragment.ExampleFragment;

/**
 * Created by George Omega on 08.01.2018.
 */

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs= new String[]{
                "Текущие мероприятия",
                "Ваши мероприятия",
                "Напоминания"

        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position ){
        switch (position) {
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            case 2:
                return ExampleFragment.getInstance();

        }


        return null;
    }
    @Override
    public int getCount(){
        return tabs.length;
    }
}
