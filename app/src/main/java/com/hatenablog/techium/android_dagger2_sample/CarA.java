package com.hatenablog.techium.android_dagger2_sample;

import android.util.Log;

public class CarA implements IMortor {

    @Override
    public void start() {
        Log.e("techium", "CarA start");
    }

    @Override
    public void stop() {
        Log.e("techium", "CarA stop");

    }
}
