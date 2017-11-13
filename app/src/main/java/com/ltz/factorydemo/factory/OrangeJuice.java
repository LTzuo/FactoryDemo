package com.ltz.factorydemo.factory;

import android.util.Log;

/**
 * 具体产品 - 橙汁
 * Created by 1 on 2017/11/13.
 */
public class OrangeJuice implements IJuice{
    public static final String TAG = "AppleJuice" ;

    @Override
    public String getName() {
        Log.i(TAG,"我是橙汁");
        return "橙汁";
    }
}
