package com.example.eliterental;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterPage extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
    private EditText name;
    private EditText email;
    private EditText password;
    private EditText rePassword;
    private EditText phoneNumber;
    private EditText postCode;
    private EditText licence;
    private EditText licenceDate;
    private DatePickerDialog datePicker;
    private EditText DOB;
    private EditText userName;
    private EditText licenceNumber;
    private EditText licenceDate;

    private static final String TAG = "RegisterPage";

    private DatePickerDialog.OnDateSetListener dateSetListener;
    private TextView mDisplayDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        licence = findViewById(R.id.LicenseNumber);
        userName = findViewById(R.id.username);
        licenceDate = findViewById(R.id.LicenseDOE);
        mDisplayDate = findViewById(R.id.date);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });

        dateSetListener = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;

                Log.d(TAG, "onDateSet : mm/dd/yyy: " + month + "/" + dayOfMonth + "/" + year);
                String date = month + "/" + dayOfMonth + "/" + year;
                mDisplayDate.setText(date);
            }
        };

        name = findViewById(R.id.RegisterName);
        email = findViewById(R.id.RegisterEmail);
        phoneNumber = findViewById(R.id.phoneNumber);
        password = findViewById(R.id.RegisterPassword);
        rePassword = findViewById(R.id.RegisterRePassword);
        Button registerButton = findViewById(R.id.RegistrationButton);
        postCode = findViewById(R.id.addressPostCode);
        DOB = findViewById(R.id.DateOfBirth);

        licenceDate.setInputType(InputType.TYPE_NULL);
        licenceDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                datePicker = new DatePickerDialog(RegisterPage.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                licenceDate.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                datePicker.show();
            }
        });

        DOB.setInputType(InputType.TYPE_NULL);
        DOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                datePicker = new DatePickerDialog(RegisterPage.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                DOB.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                datePicker.show();
            }
        });

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

        return email;
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
        return name && whiteSpaces <= 1;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    private boolean phoneStringCheck() {
        boolean phoneN = true;
        char ch;
        int phoneNumLength = 0;
        char firstChar;

        firstChar = phoneNumber.getText().charAt(0);

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
            else if (firstChar != 0)
                phoneN = false;
        }
        return phoneN && phoneNumLength == 11;
    }

    private boolean postCodeCheck() {
        String regex = "^[A-Z]{1,2}[0-9R][0-9A-Z]? [0-9][ABD-HJLNP-UW-Z]{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(postCode.getText().toString());

        return matcher.matches();
    }

    private boolean licenceCheck() {
        return licence.getText().length() == 16;
    }

    private boolean userNameCheck() {
        String userNameString = userName.getText().toString();
        boolean userCheck = true;

        if (userNameString.isEmpty())
            userCheck = false;
        if (userNameString.length() < 4 || userNameString.length() > 11)
            userCheck = false;
        return userCheck;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void credentialChecker() {

        Intent intentLogin = new Intent(this, LoginPage.class);
        if (!nameStringCheck() || name.getText().toString().isEmpty()) {
            Toast.makeText(this, "Not a valid name", Toast.LENGTH_SHORT).show();
        } else if (!phoneStringCheck() || phoneNumber.getText().toString().isEmpty()) {
            Toast.makeText(this, "Not a valid Number", Toast.LENGTH_SHORT).show();
        } else if (!postCodeCheck()) {
            Toast.makeText(this, "Not a valid Post Code", Toast.LENGTH_SHORT).show();
        } else if (!emailStringCheck()) {
            Toast.makeText(this, "Not a valid email", Toast.LENGTH_SHORT).show();
        } else if (!userNameCheck()) {
            Toast.makeText(this, "User name must be between 5-10 characters long", Toast.LENGTH_SHORT).show();
        } else if (password.getText().toString().length() < 8) {
            Toast.makeText(this, "Password needs to be at least 8 characters", Toast.LENGTH_SHORT).show();
        } else if (!passwordStringCheck()) {
            Toast.makeText(this, "password needs at least:\nOne Uppercase:One Lowercase:\nOne Special Character:One Number", Toast.LENGTH_LONG).show();
        } else if (!(password.getText().toString().equals(rePassword.getText().toString()))) {
            Toast.makeText(this, "Password entered did not match", Toast.LENGTH_SHORT).show();
        } else if (!licenceCheck()) {
            Toast.makeText(this, "Not valid Licence", Toast.LENGTH_SHORT).show();
        } else startActivity(intentLogin);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);

        String currentDate = DateFormat.getDateInstance().format(c.getTime());

        mDisplayDate.setText(currentDate);
    }
}