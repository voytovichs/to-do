package com.voytovichs.todomanager.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.voytovichs.todomanager.fragments.CalendarTabFragment;
import com.voytovichs.todomanager.fragments.NameTabFragment;

/**
 * Created by voytovichs on 08.07.15.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private CharSequence mTitles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created

    public ViewPagerAdapter(FragmentManager fm, CharSequence titles[]) {
        super(fm);
        this.mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: {
                return new NameTabFragment();
            }
            case 1: {
                return new CalendarTabFragment();
            }
            default: {
                throw new IllegalArgumentException("Wrong tab number: " + position);
            }
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }
}