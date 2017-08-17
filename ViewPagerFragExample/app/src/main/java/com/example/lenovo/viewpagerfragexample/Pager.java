package com.example.lenovo.viewpagerfragexample;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount = tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                Tab1Activity tab1 = new Tab1Activity();
                return tab1;
            case 1:
                Tab2Activity tab2 = new Tab2Activity();
                return tab2;
            case 2:
                Tab3Activity tab3 = new Tab3Activity();
                return tab3;
            case 3:
                Tab4Activity tab4 = new Tab4Activity();
                return tab4;
            case 4:
                Tab5Activity tab5 = new Tab5Activity();
                return tab5;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}

