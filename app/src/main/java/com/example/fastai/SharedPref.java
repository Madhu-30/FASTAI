package com.example.fastai;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class SharedPref {

    private static SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private Context context;
    private int PRIVATE_MODE = 0;

    private static final String one = "1";
    private static final String two = "2";
    private static final String three = "3";
    private static final String four = "4";
    private static final String five = "5";
    private static final String six = "6";
    private static final String seven = "7";
    private static final String eight = "8";

//
//    //GENDER////
//    public String getGender(){
//        return preferences.getString(GENDER, null);
//    }
//
//    public void setGender(String gender){
//        editor.putString(GENDER, gender);
//        editor.apply();
//    }

    @SuppressLint("CommitPrefEdits")
    public SharedPref(Context context){
        this.context = context;
        if(context != null) {
            preferences = context.getSharedPreferences("Cart", PRIVATE_MODE);
        }
        editor = preferences.edit();
//        gson = new Gson();
    }

    public static String getOne() {
        return preferences.getString(one, "no");
    }
    public void setOne(String cart){
        editor.putString(one, cart);
        editor.apply();
        Log.i("HiiPref" , cart);
    }
    public static String getTwo() {
        return preferences.getString(two, "no");
    }
    public void setTwo(String cart){
        editor.putString(two, cart);
        editor.apply();
    }
    public static String getThree() {
        return preferences.getString(three, "no");
    }
    public void setThree(String One){
        editor.putString(three, One);
        editor.apply();
    }
    public static String getFour() {
        return preferences.getString(four, "no");
    }
    public void setFour(String One){
        editor.putString(four, One);
        editor.apply();
    }

    public static String getFive() {
        return preferences.getString(five, "no");
    }
    public void setFive(String One){
        editor.putString(five, One);
        editor.apply();
    }

    public static String getSix() {
        return preferences.getString(six, "no");
    }
    public void setSix(String One){
        editor.putString(six, One);
        editor.apply();
    }

    public static String getSeven() {
        return preferences.getString(seven, "no");
    }
    public void setSeven(String One){
        editor.putString(seven, One);
        editor.apply();
    }


    public static String getEight() {
        return preferences.getString(eight, "no");
    }
    public void setEight(String One){
        editor.putString(eight, One);
        editor.apply();
    }
}
