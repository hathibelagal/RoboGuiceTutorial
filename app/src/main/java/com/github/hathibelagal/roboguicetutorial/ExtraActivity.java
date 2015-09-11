package com.github.hathibelagal.roboguicetutorial;

import android.os.Bundle;
import android.util.Log;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectExtra;

public class ExtraActivity extends RoboActivity {

    @InjectExtra(value = "EMAIL_ADDRESS", optional = true)
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
