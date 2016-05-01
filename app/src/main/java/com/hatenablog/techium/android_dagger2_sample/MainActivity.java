package com.hatenablog.techium.android_dagger2_sample;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject
    IMortor mMortor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMortor = DaggerCarCompornent.create().maker();
        mMortor.start();
        mMortor.stop();
    }
}
