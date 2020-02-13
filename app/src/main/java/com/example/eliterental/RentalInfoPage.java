package com.example.eliterental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RentalInfoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_info_page);
    }

    public void openConfirm(View view) {
        Intent intentConfrim = new Intent(this, ConfirmPage.class);
        startActivity(intentConfrim);

    }
}
