package com.example.kienz.brandkuapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new homeFrag();
        }
        return null;
    }

    @Override

    public int getCount() {
        return 1;
    }

    @Override

    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Home";
            default: return null;
        }
    }
}
