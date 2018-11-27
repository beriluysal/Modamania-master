package com.modart.modamania.home;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.modart.modamania.R;
import com.modart.modamania.helper.CustomViewPager;
import com.modart.modamania.helper.ViewPagerAdapter;
import com.modart.modamania.maintabs.AddPostFragment;
import com.modart.modamania.maintabs.HomeFragment;
import com.modart.modamania.maintabs.MyProfileFragment;
import com.modart.modamania.maintabs.NotificationFragment;
import com.modart.modamania.maintabs.TrendingFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    MenuItem prevMenuItem;

    @BindView(R.id.viewpager)
    CustomViewPager viewPager;
    @BindView(R.id.bottomNav)
    BottomNavigationViewEx bottomNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        setUpViewPagerUI();
        bottomNavOnClick();
       // bottomNav.enableAnimation(false);
       /* bottomNav.enableItemShiftingMode(false);
        bottomNav.enableShiftingMode(false);
        bottomNav.setIconSize(24,24);
        bottomNav.setTextVisibility(true);
        bottomNav.setTextSize(11);*/
    }

    private void setUpViewPagerUI() {
        viewPager.setPagingEnabled(false);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (prevMenuItem != null) {
                    prevMenuItem.setChecked(false);
                }
                else
                {
                    bottomNav.getMenu().getItem(0).setChecked(false);
                }

                bottomNav.getMenu().getItem(position).setChecked(true);
                prevMenuItem = bottomNav.getMenu().getItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        viewPager.setOffscreenPageLimit(4);
        setupViewPager(viewPager);



    }

    private void setupViewPager(CustomViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new TrendingFragment());
        adapter.addFragment(new AddPostFragment());
        adapter.addFragment(new NotificationFragment());
        adapter.addFragment(new MyProfileFragment());
        viewPager.setAdapter(adapter);


    }


    private void bottomNavOnClick() {


       // bottomNav.enableAnimation(false);



        bottomNav.setOnNavigationItemSelectedListener(menuItem -> {

            switch (menuItem.getItemId()){

                case R.id.action_home:

                    viewPager.setCurrentItem(0,false);

                    return true;
                case R.id.action_trending:
                    viewPager.setCurrentItem(1,false);
                    return true;
                case R.id.action_addpost:
                    viewPager.setCurrentItem(2,false);
                    return true;
                case R.id.action_notify:
                    viewPager.setCurrentItem(3,false);
                    return true;
                case R.id.action_prof:
                    viewPager.setCurrentItem(4,false);
                    return true;


            }



            return false;
        });


    }
}
