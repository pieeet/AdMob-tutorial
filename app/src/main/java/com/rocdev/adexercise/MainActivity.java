package com.rocdev.adexercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToBannerActivity(View view) {
        startActivity(new Intent(this, BannerActivity.class));
    }

    public void goToInterstitialActivity(View view) {
        startActivity(new Intent(this, InterstitialActivity.class));
    }
}
