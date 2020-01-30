package com.example.eliterental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewStub;
import android.widget.ListView;

public class SearchPage extends AppCompatActivity {

    public static Integer CarRentalID;
    public static String CarModel;
    public static String CarYear;
    public static String CarColour;
    public static String RentalPrice;

    private ViewStub car_list_stub;
    private ListView CarListView;
    //private List<Rentals> RentalList; TEMP LIST OF EXAMPLE CARS
    //getRentalList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);
    }
}
