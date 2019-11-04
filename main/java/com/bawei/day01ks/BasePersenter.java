package com.bawei.day01ks;

/*
 *@auther:郝世龙
 *@Date: 2019-11-04
 *@Time:8:45
 *@Description:${DESCRIPTION}
 **/public class BasePersenter<V extends BaseActivity> extends MainActivity {
    public V v;
    //绑定方法
    public void acctch(V v){
        this.v=v;
    }
    //解绑方法
    public void Uacctch(){
        if (v!=null){
            v=null;
        }
    }
}
