package com.example.song.new2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by song on 2018/11/23.
 */

public class Store {
    public static void setLanguageLocal(Context context, String language){
        SharedPreferences preferences;
        SharedPreferences.Editor editor;
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        editor = preferences.edit();
        editor.putString("language", language);
        editor.commit();
    }

    public static String getLanguageLocal(Context context){
        SharedPreferences preferences;
        preferences = PreferenceManager.getDefaultSharedPreferences(context);
        String language = preferences.getString("language", "");
        return language;
    }
}
