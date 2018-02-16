package com.example.android.m5_si3904_37_nurcahyadi;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spalshscreen);

        progressBar =  findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
        Toast.makeText(SplashScreen.this,"Selamat Datang !!!",Toast.LENGTH_LONG).show();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), SplashScreen.class));
                Intent a = new Intent(SplashScreen.this,login.class);
                startActivity(a);
                progressBar.setVisibility(View.GONE);
                finish();
            }
        }, 5000L); //1000 L = 1 detik

    }
}
