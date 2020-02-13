package com.example.eliterental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ConfirmPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_page);

        TextView textView = (TextView) findViewById(R.id.tc_text);
        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}
