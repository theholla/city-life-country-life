package com.epicodus.citylifecountrylife.models;

import com.epicodus.citylifecountrylife.R;

import java.util.ArrayList;

/**
 * Created by Teresa and Diana on 10/22/15.
 */
public class CountrysideDatabase {
        private ArrayList<Countryside> mCountrysides;

        public CountrysideDatabase() {
            setCountryside();
        }
    private void setCountryside() {
        mCountrysides = new ArrayList<>();

        mCountrysides.add(new Countryside(
                "Rural North, Florida",
                R.drawable.country_florida,
                R.drawable.country_floridapanhandle
        ));

        mCountrysides.add(new Countryside(
                "Semuc Champey, Guatemala",
                R.drawable.country_guatemala,
                R.drawable.country_guatemala
        ));

        mCountrysides.add(new Countryside(
                "Rural, Ireland",
                R.drawable.country_ireland,
                R.drawable.country_ireland
        ));
    }

    public ArrayList<Countryside> getCountrysides() {
        return mCountrysides;
    }

    public Countryside nextCountryside(Countryside currentCountryside) {
        int index = mCountrysides.indexOf(currentCountryside);
        if (index == mCountrysides.size() - 1) {
            return mCountrysides.get(0);
        } else {
            return mCountrysides.get(index + 1);
        }
    }

    public Countryside lastCountryside(Countryside currentCountryside) {
        int index = mCountrysides.indexOf(currentCountryside);
        if (index == mCountrysides.size() - 1) {
            return mCountrysides.get(0);
        } else if (index == 0){
            return currentCountryside;
        } else{
            return mCountrysides.get(index - 1);
        }
    }

    }
