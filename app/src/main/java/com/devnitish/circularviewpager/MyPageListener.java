package com.devnitish.circularviewpager;

import android.support.v4.view.ViewPager;

/**
 * Created by Nitish Prasad on 3/3/2018.
 */

public class MyPageListener implements ViewPager.OnPageChangeListener {

    ViewPager pager;
    int pageCount;

    public MyPageListener(ViewPager pager) {
        this.pager = pager;
        this.pageCount = pager.getAdapter().getCount();

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

        if(position==0){
           pager.setCurrentItem(pageCount-2,false);
        }
        else if(position == pageCount-1){
            pager.setCurrentItem(1,false);
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
