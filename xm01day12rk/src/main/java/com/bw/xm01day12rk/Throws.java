package com.bw.xm01day12rk;

import android.util.Log;

/**
 * author: 斛万珺
 * data: 2020/1/12 08:8:45
 * function:
 */
public class Throws implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {

        Log.d("aaa",e.getMessage());
        Log.d("aaa",e.getLocalizedMessage());

    }
}
