package com.example.eliterental;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterPage extends AppCompatActivity {
    private EditText Name;
    private EditText Email;
    private EditText Password;
    private EditText RePassword;
    private Button create;
    private Button cancel;
    private TextView Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        Name = findViewById(R.id.RegisterName);
        Email = findViewById(R.id.RegisterEmail);
        Password = findViewById(R.id.RegisterPassword);
        RePassword = findViewById(R.id.RegisterRePassword);
        create = findViewById(R.id.RegistrationCreateButton);
        cancel = findViewById(R.id.RegistrationCancelButton);
        Register = findViewById(R.id.RegisterPageTitle);

    }
}
