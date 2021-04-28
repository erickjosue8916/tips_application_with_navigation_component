package com.example.navigationcomponentexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Page2Fragment extends Fragment {


    public Page2Fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_page2, container, false);
        Button btnBack = (Button) view.findViewById(R.id.page2Back);
        Button btnHome = (Button) view.findViewById(R.id.page2Home);
        Button btnNext = (Button) view.findViewById(R.id.page2Next);

        btnBack.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_page2Fragment_to_page1Fragment));
        btnHome.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_page2Fragment_to_home2));
        btnNext.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_page2Fragment_to_page3Fragment));
        return view;
    }
}