package com.hatenablog.techium.android_dagger2_sample;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {
    @Provides
    public IMortor provideCar() {
//        return new CarA();
        return new CarB();
    }
}
