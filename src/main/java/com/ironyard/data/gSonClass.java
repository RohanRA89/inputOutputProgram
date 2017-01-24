package com.ironyard.data;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by rohanayub on 1/23/17.
 */
public class gSonClass {
    private String TMP_DIR = "/tmp/";
    private String textFileName = null;
    private String firstName;

    public String getFirstName(String s) {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(String s) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonAge(String s) {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getCityName(String s) {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName(String s) {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    private String lastName;
    private int personAge;
    private String cityName;
    private String countryName;


    private void saveInformationJsop() {
        if (textFileName == null) {
            textFileName = System.currentTimeMillis() + ".personInfo";
        }

    }

    public void saveToTemp() {
        try (FileWriter fw = new FileWriter(TMP_DIR+textFileName)) {

            Gson temp = new Gson();
            temp.toJson(this,fw);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
