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

        RentalCars SelectedRenatlCar = SearchPage.SelectedRenatlCar;

        String SelectCarName = SelectedRenatlCar.getCarName();
        Integer CarYearSelected = SelectedRenatlCar.getCarYear();
        double RentalPriceSelected = SelectedRenatlCar.getRentalPrice();
        String SelectedManufac = SelectedRenatlCar.getManufac();
        String SelectedLocation = SelectedRenatlCar.getLocation();
        String SelectedColour = SelectedRenatlCar.getCarColour();
        String ImgLocation = SelectedRenatlCar.getImgLocatiuon();

        TextView CarName = (TextView)findViewById(R.id.CarNameRental);
        TextView CarPrice = (TextView)findViewById(R.id.CarPriceRental);
        TextView CarType = (TextView)findViewById(R.id.CarTypeRental);
        TextView CarSeatsInfo = (TextView)findViewById(R.id.CarSeatsInfoRental);
        TextView CarSeatsNum = (TextView)findViewById(R.id.CarSeatsNumRental);
        TextView CarLocation = (TextView)findViewById(R.id.CarLocationRental);
        TextView CarManufac = (TextView)findViewById(R.id.CarManufacRental);
        TextView CarYear = (TextView)findViewById(R.id.CarYearRental);
        TextView CarColour = (TextView)findViewById(R.id.CarColourRental);
        ImageView ColourImg = (ImageView)findViewById(R.id.ColourImgRental);
        ImageView imageView = (ImageView)findViewById(R.id.RentalImg);

        if(SelectedColour=="Yellow"){
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Yellow));
        } else if(SelectedColour=="Yellow"){
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Black));
        } else if(SelectedColour=="Blue"){
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Blue));
        } else if(SelectedColour=="Green"){
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Green));
        } else if(SelectedColour=="Purple"){
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Purple));
        } else if(SelectedColour=="White"){
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.White));
        } else if(SelectedColour=="Red"){
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Red));
        } else if(SelectedColour=="Pink"){
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Pink));
        } else if(SelectedColour=="Silver"){
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Silver));
        } else {
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Black));
        }


        CarName.setText(SelectCarName);
        CarColour.setText(SelectedColour);
        //CarType.setText(SelectedManufac);
        //CarSeatsNum.setText("5");
        CarLocation.setText(SelectedLocation);
        CarManufac.setText(SelectedManufac);
        //CarYear.setText(CarYearSelected);
        //CarPrice.setText((int) RentalPriceSelected);

    }

    public void openConfirm(View view) {
        Intent intentConfrim = new Intent(this, ConfirmPage.class);
        startActivity(intentConfrim);
    }
}
