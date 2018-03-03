package com.devnitish.circularviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Nitish Prasad on 3/3/2018.
 */

public class MyPagerAdapter extends FragmentPagerAdapter{

    ArrayList<Fragment> fragmentList;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public void addFragment(Fragment fragment){

        fragmentList.add(fragment);
    }
}


