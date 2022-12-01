package com.rajendrarrv.nextML;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import com.rajendrarrv.LocaleHelper;

public class MainActivity extends AppCompatActivity {
    TextView longText;
    private Button changeLanuage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        longText = findViewById(R.id.longText);
        changeLanuage = findViewById(R.id.change_language);
        changeLanuage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
LocaleHelper.setLocale(getApplicationContext(),"fa");
            }
        });

    }
}