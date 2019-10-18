package com.example.uts_d1041161016;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public abstract class MateriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);


    }

    private void initViews() {

        // setting view pager
        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        // setting tabLayout
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        MainFragmentPagerAdapter mainFragmentPagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager());
        mainFragmentPagerAdapter.addFragment(new fragmentServices(), getString(R.string.services));
        mainFragmentPagerAdapter.addFragment(new fragmentActivity(), getString(R.string.activity));
        mainFragmentPagerAdapter.addFragment(new fragmentPermission(), getString(R.string.user_permission));
        mainFragmentPagerAdapter.addFragment(new fragmentContent(), getString(R.string.content_provider));
        mainFragmentPagerAdapter.addFragment(new fragmentIntent(), getString(R.string.intent));
        viewPager.setAdapter(mainFragmentPagerAdapter);
    }
}
