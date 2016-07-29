package com.example.picassoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ImageView img, img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.img_main);
        img2= (ImageView) findViewById(R.id.img_main2);

    }

    public void getPic(View view) {

        Picasso.with(this).load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Rotating_earth_%28large%29.gif/200px-Rotating_earth_%28large%29.gif").into(img);
        GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(img2);
        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Rotating_earth_%28large%29.gif/200px-Rotating_earth_%28large%29.gif").into(imageViewTarget);
    }
}
