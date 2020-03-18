package com.example.eliterental;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AccountPage extends AppCompatActivity {

    Button showRentals, showDetails;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_page);

        listView = findViewById(R.id.listView);
        showRentals = findViewById(R.id.showRentals);
        showDetails = findViewById(R.id.showDetails);

        ArrayList<String> listOfRentals = new ArrayList<>();
        ArrayList<String> listOfDetails = new ArrayList<>();
        final ListAdapter listAdapterDet = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listOfDetails);
        final ListAdapter listAdapterRent = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listOfRentals);

        listView.setVisibility(View.INVISIBLE);

        listOfDetails.add("Name:  Mike");
        listOfDetails.add("Number:  01111111111");
        listOfDetails.add("Email:  mike@gmail.com");

        listOfRentals.add("tesla x");
        listOfRentals.add("mini");
        listOfRentals.add("sudan");

        showRentals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setAdapter(listAdapterRent);
                showPreviousRentals();
            }
        });

        showDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.setAdapter(listAdapterDet);
                showMyDetails();
            }
        });
    }

    public void showPreviousRentals() {
        listView.clearChoices();
        listView.setVisibility(View.VISIBLE);
        //add data from database to the array list
    }

    public void showMyDetails() {
        listView.clearChoices();
        listView.setVisibility(View.VISIBLE);
        listView.setClickable(false);
        //add data from database to the array list
    }


}
