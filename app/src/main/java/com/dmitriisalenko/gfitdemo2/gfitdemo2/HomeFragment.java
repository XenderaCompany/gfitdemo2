package com.dmitriisalenko.gfitdemo2.gfitdemo2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceBundle) {
        return inflater.inflate(R.layout.home_layout, container, false);
    }
}
