package com.example.eliterental;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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
        TextView carName = (TextView) v.findViewById(R.id.CarName);
        TextView carlocation = (TextView) v.findViewById(R.id.CarLocation);
        //TextView carPrice = (TextView) v.findViewById(R.id.CarPrice);
        TextView carType = (TextView) v.findViewById(R.id.CarType);
        //TextView carYear = (TextView) v.findViewById(R.id.CarYear);
        TextView carManufac = (TextView) v.findViewById(R.id.CarManufac);
        TextView carColour = (TextView) v.findViewById(R.id.CarColour);
        //img.setImageResource(Integer.parseInt(carRentals.getImgLocatiuon()));
        carName.setText(carRentals.getCarName());
        carlocation.setText(carRentals.getLocation());
        //carPrice.setText((int) carRentals.getRentalPrice());
        carType.setText(carRentals.getCarType());
        //carYear.setText(carRentals.getCarYear());
        carManufac.setText(carRentals.getManufac());
        carColour.setText(carRentals.getCarColour());
        return v;
    }

}
