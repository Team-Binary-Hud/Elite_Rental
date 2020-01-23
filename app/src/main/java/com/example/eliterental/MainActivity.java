package com.example.eliterental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSearchPage(View view) {
        Intent intentSearch = new Intent(this, SearchPage.class);
        startActivity(intentSearch);
    }

    public void openMapsPage(View view) {
    }

    public void openAccountsPage(View view) {
    }
}
