package ru.pereudin.hw6.di;

import android.util.Log;

public class Red {

    private static final String TAG = "Red";

    private Green green;

    public Red(Green green) {
        this.green = green;
        Log.d(TAG, "Red: " + green.show());
        Log.i(TAG, "Red: " + green);
    }

}
