package com.example.banktestjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView tvLogin = findViewById(R.id.tvSignup);
        Button btnSignUp = findViewById(R.id.btnLoginFromLogin);
        ImageButton ibBackSignup = findViewById(R.id.ibBackSignup);

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoginFromTextView = new Intent(SignUp.this, Login.class);
                startActivity(intentLoginFromTextView);
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoginFromButton = new Intent(SignUp.this, Login.class);
                startActivity(intentLoginFromButton);
            }
        });
        ibBackSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMainFromImageButton = new Intent(SignUp.this, MainActivity.class);
                startActivity(intentMainFromImageButton);
            }
        });
    }
}