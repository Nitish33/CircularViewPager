package com.devnitish.circularviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.pager);

        SampleFragment s1 = new SampleFragment(1);
        SampleFragment s12 = new SampleFragment(1);
        SampleFragment s2 = new SampleFragment(2);
        SampleFragment s3 = new SampleFragment(3);
        SampleFragment s4 = new SampleFragment(4);
        SampleFragment s5 = new SampleFragment(5);
        SampleFragment s52 = new SampleFragment(5);



        MyPagerAdapter myPagerAdapter  = new MyPagerAdapter(getSupportFragmentManager());
        myPagerAdapter.addFragment(s52);
        myPagerAdapter.addFragment(s1);
        myPagerAdapter.addFragment(s2);
        myPagerAdapter.addFragment(s3);
        myPagerAdapter.addFragment(s4);
        myPagerAdapter.addFragment(s5);
        myPagerAdapter.addFragment(s12);

        pager.setAdapter(myPagerAdapter);
        pager.setCurrentItem(1,true);
        pager.setOnPageChangeListener(new MyPageListener(pager));
    }
}
