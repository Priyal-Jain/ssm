package com.esoft.smartstudentmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.esoft.smartstudentmanagement.helper.SharedPrefManager;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    // Splash screen timer
    private static final int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            getActionBar().hide();
        } catch (Exception e) {
            e.printStackTrace();
        }
        setContentView(R.layout.activity_splash);

        //if the user is already logged in we will directly start the profile activity
        if (SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, RoleActivity.class));
            return;
        }
        /*
         * Showing splash screen with a timer. This will be useful when you
         * want to show case your app logo / company
         */
        new Handler().postDelayed(() -> {
            // This method will be executed once the timer is over
            // Start your app Login activity
            Intent i = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(i);
            // close this activity
            finish();
        }, SPLASH_TIME_OUT);
    }
}