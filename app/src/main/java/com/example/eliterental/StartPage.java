package com.example.eliterental;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class StartPage extends AppCompatActivity {
    private Button toLogin;
    private Button toRegister;
    public View startView;
    private ImageView imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        imageView2 = findViewById(R.id.imageView2);

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

        startView = this.getWindow().getDecorView();
        startView.setBackgroundResource(R.color.background);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_startpage, menu);
        return true;
    }

    public void openLoginPage() {
        Intent intentLogin = new Intent(this, LoginPage.class);
        startActivity(intentLogin);
    }

    public void openRegisterPage() {
        Intent intentRegister = new Intent(this, RegisterPage.class);
        startActivity(intentRegister);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_1:
//                Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
                startView.setBackgroundResource(R.color.background);
                imageView2.setBackgroundResource(R.color.background);
                return true;

            case R.id.item_2:
//                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                startView.setBackgroundResource(R.color.yellow);
                imageView2.setBackgroundResource(R.color.yellow);
                return true;

            case R.id.item_3:
//                Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
                startView.setBackgroundResource(R.color.Red);
                imageView2.setBackgroundResource(R.color.Red);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
