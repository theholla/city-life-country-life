package com.epicodus.citylifecountrylife.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.citylifecountrylife.R;
import com.epicodus.citylifecountrylife.models.City;
import com.epicodus.citylifecountrylife.models.CityDatabase;

public class CityActivity extends AppCompatActivity {

    private TextView mCity;
    private ImageView mImage;
    private ImageView mImage2;

    private ImageButton mNextButton;
    private ImageButton mLastButton;

    private CityDatabase mCityDatabase;
    private City mCurrentCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        mCity = (TextView) findViewById(R.id.cityTextView);
        mImage = (ImageView) findViewById(R.id.cityImageView);
        mImage2 = (ImageView) findViewById(R.id.citySecondImageView);
        mCityDatabase = new CityDatabase();
        mCurrentCity = mCityDatabase.getCities().get(0);
        mNextButton = (ImageButton) findViewById(R.id.nextCityButton);
        mLastButton = (ImageButton) findViewById(R.id.lastImageButton);
        setLayoutContent();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentCity = mCityDatabase.nextCity(mCurrentCity);
                setLayoutContent();

            }
        });

        mLastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentCity = mCityDatabase.lastCity(mCurrentCity);
                setLayoutContent();
            }
        });
    }

    private void setLayoutContent() {
        mCity.setText(mCurrentCity.getCity());
        mImage.setImageResource(mCurrentCity.getImage());
        mImage2.setImageResource(mCurrentCity.getImage2());
    }

}
