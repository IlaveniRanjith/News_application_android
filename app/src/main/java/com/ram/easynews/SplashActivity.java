package com.ram.easynews;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.DocumentsContract;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        /*RootBeer rootBeer = new RootBeer(context);
        if (rootBeer.isRooted()) {
            //we found indication of root
        } else {
            //we didn't find indication of root
        }*/

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 3000);
    }
}