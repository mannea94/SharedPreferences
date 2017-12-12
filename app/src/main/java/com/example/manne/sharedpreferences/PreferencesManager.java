package com.example.manne.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

/**
 * Created by manne on 12.12.2017.
 */

public class PreferencesManager {
    private static final String ISMALE = "ismale";
    private static final String FIRSTNAME = "firstname";
    private static final String LASTNAME = "lastname";
    private static final String AGE = "age";
    private static final String POL = "pol";

    private static SharedPreferences getPreferences(Context c){
        return c.getApplicationContext().getSharedPreferences("MySharedPreffsFile", Activity.MODE_PRIVATE);
    }

    public static String getFirstName(Context context){
        return getPreferences(context).getString("firstname", "no name");
    }

    public static void setFirstName(Context context, String firstName) {
        getPreferences(context).edit().putString("firstname", firstName).apply();
    }

    public static String getLastname(Context context) {
        return getPreferences(context).getString("lastname", "no name");
    }

    public static void setLastName(Context context, String lastName) {
        getPreferences(context).edit().putString("lastname", lastName).apply();
    }

    public static String getAge(Context context) {
        return getPreferences(context).getString("age", "no age");
    }

    public static void setAge(Context context, String age) {
        getPreferences(context).edit().putString("age", age).apply();
    }

    public static String getPol(Context context) {
        return getPreferences(context).getString("pol", "no pol");
    }

    public static void setPol(Context context, String pol) {
        getPreferences(context).edit().putString("pol", pol).apply();
    }


//    public static boolean getIsMale(Context context) {
//        return getPreferences(context).getBoolean("ismale", true);
//    }
//
//    public static void setIsMale(Context context, boolean ismale) {
//        getPreferences(context).edit().putBoolean("ismale", ismale).apply();
//    }

    public static void addUser(User user, Context c){
        Gson gson = new Gson();
        String mapString = gson.toJson(user);
        getPreferences(c).edit().putString("user", mapString).apply();
    }

    public static User getUser(Context c){
        return new Gson().fromJson(getPreferences(c).getString("user", ""), User.class);
    }

    public static void removeUser(Context c){
        getPreferences(c).edit().remove("user").apply();
    }

}
