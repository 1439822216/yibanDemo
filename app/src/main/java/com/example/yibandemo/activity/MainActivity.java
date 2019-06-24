package com.example.yibandemo.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.yibandemo.R;
import com.example.yibandemo.fragment.FaxianFragment;
import com.example.yibandemo.fragment.HomeFragment;
import com.example.yibandemo.fragment.LianxirenFragment;
import com.example.yibandemo.fragment.LiaotianFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fragment> fragmentList;
    TabLayout tabLayout;
    ViewPager viewPager;
    String[] titles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiView();
        titles = new String[]{"首页","聊天","联系人","探究"};
        fragmentList = new ArrayList<>();
        fragmentList.add(new HomeFragment());
        fragmentList.add(new LiaotianFragment());
        fragmentList.add(new LianxirenFragment());
        fragmentList.add(new FaxianFragment());
        MyFragmentAdapter adapter = new MyFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.removeAllTabs();
        tabLayout.addTab(tabLayout.newTab().setText(titles[0]).setIcon(R.drawable.menu_shouye_selector));
        tabLayout.addTab(tabLayout.newTab().setText(titles[1]).setIcon(R.drawable.menu_liaotian_selector));
        tabLayout.addTab(tabLayout.newTab().setText(titles[2]).setIcon(R.drawable.menu_lianxiren_selector));
        tabLayout.addTab(tabLayout.newTab().setText(titles[3]).setIcon(R.drawable.menu_faxian_selector));
    }

    private void intiView() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
    }

    class MyFragmentAdapter extends FragmentPagerAdapter{


        public MyFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }

}
