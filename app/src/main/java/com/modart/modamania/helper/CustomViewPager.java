package com.modart.modamania.helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.MotionEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mekso on 25.10.2017.
 */

public class CustomViewPager extends android.support.v4.view.ViewPager {
    private boolean enabled;
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.enabled = true;
    }


    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }
    public int getCount() {
        return mFragmentList.size();
    }
    public void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);

    }



    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return enabled && super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return enabled && super.onInterceptTouchEvent(event);
    }

    public void setPagingEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isPagingEnabled() {
        return enabled;
    }

}
