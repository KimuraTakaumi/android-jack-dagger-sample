package com.hatenablog.techium.android_dagger2_sample;


import dagger.Component;

@Component(modules = CarModule.class)
public interface CarCompornent {
    IMortor maker();
}
