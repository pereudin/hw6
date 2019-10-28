package ru.pereudin.hw6.noDi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.pereudin.hw6.R;

public class NoDiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_di);

        Green green = new Green();
        Red red = new Red();
        White white = new White();

    }
}
