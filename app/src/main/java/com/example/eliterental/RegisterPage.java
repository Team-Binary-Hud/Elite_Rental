package com.example.eliterental;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterPage extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText password;
    private EditText rePassword;
    private EditText phoneNumber;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        name = findViewById(R.id.RegisterName);
        email = findViewById(R.id.RegisterEmail);
        phoneNumber = findViewById(R.id.phoneNumber);
        password = findViewById(R.id.RegisterPassword);
        rePassword = findViewById(R.id.RegisterRePassword);
        registerButton = findViewById(R.id.RegistrationButton);


        registerButton.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    credentialChecker();
                }
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private boolean passwordStringCheck() {
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean specialChar = false;
        for (int i = 0; i < password.getText().length(); i++) {
            ch = password.getText().charAt(i);
            if (Character.isDigit(ch)) {
                numberFlag = true;
            } else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            } else if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
                specialChar = true;
            }
            if (numberFlag && capitalFlag && lowerCaseFlag && specialChar)
                return true;
        }
        return false;
    }

    private boolean emailStringCheck() {
        boolean email = false;

        String emailText = this.email.getText().toString();
        if (!emailText.isEmpty() && !emailText.startsWith("@") && !emailText.endsWith("@") && emailText.contains("@") &&
                emailText.length() > 6 && emailText.endsWith("gmail.com") || emailText.endsWith(".co.uk")) {
            email = true;
        }

        if (email) return true;
        else return false;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private boolean nameStringCheck() {
        boolean name = true;
        char ch;
        int whiteSpaces = 0;

        for (int i = 0; i < this.name.getText().length(); i++) {
            ch = this.name.getText().charAt(i);
            if (Character.isDigit(ch))
                name = false;
            else if (!Character.isAlphabetic(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch))
                name = false;
            else if (Character.isWhitespace(ch))
                whiteSpaces++;
        }
        if (!name || whiteSpaces > 1) return false;
        else return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private boolean phoneStringCheck() {
        boolean phoneN = true;
        char ch;
        int phoneNumLength = 0;

        for (int i = 0; i < this.phoneNumber.getText().length(); i++) {
            ch = this.phoneNumber.getText().charAt(i);
            if (Character.isAlphabetic(ch))
                phoneN = false;
            else if (!Character.isAlphabetic(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch))
                phoneN = false;
            else if (Character.isWhitespace(ch))
                phoneN = false;
            else if (Character.isDigit(ch))
                phoneNumLength++;
        }
        if (!phoneN || phoneNumLength != 10) return false;
        else return true;
    }

    private boolean postCodeCheck() {
        boolean postCode = true;
        char ch;

        return false;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void credentialChecker() {

        Intent intentLogin = new Intent(this, LoginPage.class);
        if (!nameStringCheck() || name.getText().toString().isEmpty()) {
            Toast.makeText(this, "Not a valid name", Toast.LENGTH_SHORT).show();
        } else if (!emailStringCheck()) {
            Toast.makeText(this, "Not a valid email", Toast.LENGTH_SHORT).show();
        } else if (!phoneStringCheck() || phoneNumber.getText().toString().isEmpty()) {
            Toast.makeText(this, "Not a valid Number", Toast.LENGTH_SHORT).show();
        } else if (password.getText().toString().length() < 8) {
            Toast.makeText(this, "Password needs to be at least 8 characters", Toast.LENGTH_SHORT).show();
        } else if (!passwordStringCheck()) {
            Toast.makeText(this, "password needs at least:\nOne Uppercase:One Lowercase:\nOne Special Character:One Number", Toast.LENGTH_LONG).show();
        } else if (!(password.getText().toString().equals(rePassword.getText().toString()))) {
            Toast.makeText(this, "Password entered did not match", Toast.LENGTH_SHORT).show();
        } else startActivity(intentLogin);
    }
}