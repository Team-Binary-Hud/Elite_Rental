package com.example.eliterental;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {
    String UsernameExample = "Name123";
    String PasswordExample = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkLoginDetails(View view) {
        TextView logintext = findViewById(R.id.LoginText);
        TextView username = findViewById(R.id.usernametext);
        TextView password = findViewById(R.id.passwordtext);
        if(username.getText() == UsernameExample){
            //would check if username is in database
            if(password.getText() == PasswordExample){
                logintext.setText("Login Correct");
                //check to see if password is equal to password saved to associated account
            } else {
                logintext.setText("Login Incorrect");
            }
        } else {
            //logintext.setText("Login Incorrect");
            logintext.setText(username.getText());
        }
    }
}
