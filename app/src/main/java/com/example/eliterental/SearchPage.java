package com.example.eliterental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends AppCompatActivity {
/*
    public static Integer SelectedRentalID;
    public static String SelectedRentalName;
    public static Integer CarYearSelected;
    public static double RentalPriceSelected;
    public static String SelectedManufac;
    public static String SelectedLocation;
    public static String SelectedColour;
    public static String ImgLocation;*/

    public static RentalCars SelectedRenatlCar;

    public static Integer CarRentalID;
    private List<RentalCars> erxamplelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
        getRentalList();
        ListView listView = (ListView)findViewById(R.id.listView);
        ListViewRental ListViewAdapter = new ListViewRental(this, R.layout.list_rental, erxamplelist);
        listView.setAdapter(ListViewAdapter);
        listView.setOnItemClickListener(OnItemClick);
    }

    AdapterView.OnItemClickListener OnItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //RentalCars SelectedRenatlCar=erxamplelist.get(position);
            //SelectedRentalID=erxamplelist.get(position).getCarRentalID();
            //SelectedRentalName=erxamplelist.get(position).getCarName();
            /*CarYearSelected=erxamplelist.get(position).getCarYear();
            RentalPriceSelected=erxamplelist.get(position).getRentalPrice();
            SelectedManufac=erxamplelist.get(position).getManufac();
            SelectedLocation=erxamplelist.get(position).getLocation();
            SelectedColour=erxamplelist.get(position).getCarColour();
            ImgLocation=erxamplelist.get(position).getImgLocatiuon();*/
            ViewRentalPage();
        }
    };

    public void ViewRentalPage() {
        Intent intent_rental = new Intent(this, RentalInfoPage.class);
        startActivity(intent_rental);
    }

    private List<RentalCars> getRentalList() {
        List<RentalCars> erxamplelist = new ArrayList<>();
        erxamplelist.add(new RentalCars(0, "Corsa-e", 2020, 20.80, "Vauxhall", "Huddersfield", "Yellow", "v", "Small Hatchback"));
        erxamplelist.add(new RentalCars(1, "Tesla Roadster", 2020, 20.80, "Tesla", "Manchester", "Black", "v", "Sports Car"));
        erxamplelist.add(new RentalCars(2, "Corsa-e", 2020, 20.80, "Vauxhall", "Huddersfield", "Pink", "v", "Small Hatchback"));
        erxamplelist.add(new RentalCars(3, "Tesla Roadster", 2020, 20.80, "Tesla", "Manchester", "Black", "v", "Sports Car"));
        erxamplelist.add(new RentalCars(4, "Corsa-e", 2020, 20.80, "Vauxhall", "Huddersfield", "Blue", "v", "Small Hatchback"));
        erxamplelist.add(new RentalCars(5, "Tesla Roadster", 2020, 20.80, "Tesla", "Manchester", "Blue", "v", "Sports Car"));
        erxamplelist.add(new RentalCars(6, "Corsa-e", 2020, 20.80, "Vauxhall", "Huddersfield", "Red", "v", "Small Hatchback"));
        erxamplelist.add(new RentalCars(7, "Tesla Roadster", 2020, 20.80, "Tesla", "Manchester", "Silver", "v", "Sports Car"));
        return erxamplelist;
    }
}
