package com.atharvakale.facerecognition;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Verification extends AppCompatActivity {
    TextView verified_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        verified_user = findViewById(R.id.verified);
    }
}