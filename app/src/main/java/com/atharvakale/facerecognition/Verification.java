package com.atharvakale.facerecognition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraSelector;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Verification extends AppCompatActivity {
    TextView verified_user, verifiedscreenlabel;
    ImageView user_image;
    CameraSelector cameraSelector;
    Context context= Verification.this; // Context of this screen
    int cam_face= CameraSelector.LENS_FACING_BACK; // cameraFacing
    boolean start=true, flipX=false; // camera Flipping

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

        user_image = findViewById(R.id.verified_user);
        verified_user = findViewById(R.id.verified);
        verifiedscreenlabel = findViewById(R.id.verified_screen_label);

        // name of verified user
        String dp_name = getIntent().getStringExtra("verified");
        if(dp_name != null){
            verified_user.setText(dp_name);
        }
        Bitmap bitmapi = getIntent().getParcelableExtra("verified_pic");
        if (bitmapi != null){
            user_image.setImageBitmap(bitmapi);
        }
    }
}