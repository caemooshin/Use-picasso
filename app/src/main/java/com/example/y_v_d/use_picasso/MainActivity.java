package com.example.y_v_d.use_picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imageView2) ImageView imageView2;
    @BindView(R.id.imageView) ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        String imageUri = "https://i.imgur.com/tGbaZCY.jpg";
        //ivBasicImage = (ImageView) findViewById(R.id.ivBasicImage);
        // 2 image view
        Picasso.with(getApplicationContext()).load(imageUri).into(imageView2);
        Picasso.with(getApplicationContext()).load(imageUri).into(imageView);

    }
}
