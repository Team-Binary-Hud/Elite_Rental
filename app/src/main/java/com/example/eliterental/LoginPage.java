package com.example.eliterental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {
    String UsernameExample = "Name123";
    String PasswordExample = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //check if credentials are saved to automatically login.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void checkLoginDetails(View view) {
        TextView logintext = findViewById(R.id.LoginText);
        TextView username = findViewById(R.id.usernametext);
        TextView password = findViewById(R.id.passwordtext);
        if(username.getText().toString().equals(UsernameExample)){
            //would check if username is in database
            if(password.getText().toString().equals(PasswordExample)){
                logintext.setText("Login Correct");
                openMainPage();
                //load next page, save credentials
                //check to see if password is equal to password saved to associated account
            } else {
                logintext.setText("Login Incorrect");
            }
        } else {
            logintext.setText("Login Incorrect");
        }
    }

    public void openMainPage(){
        Intent intentMainMenu = new Intent(this, MainActivity.class);
        startActivity(intentMainMenu);
    }
}
