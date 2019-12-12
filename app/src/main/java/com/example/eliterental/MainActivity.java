package com.example.eliterental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    CharSequence UsernameExample = "Name123";
    CharSequence PasswordExample = "password";

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
            if(password.getText() == PasswordExample){
                logintext.setText("Login Correct");
            } else {
                logintext.setText("Login Incorrect");
            }
        } else {
            //logintext.setText("Login Incorrect");
            logintext.setText(username.getText());
        }
    }
}
