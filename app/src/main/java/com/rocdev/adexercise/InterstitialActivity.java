package com.rocdev.adexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class InterstitialActivity extends AppCompatActivity {

    Button mLoadInterstitialButton;
    Button mShowInterstitialButton;
    InterstitialAd mInterstitial;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial);
        mLoadInterstitialButton = (Button) findViewById(R.id.loadInterstitialButton);
        mShowInterstitialButton = (Button) findViewById(R.id.showInterstitialButton);
        mShowInterstitialButton.setEnabled(false);
    }


    public void loadInterstitial(View view) {
        mLoadInterstitialButton.setEnabled(false);
        mShowInterstitialButton.setText("Loading Interstitial");
        mInterstitial = new InterstitialAd(this);
        mInterstitial.setAdUnitId(getResources().getString(R.string.interstitial_ad_unit_id));
        mInterstitial.setAdListener(new ToastListener(this) {
            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
                mShowInterstitialButton.setText(getErrorMessage());
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                mShowInterstitialButton.setText("Show Interstitial");
                mShowInterstitialButton.setEnabled(true);
            }
        });
        AdRequest ar = new AdRequest.Builder().build();
        mInterstitial.loadAd(ar);


    }
}
