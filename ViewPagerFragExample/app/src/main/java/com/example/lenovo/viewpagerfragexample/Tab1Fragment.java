package com.example.lenovo.viewpagerfragexample;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab1Fragment extends Fragment {

    //Overriden method onCreateView

    private static Tab1Fragment tab1Fragment;

    private Tab1Fragment(){

    }

    public static Tab1Fragment getInstance(){
        if(tab1Fragment==null){
            return  new Tab1Fragment();
        }else {
            return tab1Fragment;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        return inflater.inflate(R.layout.tab1, container, false);
    }
}
