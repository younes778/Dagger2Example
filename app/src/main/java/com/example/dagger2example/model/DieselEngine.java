package com.example.dagger2example.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class DieselEngine implements Engine {

    private static final String TAG = "DieselEngine";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public DieselEngine(@Named("horsePower") int horsePower,@Named("engineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "start with" +
                "\nhorse power : "+horsePower+
                "\nengine capacity : "+engineCapacity
                );
    }
}
