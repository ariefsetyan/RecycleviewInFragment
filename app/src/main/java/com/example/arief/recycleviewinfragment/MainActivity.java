package com.example.arief.recycleviewinfragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tablayout_id);
        viewPager=findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

//        add fragment her
        adapter.AddFragment(new FragmentCall(),"call");
        adapter.AddFragment(new FragmentContact(),"Content");
        adapter.AddFragment(new FragmentFav(),"Favofis");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star_black_24dp);

//    remove shadow from the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}
