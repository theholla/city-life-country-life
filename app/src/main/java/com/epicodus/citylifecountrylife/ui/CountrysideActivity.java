package com.epicodus.citylifecountrylife.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.citylifecountrylife.R;

public class CountrysideActivity extends AppCompatActivity {

    private TextView mCountryside;
    private ImageView mImage;
    private ImageView mImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countryside);

        mCountryside = (TextView) findViewById(R.id.countryTextView);
        mImage = (ImageView) findViewById(R.id.countryImageView);
        mImage2 = (ImageView) findViewById(R.id.countrySecondImageView);
    }

}
