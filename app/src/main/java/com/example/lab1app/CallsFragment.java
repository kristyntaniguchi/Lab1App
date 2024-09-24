package com.example.lab1app;
//Import classes

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//Define a new fragment class called CallsFragment that extends Fragment
public class CallsFragment extends Fragment {
    //Override the onCreateView method
    @Nullable
    @Override
    //Called to create and return the view hierarchy associated with the fragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Inflate the layout for this fragment and return the root view
        //R.layout.fragment_calls refers to the layout resource file for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false);
    }

}
