package com.example.eliterental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class RentalRecipt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);
        /*TextView CarName = (TextView)findViewById(R.id.CarName);
        TextView CarReceipt = (TextView)findViewById(R.id.CarReceipt);
        TextView CarDate = (TextView)findViewById(R.id.CarDate);
        TextView CarRentalLen = (TextView)findViewById(R.id.CarRentalLen);
        TextView CarPrice = (TextView)findViewById(R.id.CarPrice);
        TextView CarType = (TextView)findViewById(R.id.CarType);
        TextView CarLocation = (TextView)findViewById(R.id.CarLocation);
        TextView CarYear = (TextView)findViewById(R.id.CarYear);
        TextView CarBox = (TextView)findViewById(R.id.CarBox);

        String RecID = "1";
        String DateOfRental = String.valueOf(Calendar.getInstance().getTime());
        String RentalTime = String.valueOf(Calendar.getInstance().getTime());
        double TotalValue = SearchPage.CarRentalID.getRentalPrice();
        String CarBoxID = "Box A1";
        String BoxCode = "A123456";

        CarName.setText("Receipt: "+SearchPage.CarRentalID.getCarName() + " ("+"!"+")");
        CarReceipt.setText("Receipt ID: "+RecID);
        CarDate.setText("Receipt Date: "+RentalTime);
        CarPrice.setText("Total Cost: £"+TotalValue);
        CarType.setText(SearchPage.CarRentalID.getCarType()+" - "+"SEATS"+ " - "+SearchPage.CarRentalID.getCarColour());
        CarLocation.setText("Location: " + SearchPage.CarRentalID.getLocation());
        CarYear.setText(SearchPage.CarRentalID.getManufac()+" - "+SearchPage.CarRentalID.getCarYear());
        CarBox.setText(CarBoxID +" - Code:" +BoxCode);*/
    }

    public void closeReceipt(View view) {
        setContentView(R.layout.activity_main);
    }
}
