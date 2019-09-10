package com.oneteam.dagger2example;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    private static final String TAG = "car";

    @Inject
    public Remote() {
    }

    public void setListner(Car car){
        Log.d(TAG, "Remote Connected...");
    }
}
