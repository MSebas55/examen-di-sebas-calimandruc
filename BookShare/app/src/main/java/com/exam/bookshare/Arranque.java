package com.exam.bookshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Arranque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arranque);
        openLogin();
        ImageView logoSplash = findViewById(R.id.logoSplash);
        Animation sequentialAnimation = AnimationUtils.loadAnimation(this, R.anim.zoom);
        logoSplash.startAnimation(sequentialAnimation);

        TextView textlogo = findViewById(R.id.textlogo);
        Animation sequentialAnimation2 = AnimationUtils.loadAnimation(this, R.anim.zoom);
        textlogo.startAnimation(sequentialAnimation2);
    }

    public void openLogin(){
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Arranque.this, Acceso.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        }, 2000);
    }
}