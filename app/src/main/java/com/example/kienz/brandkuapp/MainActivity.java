package com.example.kienz.brandkuapp;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.example.kienz.brandkuapp.homeFrag.OnFragmentInteractionListener;

public class MainActivity extends AppCompatActivity implements homeFrag.OnFragmentInteractionListener {
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        PagerAdapter myPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void createTabIcons() {
        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
        tabOne.setText( tabLayout.getTabAt(0).getText());
//        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.ic_explore_24dp, 0, 0);
        tabLayout.getTabAt(0).setCustomView(tabOne);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
