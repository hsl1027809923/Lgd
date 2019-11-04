package com.bawei.day01ks;

import android.app.Application;
import android.content.Context;

/*
 *@auther:郝世龙
 *@Date: 2019-11-04
 *@Time:8:54
 *@Description:${DESCRIPTION}
 **/public class MyApp extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }
}
