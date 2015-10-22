package com.epicodus.citylifecountrylife.models;

/**
 * Created by Guest on 10/22/15.
 */
public class Countryside {

    private String mCountryside;
    private int mImage;
    private int mImage2;


    public Countryside(String countryside, int image, int image2) {
        mCountryside = countryside;
        mImage = image;
        mImage2 = image2;

    }

    public String getCountryside() {
        return mCountryside;
    }

    public void setCountryside(String countryside) {
        mCountryside = countryside;
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