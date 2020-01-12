package com.bw.xm01day12rk;

import android.app.Application;

/**
 * author: 斛万珺
 * data: 2020/1/12 08:8:48
 * function:
 */
public class App extends Application {
//初始化App
    public static App app;
    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
        Thread.setDefaultUncaughtExceptionHandler(new Throws());
    }
}
