package com.ironyard.data;

import com.google.gson.Gson;

/**
 * Created by rohanayub on 1/23/17.
 */
public class gSonInput {
    public static void main(String[]args) {
        gSonClass personData = new gSonClass();
        personData.getFirstName("firName");
        personData.getLastName("lasName");
        personData.getPersonAge("ageVal");
        personData.getCityName("cityName");
        personData.getCountryName("countryName");
        Gson gson = new Gson();
        String personDataJson = gson.toJson(personData);
        System.out.println(personDataJson);
    }
}
