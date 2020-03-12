package com.example.eliterental;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListViewRental extends ArrayAdapter<RentalCars> {

    private int layoutResource;

    public ListViewRental(Context context, int layoutResource, List<RentalCars> threeStringsList) {
        super(context, layoutResource, threeStringsList);
        this.layoutResource = layoutResource;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            v = layoutInflater.inflate(layoutResource, null);
        }

        RentalCars carRentals = getItem(position);
        //ImageView img = (ImageView) v.findViewById(R.id.imageView);
        TextView carName = (TextView) v.findViewById(R.id.CarNameRental);
        TextView carlocation = (TextView) v.findViewById(R.id.CarLocationRental);
        ImageView ColourImg = (ImageView)v.findViewById(R.id.ColourImgRental);
        //TextView carPrice = (TextView) v.findViewById(R.id.CarPriceRental);
        TextView carType = (TextView) v.findViewById(R.id.CarTypeRental);
        //TextView carYear = (TextView) v.findViewById(R.id.CarYearRental);
        TextView carManufac = (TextView) v.findViewById(R.id.CarManufacRental);
        TextView carColour = (TextView) v.findViewById(R.id.CarColourRental);
        //img.setImageResource(Integer.parseInt(carRentals.getImgLocatiuon()));
        carName.setText(carRentals.getCarName());
        carlocation.setText(carRentals.getLocation());
        //carPrice.setText((int) carRentals.getRentalPrice());
        carType.setText(carRentals.getCarType());
        //carYear.setText(carRentals.getCarYear());
        carManufac.setText(carRentals.getManufac());
        carColour.setText(carRentals.getCarColour());
        String SelectedColour = carRentals.getCarColour();

        if(SelectedColour=="Yellow"){
            ColourImg.setColorFilter(ColourImg.getResources().getColor(R.color.Yellow));
        } else if(SelectedColour=="Black"){
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

        return v;
    }

}
