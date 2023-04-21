package com.example.librarysystemtest;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    EditText edtTextUsername;
    EditText edtTextPassword;
    Button btnLogin;
    TextView txtSignUpLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTextUsername = findViewById(R.id.edtTextUsername);
        edtTextPassword = findViewById(R.id.edtTextPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtSignUpLink = findViewById(R.id.txtSignUpLink);

        //Login button
        btnLogin.setOnClickListener(view -> {
            String username = edtTextUsername.getText().toString().trim();
            String password = edtTextPassword.getText().toString().trim();

            if (TextUtils.isEmpty(username)) {
                edtTextUsername.setError("Please enter username.");
            } else if (TextUtils.isEmpty(password)) {
                edtTextPassword.setError("Please enter password");
            } else {
                boolean isAuthenticated = authenticateUser(username, password);
                if (isAuthenticated) {
                    showStudentDashboard();
                } else {
                    Toast.makeText(MainActivity.this, "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    //Onclick Listener for txt: "here"
        txtSignUpLink.setOnClickListener(view -> showSignUpPage());
}

    //a method that change the activity to showStudentDashboard
    private void showStudentDashboard() {
        //Show pop up message that login successful
        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();

        //Change MainActivity to studentDashboard class
        Intent intent = new Intent(MainActivity.this, StudentDashboard.class);
        startActivity(intent);
        finish();
    }

    //a method that change the activity to showSignUpPage
    private void showSignUpPage() {
        //Change MainActivity to SignUpPage class
        Intent intent = new Intent(MainActivity.this, SignUpPage.class);
        startActivity(intent);
        finish();
    }

    // A method to check if the username and password are valid
    private boolean authenticateUser(String username, String password) {
        // compare username and password and check if its match to the input of the user
        return username.equals("admin") && password.equals("password");
    }
}