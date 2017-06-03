package com.rocdev.adexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class BannerActivity extends AppCompatActivity {

    private AdView mAddView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        mAddView = (AdView) findViewById(R.id.addView);
        AdRequest adRequest = new AdRequest.Builder().build();
        ToastListener tl = new ToastListener(this);
        mAddView.setAdListener(tl);
        mAddView.loadAd(adRequest);
    }
}
