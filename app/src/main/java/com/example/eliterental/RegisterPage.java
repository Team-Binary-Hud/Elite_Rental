package com.example.eliterental;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterPage extends AppCompatActivity {
    private EditText Name;
    private EditText Email;
    private EditText Password;
    private EditText RePassword;
    private Button RegisterButton;
    private TextView Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        Name = findViewById(R.id.RegisterName);
        Email = findViewById(R.id.RegisterEmail);
        Password = findViewById(R.id.RegisterPassword);
        RePassword = findViewById(R.id.RegisterRePassword);
        RegisterButton = findViewById(R.id.RegistrationButton);
        Register = findViewById(R.id.RegisterPageTitle);

        RegisterButton.setOnClickListener(new View.OnClickListener() {
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
    public boolean passwordStringCheck() {
        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean specialChar = false;
        for (int i = 0; i < Password.getText().length(); i++) {
            ch = Password.getText().charAt(i);
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

    public boolean emailStringCheck() {
        char ch;
        boolean email = false;

        String emailText = Email.getText().toString();
        if (!emailText.startsWith("@") || !emailText.endsWith("@") || emailText.contains("@") || emailText.length() > 6 || emailText.contains(".com") || emailText.contains(".co.uk")){
            email = true;
        }

        if (email) return true;
        else return false;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void credentialChecker() {

        Intent intentLogin = new Intent(this, LoginPage.class);
        if (!(Password.getText().toString().equals(RePassword.getText().toString())))
            Toast.makeText(this, "Password did not match", Toast.LENGTH_SHORT).show();
        else if (Password.getText().toString().length() < 8) {
            Toast.makeText(this, "Needs to be at least 8 characters", Toast.LENGTH_SHORT).show();
        } else if (!passwordStringCheck()) {
            Toast.makeText(this, "One uppercase letter, lowercase letter, special character and number is required", Toast.LENGTH_SHORT).show();
        } else if (!emailStringCheck()) {
            Toast.makeText(this, "Not a valid Email", Toast.LENGTH_SHORT).show();
        } else startActivity(intentLogin);
    }
}
