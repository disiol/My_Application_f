package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.facebook.FacebookSdk;

import bolts.AppLinks;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FacebookSdk.setIsDebugEnabled(true);
        FacebookSdk.fullyInitialize();        // ATTENTION: This was auto-generated to handle app links.

        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();

        Uri appLinkData = appLinkIntent.getData();
        if (appLinkData != null) {
            Log.e("my Log" + this.getLocalClassName(), "App Link appLinkData: " + appLinkData.toString());
        }

        Intent intent = this.getIntent();

        Uri targetUrl =
                AppLinks.getTargetUrlFromInboundIntent(this, intent);
        if (targetUrl != null) {
            Log.e("my Log" + this.getLocalClassName(), "App Link Target URL: " + targetUrl.toString());
        }
    }
}
