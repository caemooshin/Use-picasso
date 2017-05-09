package com.example.y_v_d.use_picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView ivBasicImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imageUri = "https://i.imgur.com/tGbaZCY.jpg";
        ivBasicImage = (ImageView) findViewById(R.id.ivBasicImage);
        Picasso.with(getApplicationContext()).load(imageUri).into(ivBasicImage);

    }
}
