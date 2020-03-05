package com.example.eliterental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RentalInfoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rental_info_page);
        TextView CarName = (TextView)findViewById(R.id.CarName);
        TextView CarPrice = (TextView)findViewById(R.id.CarPrice);
        TextView CarType = (TextView)findViewById(R.id.CarType);
        TextView CarSeatsInfo = (TextView)findViewById(R.id.CarSeatsInfo);
        TextView CarSeatsNum = (TextView)findViewById(R.id.CarSeatsNum);
        TextView CarLocation = (TextView)findViewById(R.id.CarLocation);
        TextView CarManufac = (TextView)findViewById(R.id.CarManufac);
        TextView CarYear = (TextView)findViewById(R.id.CarYear);
        TextView CarColour = (TextView)findViewById(R.id.CarColour);
        ImageView ColourImg = (ImageView)findViewById(R.id.ColourImg);
        ImageView ManufacImg = (ImageView)findViewById(R.id.ManufacImg);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);

        ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Yellow));

        CarName.setText(SearchPage.CarRentalID.getCarRentalID());
        CarPrice.setText((int) SearchPage.CarRentalID.getRentalPrice());
        CarType.setText(SearchPage.CarRentalID.getCarType());
        //CarSeatsNum.setText(SearchPage.CarRentalID.);
        CarLocation.setText(SearchPage.CarRentalID.getLocation());
        CarManufac.setText(SearchPage.CarRentalID.getManufac());
        CarYear.setText(SearchPage.CarRentalID.getCarYear());
        CarColour.setText(SearchPage.CarRentalID.getCarColour());
    }

    public void openConfirm(View view) {
        Intent intentConfrim = new Intent(this, ConfirmPage.class);
        startActivity(intentConfrim);
    }
}
