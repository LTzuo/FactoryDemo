package com.ltz.factorydemo.factory;

import android.util.Log;

/**
 * 具体的产品  - 苹果汁
 * Created by 1 on 2017/11/13.
 */
public class AppleJuice implements IJuice {
    public static final String TAG = "AppleJuice" ;
    @Override
    public String getName() {
        Log.i(TAG,"我是苹果汁");
        return "苹果汁";
    }
}
