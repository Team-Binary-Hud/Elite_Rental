package com.example.eliterental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class StartPage extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private Button toLogin;
    private Button toRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        toRegister = findViewById(R.id.toRegister);
        toRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterPage();
            }
        });


        toLogin = findViewById(R.id.toLogin);
        toLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginPage();
            }
        });
    }

    public void openLoginPage(){
        Intent intentLogin = new Intent(this, LoginPage.class);
        startActivity(intentLogin);
    }

    public void openRegisterPage(){
        Intent intentRegister = new Intent(this, RegisterPage.class);
        startActivity(intentRegister);
    }

    public void popUp(View v){
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.popup_startpage);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_1:
                Toast.makeText(this,"Item 1 clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item_2:
                Toast.makeText(this,"Item 2 clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item_3:
                Toast.makeText(this,"Item 3 clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item_4:
                Toast.makeText(this,"Item 4 clicked", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item_5:
                Toast.makeText(this,"Item 5 clicked", Toast.LENGTH_SHORT).show();
                return true;

                default:
                    return false;
        }
    }
}
