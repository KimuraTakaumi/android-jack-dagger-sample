package com.hatenablog.techium.android_dagger2_sample;

import android.util.Log;

public class CarB implements IMortor {

    @Override
    public void start() {
        Log.e("techium", "CarB start");
    }

    @Override
    public void stop() {
        Log.e("techium", "CarB stop");

    }
}
