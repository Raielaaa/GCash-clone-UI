package com.example.banktestjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView ibBack = findViewById(R.id.ibBackSignup);
        TextView tvSignUp = findViewById(R.id.tvSignup);
        Button btnLoginFromLogin = findViewById(R.id.btnLoginFromLogin);

        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMain = new Intent(Login.this, MainActivity.class);
                startActivity(intentMain);
            }
        });
        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignUp = new Intent(Login.this, SignUp.class);
                startActivity(intentSignUp);
            }
        });
        btnLoginFromLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMainFrame = new Intent(Login.this, MainFrame.class);
                startActivity(intentMainFrame);
            }
        });
    }
}