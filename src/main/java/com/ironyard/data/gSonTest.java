package com.ironyard.data;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by rohanayub on 1/23/17.
 */

/*public class gSonTest {
    private String textFileName = null;
    private String TMP_DIR = "/tmp/";

    public static void main(String[] args) {
        gSonClass per = new gSonClass();
        per.setFirstName("Rohan");
        per.setLastName("Ayub");
        per.setPersonAge(27);
        per.setCityName("Orlando");
        per.setCountryName("Florida");

        Gson gson = new Gson();
        String perJson = gson.toJson(per);
        System.out.println(perJson);
        return;

    }


    /*private void saveInformationJsop() {
        if (textFileName == null) {
            textFileName = System.currentTimeMillis() + ".personInfo";
        }

    }

    public void saveToTemp() {
        try (FileWriter fw = new FileWriter("person" + ".txt")) {

            Gson temp = new Gson();
            temp.toJson(this, fw);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}*/




