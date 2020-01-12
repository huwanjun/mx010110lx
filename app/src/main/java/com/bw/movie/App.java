package com.bw.movie;

import android.app.Application;
import android.content.Context;

/**
 * author: 斛万珺
 * data: 2020/1/10 15:15:52
 * function:
 */
public class App extends Application {

    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();

        MyWXAppdID.regToWx(this );
    }
}
