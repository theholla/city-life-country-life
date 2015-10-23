package com.epicodus.citylifecountrylife.models;

import com.epicodus.citylifecountrylife.R;

import java.util.ArrayList;

/**
 * Created by Diana and Teresa on 10/22/15.
 */
public class CityDatabase {
    private ArrayList<City> mCities;

    public CityDatabase() {
        setCities();
    }

    private void setCities() {
        mCities = new ArrayList<>();

        mCities.add(new City(
            "New Orleans, Louisiana",
            R.drawable.city_neworleans,
            R.drawable.city_neworleans2
        ));

        mCities.add(new City(
            "Bordeaux, France",
            R.drawable.city_bordeaux,
            R.drawable.city_bordeaux2
        ));

        mCities.add(new City(
            "Charleston, North Carolina",
            R.drawable.city_charleston,
            R.drawable.country_charleston2
        ));

        mCities.add(new City(
            "Guadalajara, Mexico",
            R.drawable.city_guadalajara,
            R.drawable.city_guadalajara2
        ));

        mCities.add(new City(
            "San Diego, California",
            R.drawable.city_sandiego,
            R.drawable.city_sandiego2
        ));

        mCities.add(new City(
            "Savannah, Georgia",
            R.drawable.city_savannah,
            R.drawable.city_savannah2
        ));

        mCities.add(new City(
                "Sicily, Italy",
                R.drawable.city_sicily,
                R.drawable.city_sicily2
        ));
    }

    public ArrayList<City> getCities() {
        return mCities;
    }

    public City nextCity(City currentCity) {
        int index = mCities.indexOf(currentCity);
        if (index == mCities.size() - 1) {
            return mCities.get(0);
        } else {
            return mCities.get(index + 1);
        }
    }

    public City lastCity(City currentCity) {
        int index = mCities.indexOf(currentCity);
        if (index == mCities.size() - 1) {
            return mCities.get(0);
        } else if (index == 0){
            return currentCity;
        } else{
            return mCities.get(index - 1);
        }
    }
}
