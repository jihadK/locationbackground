package com.kamil.locationbackground;

import android.content.Context;
import android.location.Location;
import android.preference.PreferenceManager;

import java.text.DateFormat;
import java.util.Date;

public class Common {

    public static final String KEY_REQUSTING_LOCATION_UPDATES = "LocationUpdatesEnable";

    public static String getLocationText(Location mLocation) {
        System.out.println("");
        return mLocation == null ? "Unknown Location : " : new StringBuilder()
                .append(mLocation.getLatitude())
                .append("/")
                .append(mLocation.getLongitude())
                .toString();
    }

    public static CharSequence getLocationTitle(MyBackgroundService myBackgroundService) {
        return String.format("Location Update : %1$s", DateFormat.getDateInstance().format(new Date()));
    }

    public static void setRequstingLocationUpdate(Context context, boolean value) {
        PreferenceManager
                .getDefaultSharedPreferences(context)
                .edit()
                .putBoolean(KEY_REQUSTING_LOCATION_UPDATES, value)
                .apply();
    }

    public static boolean requstingLocationUpdate(Context context) {
        return PreferenceManager
                .getDefaultSharedPreferences(context)
                .getBoolean(KEY_REQUSTING_LOCATION_UPDATES, false);
    }
}
