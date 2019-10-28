package ru.pereudin.hw6.di;

import android.util.Log;

public class White {

    private static final String TAG = "White";

    private Green green;

    public White(Green green) {
        this.green = green;
        Log.d(TAG, "White: " + green.show());
        Log.i(TAG, "White: " + green);
    }

}
