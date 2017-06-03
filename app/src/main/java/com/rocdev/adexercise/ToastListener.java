package com.rocdev.adexercise;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;

/**
 * Created by piet on 03-06-17.
 */

public class ToastListener extends AdListener {

    Context context;
    int errorCode;

    public ToastListener(Context context) {
        this.context = context;
    }

    @Override
    public void onAdClosed() {
        Toast.makeText(context, "onAdClosed() started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdFailedToLoad(int i) {
        errorCode = i;
        Toast.makeText(context, getErrorMessage(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onAdLeftApplication() {
        Toast.makeText(context, "onAdLeftApplication() started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdOpened() {
        Toast.makeText(context, "onAddOpened() started", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAdLoaded() {
        Toast.makeText(context, "onAddLoaded() started", Toast.LENGTH_SHORT).show();
    }

    public String getErrorMessage() {
        switch (errorCode) {
            case AdRequest.ERROR_CODE_INTERNAL_ERROR:
                return "Internal error";
            case AdRequest.ERROR_CODE_INVALID_REQUEST:
                return "Invalid request";
            case AdRequest.ERROR_CODE_NETWORK_ERROR:
                return "Network error";
            case AdRequest.ERROR_CODE_NO_FILL:
                return "No fill error";
            default:
                return "Unknown error";

        }
    }
}
