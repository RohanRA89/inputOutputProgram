package com.ironyard.data;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;

/**
 * Created by rohanayub on 1/23/17.
 */
public class gSonClass {
    private String TMP_DIR = "/tmp/";
    private String firstName;
    private String lastName;
    private int personAge;
    private String cityName;
    private String countryName;

    public gSonClass(String firstName, String lastName, int personAge, String cityName, String countryName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.personAge = personAge;
        this.cityName = cityName;
        this.countryName = countryName;
    }

    public String getTMP_DIR() {
        return TMP_DIR;
    }

    public void setTMP_DIR(String TMP_DIR) {
        this.TMP_DIR = TMP_DIR;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String  genFilename() {
           return  System.currentTimeMillis() + ".personInfo";
    }

    public void saveToTemp() {
        try (FileWriter fw = new FileWriter(TMP_DIR+genFilename())) {
            Gson temp = new Gson();
            temp.toJson(this,fw);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //public String toString(){
        //return String.format("(First Name: %s, Last Name: %s, Age %i, City Name: %s, Country Name: %s)", getFirstName(),getLastName(),getPersonAge(),getCityName(),getCountryName());

    }


