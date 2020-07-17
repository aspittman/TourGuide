package com.affinityapps.tourguide;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AttractionPagerAdapter extends FragmentStateAdapter {

    private static final int TAB_ITEM_SIZE = 5;
    private static final String HISTORICAL = "historyPosition";
    private static final String OUTDOOR = "outdoorPosition";
    private static final String EVENT = "eventPosition";
    private static final String SIGHTSEEING = "sightseeingPosition";
    private static final String DOWNTOWN = "downtownPosition";

    public AttractionPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        Fragment fragment;
        Bundle args;

        switch (position) {
            case 0:
                fragment = new HistoricalFragment();
                args = new Bundle();
                args.putInt(HISTORICAL, position + 1);
                fragment.setArguments(args);
                return fragment;
            case 1:
                fragment = new OutdoorFragment();
                args = new Bundle();
                args.putInt(OUTDOOR, position + 1);
                fragment.setArguments(args);
                return fragment;
            case 2:
                fragment = new EventFragment();
                args = new Bundle();
                args.putInt(EVENT, position + 1);
                fragment.setArguments(args);
                return fragment;
            case 3:
                fragment = new SightseeingFragment();
                args = new Bundle();
                args.putInt(SIGHTSEEING, position + 1);
                fragment.setArguments(args);
                return fragment;
            default:
                fragment = new DowntownFragment();
                args = new Bundle();
                args.putInt(DOWNTOWN, position + 1);
                fragment.setArguments(args);
                return fragment;
        }
    }

    @Override
    public int getItemCount() {
        return TAB_ITEM_SIZE;
    }
}
