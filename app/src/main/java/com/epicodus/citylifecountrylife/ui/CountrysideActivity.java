package com.epicodus.citylifecountrylife.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.citylifecountrylife.R;
import com.epicodus.citylifecountrylife.models.City;
import com.epicodus.citylifecountrylife.models.CityDatabase;
import com.epicodus.citylifecountrylife.models.Countryside;
import com.epicodus.citylifecountrylife.models.CountrysideDatabase;

public class CountrysideActivity extends AppCompatActivity {

    private TextView mCountryside;
    private ImageView mImage;
    private ImageView mImage2;
    private ImageButton mNextButton;
    private ImageButton mCountrysideNextButton;

    private CountrysideDatabase mCountrysideDatabase;
    private Countryside mCurrentCountryside;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countryside);

        mCountryside = (TextView) findViewById(R.id.countryTextView);
        mImage = (ImageView) findViewById(R.id.countryImageView);
        mImage2 = (ImageView) findViewById(R.id.countrySecondImageView);
        mCountrysideDatabase = new CountrysideDatabase();
        mCurrentCountryside = mCountrysideDatabase.getCountrysides().get(0);
        mNextButton = (ImageButton) findViewById(R.id.nextButton);
        mCountrysideNextButton = (ImageButton) findViewById(R.id.countrysideNextButton);
        setLayoutContent();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentCountryside = mCountrysideDatabase.nextCountryside(mCurrentCountryside);
                setLayoutContent();

            }
        });

        mCountrysideNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentCountryside = mCountrysideDatabase.lastCountryside(mCurrentCountryside);
                setLayoutContent();
            }
        });

    }


    private void setLayoutContent() {
        mCountryside.setText(mCurrentCountryside.getCountryside());
        mImage.setImageResource(mCurrentCountryside.getImage());
        mImage2.setImageResource(mCurrentCountryside.getImage2());
    }

};
