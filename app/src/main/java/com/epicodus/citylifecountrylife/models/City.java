package com.epicodus.citylifecountrylife.models;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * Created by Guest on 10/22/15.
 */
public class City {

        private String mCity;
        private int mImage;
        private int mImage2;
    private AtomicIntegerFieldUpdater<Integer> mCities;


    public City(String city, int image, int image2) {
        mCity = city;
        mImage = image;
        mImage2 = image2;

    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public int getImage2() {
        return mImage2;
    }

    public void setImage2(int image2) {
        mImage2 = image2;
    }


}
