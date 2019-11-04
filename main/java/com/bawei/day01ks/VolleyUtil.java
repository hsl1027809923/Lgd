package com.bawei.day01ks;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/*
 *@auther:郝世龙
 *@Date: 2019-11-04
 *@Time:8:49
 *@Description:${DESCRIPTION}
 **/public class VolleyUtil {
    RequestQueue queue= Volley.newRequestQueue(MyApp.context);
    //单例模式
    public static VolleyUtil volleyUtil=new VolleyUtil();
    private VolleyUtil() {
    }
    public static VolleyUtil getInstance(){
        return  volleyUtil;
    }
    //请求数据
    public void doGet(String url, final Icontarct.CallBack callBack){
        StringRequest request=new StringRequest(0, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callBack.success(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callBack.error(error.getMessage());
            }
        });
        queue.add(request);
    }

}
