package com.bawei.day01ks;

import android.util.Log;

import com.google.gson.Gson;

/*
 *@auther:郝世龙
 *@Date: 2019-11-04
 *@Time:8:49
 *@Description:${DESCRIPTION}
 **/public class MyPersenter extends BasePersenter implements Icontarct.Persenter{
    MyModle modle;

    public MyPersenter() {
        modle=new MyModle();
    }

    @Override
    public void toRequest(String url) {
        modle.Dodo(url, new Icontarct.CallBack() {
            @Override
            public void success(String json) {
                Log.i("aa","dd"+json);
                //解析
                Gson gson=new Gson();
                Shopa shopa = gson.fromJson(json, Shopa.class);
                Log.i("aa","dfg"+shopa.getListdata().get(1).getName());
                MainActivity activity= (MainActivity) v;
                activity.success(shopa);
            }

            @Override
            public void error(String er) {

            }
        });
    }
}
