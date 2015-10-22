package com.epicodus.citylifecountrylife.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.epicodus.citylifecountrylife.R;


public class MainActivity extends AppCompatActivity {

    private ImageButton mMainCityButton, mMainCountryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface neucha = Typeface.createFromAsset(getAssets(), "fonts/neucha.ttf");

        TextView mainCityLabel = (TextView) findViewById(R.id.mainCityLabel);
        mainCityLabel.setTypeface(neucha);

        TextView mainCountryLabel = (TextView) findViewById(R.id.mainCountryLabel);
        mainCountryLabel.setTypeface(neucha);

        mMainCityButton = (ImageButton) findViewById(R.id.mainCityButton);
        mMainCountryButton = (ImageButton) findViewById(R.id.mainCountryButton);

        mMainCityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CityActivity.class);
                startActivity(intent);
            }
        });

        mMainCountryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CountrysideActivity.class);
                startActivity(intent);
            }
        });
    }

}
