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

    //public static RentalCars CarRentalID;
    //private List<RentalCars> erxamplelist;
    public static Integer CarRentalID;
    private List<RentalCars> erxamplelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_page);


        List<RentalCars> erxamplelist = new ArrayList<>();
        erxamplelist.add(new RentalCars(0, "Corsa-e", 2020, 20.80, "Vauxhall", "Huddersfield", "Yellow", "v", "Small Hatchback"));
        erxamplelist.add(new RentalCars(1, "Tesla Roadster", 2020, 20.80, "Tesla", "Manchester", "Black", "v", "Sports Car"));
        erxamplelist.add(new RentalCars(2, "Corsa-e", 2020, 20.80, "Vauxhall", "Huddersfield", "Yellow", "v", "Small Hatchback"));
        erxamplelist.add(new RentalCars(3, "Tesla Roadster", 2020, 20.80, "Tesla", "Manchester", "Black", "v", "Sports Car"));
        erxamplelist.add(new RentalCars(4, "Corsa-e", 2020, 20.80, "Vauxhall", "Huddersfield", "Yellow", "v", "Small Hatchback"));
        erxamplelist.add(new RentalCars(5, "Tesla Roadster", 2020, 20.80, "Tesla", "Manchester", "Black", "v", "Sports Car"));
        erxamplelist.add(new RentalCars(6, "Corsa-e", 2020, 20.80, "Vauxhall", "Huddersfield", "Yellow", "v", "Small Hatchback"));
        erxamplelist.add(new RentalCars(7, "Tesla Roadster", 2020, 20.80, "Tesla", "Manchester", "Black", "v", "Sports Car"));

        ListView listView = (ListView)findViewById(R.id.listView);
        ListViewRental ListViewAdapter = new ListViewRental(this, R.layout.list_rental, erxamplelist);
        listView.setAdapter(ListViewAdapter);
        listView.setOnItemClickListener(OnItemClick);
    }

    AdapterView.OnItemClickListener OnItemClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //CarRentalID = erxamplelist.get(position);
            ViewRentalPage();
        }
    };

    public void ViewRentalPage() {
        Intent intent_rental = new Intent(this, RentalInfoPage.class);
        startActivity(intent_rental);
    }
}
