package com.exam.bookshare;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Acceso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso);
        ImageView background = findViewById(R.id.backgroundSplash);
        Glide.with(this)
                .load("https://plus.unsplash.com/premium_photo-1676422355165-d809008b8342?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Ym9va3N8ZW58MHx8MHx8fDA%3D")
                .centerCrop()
                .into(background);
    }

    public void openRegister(View view) {
        Intent nIntent = new Intent(Acceso.this, Registro.class);
        startActivity(nIntent);
    }
    public void openPrincipal(View view) {
        Toast toast = Toast.makeText(Acceso.this, "Entrar a Principal", Toast.LENGTH_LONG);
        toast.show();
    }
}