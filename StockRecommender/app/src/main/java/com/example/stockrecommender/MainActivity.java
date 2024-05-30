package com.example.stockrecommender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set intents to login and signup
        Intent loginintent = new Intent(MainActivity.this, LoginPage.class);
        Intent signupintent = new Intent(this,SignupPage.class);

        //when buttons clicked, sends to login or signup page
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(loginintent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(signupintent);
            }
        });






    }
}