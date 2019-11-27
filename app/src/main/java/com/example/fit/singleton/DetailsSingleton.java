package com.example.fit.singleton;

import android.content.Context;
import android.content.SharedPreferences;


public class DetailsSingleton {

        private static final String PREFS_NAME = "sharedpreferencesdemo";

        static SharedPreferences sharePref;
        static SharedPreferences.Editor sharePrefEditor = null;

        private static Context mContext = null;

        private static DetailsSingleton ourInstance = null;


    public static DetailsSingleton getInstance(Context context) {
        mContext = context;
        if (ourInstance == null) {
            ourInstance = new DetailsSingleton();
        }

        sharePref = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        sharePrefEditor = sharePref.edit();

        return ourInstance;
    }


    private DetailsSingleton() {
    }


    public String getValueWeith() {
        return sharePref.getString("VALUEWEITH", "Sets");
    }
    public void   setValueWeith(String valueWeith) {
        sharePrefEditor.putString("VALUEWEITH", valueWeith);
        sharePrefEditor.commit();
    }

    public String getValueWeithProcent() {
        return sharePref.getString("VALUEWEITHPROCENT", "%");
    }
    public void   setValueWeithProcent(String valueWeithProcent) {
        sharePrefEditor.putString("VALUEWEITHPROCENT", valueWeithProcent);
        sharePrefEditor.commit();
    }


    public String getValueYoga() {
    return sharePref.getString("VALUEYOGA", "hour");
    }
    public void   setValueYoga(String valueYoga) {
        sharePrefEditor.putString("VALUEYOGA", valueYoga);
        sharePrefEditor.commit();
    }

    public String getValueYogaProcent() {
        return sharePref.getString("VALUEYOGAPROCENT", "%");
    }
    public void   setValueYougaProcent(String valueYogaProcent) {
        sharePrefEditor.putString("VALUEYOGAPROCENT", valueYogaProcent);
        sharePrefEditor.commit();
    }


    public String getValueCardio() {
        return sharePref.getString("VALUECARDIO", "Run");
    }
    public void   setValueCardio(String valueCardio) {
        sharePrefEditor.putString("VALUECARDIO", valueCardio);
        sharePrefEditor.commit();
    }
}
