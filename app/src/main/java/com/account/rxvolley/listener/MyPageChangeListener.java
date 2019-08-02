package com.account.rxvolley.listener;

import androidx.viewpager.widget.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MyPageChangeListener implements ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener {

    private RadioGroup mTabRadioGroup;
    private ViewPager mViewPager;

    public MyPageChangeListener(RadioGroup mTabRadioGroup, ViewPager mViewPager) {
        this.mTabRadioGroup = mTabRadioGroup;
        this.mViewPager = mViewPager;
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int position) {
        RadioButton radioButton = (RadioButton) mTabRadioGroup.getChildAt(position);
        radioButton.setChecked(true);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        for (int i = 0; i < group.getChildCount(); i++) {
            if (group.getChildAt(i).getId() == checkedId) {
                mViewPager.setCurrentItem(i);
                return;
            }
        }
    }
}
