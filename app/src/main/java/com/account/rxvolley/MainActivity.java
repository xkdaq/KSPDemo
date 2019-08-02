package com.account.rxvolley;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;

import com.account.myapplication.R;
import com.account.rxvolley.fragment.HomeFragment;
import com.account.rxvolley.listener.MyFragmentPagerAdapter;
import com.account.rxvolley.listener.MyPageChangeListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private RadioGroup mTabRadioGroup;
    private List<Fragment> mFragments;
    private FragmentPagerAdapter mAdapter;
    private MyPageChangeListener myPageChangeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.fragment_vp);
        mTabRadioGroup = findViewById(R.id.tabs_rg);
        mFragments = new ArrayList<>();
        mFragments.add(HomeFragment.newInstance());
        mFragments.add(HomeFragment.newInstance());
        mAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), mFragments);
        mViewPager.setAdapter(mAdapter);
        myPageChangeListener = new MyPageChangeListener(mTabRadioGroup, mViewPager);
        mViewPager.addOnPageChangeListener(myPageChangeListener);
        mTabRadioGroup.setOnCheckedChangeListener(myPageChangeListener);
    }
}
