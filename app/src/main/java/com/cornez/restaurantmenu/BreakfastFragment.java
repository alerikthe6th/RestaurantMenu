package com.cornez.restaurantmenu;

/**
 * Created by Alerik Vi on 11/28/2016.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BreakfastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_breakfast, container, false);
    }
}
