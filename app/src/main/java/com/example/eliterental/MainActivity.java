package com.example.eliterental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button accountButton = findViewById(R.id.accounts_button);

        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccountsPage();
            }
        });
    }

    public void openSearchPage(View view) {
        Intent intentSearch = new Intent(this, SearchPage.class);
        startActivity(intentSearch);
    }

    public void openMapsPage(View view) {
    }

    public void openAccountsPage() {
        Intent intentAccount = new Intent(this, AccountPage.class);
        startActivity(intentAccount);
    }

    public void openLocationsPage(View view) {
    }
}
