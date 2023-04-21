package com.example.librarysystemtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpPage extends AppCompatActivity {
    
    TextView txtLoginLink;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);

        txtLoginLink = findViewById(R.id.txtLoginLink);
        btnSignUp = findViewById(R.id.btnSignUp);
        
        txtLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpPage.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUpPage.this, "New account created!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignUpPage.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}