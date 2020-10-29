package com.example.tabsandswipe.ui.main;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tabsandswipe.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private static final String ARG_SECTION_NUMBER = "section_number";

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3,};
    private final Context mContext;


    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        Bundle args;
        switch (position) {
            case 0:
                fragment = new FirstActivity();
                args = new Bundle();
                args.putInt(ARG_SECTION_NUMBER, position + 1);
                fragment.setArguments(args);
                break;
            case 1:
                fragment = new SecondActivity();
                args = new Bundle();
                args.putInt(ARG_SECTION_NUMBER, position + 1);
                fragment.setArguments(args);
                break;
            case 2:
                fragment = new ThirdActivity();
                args = new Bundle();
                args.putInt(ARG_SECTION_NUMBER, position + 1);
                fragment.setArguments(args);
                break;
        }
        return fragment;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}