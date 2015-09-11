package com.github.hathibelagal.roboguicetutorial;

import android.util.Log;

import com.google.inject.Provider;

public class MyRandomNumberProvider implements Provider<Integer> {

    @Override
    public Integer get() {
        return (int)(Math.random()*1000);
    }
}