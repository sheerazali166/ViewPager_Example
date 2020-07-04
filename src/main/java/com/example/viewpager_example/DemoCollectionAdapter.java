package com.example.viewpager_example;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class DemoCollectionAdapter extends FragmentStatePagerAdapter {

    public DemoCollectionAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        DemoFragment demoFragment = new DemoFragment();
        Bundle bundle = new Bundle();
        position = position + 1;
        bundle.putString("message", "Hello from page " + position);
        demoFragment.setArguments(bundle);

        return demoFragment;
    }

    @Override
    public int getCount() {
        return 100;
    }
}
