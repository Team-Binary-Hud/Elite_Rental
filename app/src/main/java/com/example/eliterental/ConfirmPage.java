package com.example.eliterental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class ConfirmPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_page);

        TextView longText = (TextView) findViewById(R.id.tc_text);
        longText.setMovementMethod(new ScrollingMovementMethod());
    }

    public void goToRecipt() {
        Intent intentRecipt = new Intent(this, RentalRecipt.class);
        startActivity(intentRecipt);
    }

    public void confrimCar(View view){
        goToRecipt();
    }

    public void RejectConfirm(View view){
        goToMainMenu();
    }

    public void goToMainMenu() {
        Intent intentMain = new Intent(this, MainActivity.class);
        startActivity(intentMain);
    }
}
