package ru.pereudin.hw6.dagger;

import android.util.Log;

import javax.inject.Inject;

import ru.pereudin.hw6.dagger.app.App;

public class White {

    private static final String TAG = "White";

    @Inject
    Green green;

    public White() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "White: " + green.show());
        Log.i(TAG, "White: " + green);
    }

}
