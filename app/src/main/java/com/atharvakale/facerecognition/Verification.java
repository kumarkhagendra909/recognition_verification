package com.atharvakale.facerecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Verification extends AppCompatActivity {
    TextView verified_user;
    ImageView user_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        user_image = findViewById(R.id.verified_user);
        verified_user = findViewById(R.id.verified);

        // name of verified user
        String dp_name = getIntent().getStringExtra("verified");
        verified_user.setText(dp_name);
        Bitmap bitmapi = getIntent().getParcelableExtra("verified_pic");
        user_image.setImageBitmap(bitmapi);

//        Byte face_pre = getIntent().getByteExtra("verified_user");


    }
}