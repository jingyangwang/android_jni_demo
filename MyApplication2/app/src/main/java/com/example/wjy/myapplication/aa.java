package com.example.wjy.myapplication;

/**
 * Created by wjy on 2016/6/27.
 */
public class aa {
    public  static  native String HelloJNI();
    static {
        System.loadLibrary("HelloJNI");
    }
}
