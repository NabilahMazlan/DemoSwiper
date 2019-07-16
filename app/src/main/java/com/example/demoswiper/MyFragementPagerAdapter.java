package com.example.demoswiper;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyFragementPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments;

    public MyFragementPagerAdapter(FragmentManager fm, ArrayList<Fragment> arrayList) {
        super(fm);
        fragments = arrayList;
    }


    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
