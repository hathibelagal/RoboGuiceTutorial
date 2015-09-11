package com.github.hathibelagal.roboguicetutorial;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import com.google.inject.Inject;

import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectPreference;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_main)
public class MainActivity extends RoboActivity {

    @InjectView(R.id.email)
    private TextView email;

    @InjectView(R.id.okay)
    private Button okay;

    @InjectResource(R.color.red)
    private ColorStateList red;

    @InjectResource(R.drawable.square)
    private Drawable square;

    @InjectResource(R.string.hello)
    private String hello;

    @InjectResource(R.anim.fade)
    private Animation fade;

    @Inject
    private PowerManager pm;

    @Inject
    private MySingleton singleton;

    @Inject
    Integer random1; // Initialized to a random number

    @Inject
    Integer random2; // Initialized to another random number

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
