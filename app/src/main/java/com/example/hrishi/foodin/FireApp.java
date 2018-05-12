package com.example.hrishi.foodin;

import android.app.Application;

import com.firebase.client.Firebase;
/**
 * Created by hp on 05-03-2018.
 */

public class FireApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
