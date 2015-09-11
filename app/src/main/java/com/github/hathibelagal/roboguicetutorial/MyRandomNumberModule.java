package com.github.hathibelagal.roboguicetutorial;

import android.util.Log;

import com.google.inject.AbstractModule;

public class MyRandomNumberModule extends AbstractModule {

    @Override
    public void configure() {
        // Bind Integer to MyRandomNumberProvider
        bind(Integer.class)
                .toProvider(MyRandomNumberProvider.class);
    }
}