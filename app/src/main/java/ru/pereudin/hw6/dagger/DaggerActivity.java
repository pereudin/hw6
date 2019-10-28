package ru.pereudin.hw6.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import ru.pereudin.hw6.R;
import ru.pereudin.hw6.dagger.app.App;

public class DaggerActivity extends AppCompatActivity {

    private static final String TAG = "DaggerActivity";

    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        App.getAppComponent().inject(this);
        
        Red red = new Red();
        White white = new White();

        Log.d(TAG, "onCreate: " + green.show());
        Log.i(TAG, "onCreate: " + green);
    }
}
