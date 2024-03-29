package com.oneteam.dagger2example;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    @Inject Engine engine;
    private Wheels wheels;

    @Inject
    public Car( Wheels wheels) {
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListner(this);
    }

    public void drive(){
        Log.d(TAG, "driving ...");
    }
}
