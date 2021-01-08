package com.kamil.locationbackground;

import android.location.Location;

public class SendLocationToActivity {
    private Location location;

    public SendLocationToActivity(Location location) {
        System.out.println("");
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
