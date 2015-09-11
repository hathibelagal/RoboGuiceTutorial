package com.github.hathibelagal.roboguicetutorial;

import android.util.Log;

import roboguice.activity.RoboActivity;
import roboguice.context.event.OnCreateEvent;
import roboguice.context.event.OnDestroyEvent;
import roboguice.event.Observes;

public class EventsActivity extends RoboActivity {

    // Called when the Activity is created
    public void initialize(@Observes OnCreateEvent e) {
        // Initialization code goes here
    }

    // Called when the Activity is destroyed
    public void cleanup(@Observes OnDestroyEvent e) {
        // Clean up code goes here
    }
}
