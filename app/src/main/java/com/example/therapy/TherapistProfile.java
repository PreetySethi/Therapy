package com.example.therapy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TherapistProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapist_profile);

        getSupportActionBar().setTitle("Therapist Profile");
    }
}
