package com.bawei.day01ks;

/*
 *@auther:郝世龙
 *@Date: 2019-11-04
 *@Time:8:49
 *@Description:${DESCRIPTION}
 **/public class MyModle {
    public void Dodo(String url,Icontarct.CallBack callBack){
        VolleyUtil.getInstance().doGet(url,callBack);
        
    }
}
