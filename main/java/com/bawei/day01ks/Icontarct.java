package com.bawei.day01ks;

/*
 *@auther:郝世龙
 *@Date: 2019-11-04
 *@Time:8:56
 *@Description:${DESCRIPTION}
 **/public interface Icontarct {
    public interface IView{
        public void success(Shopa shopa);

    }
    public  interface Persenter{
        public void toRequest(String url);
    }

    public interface CallBack{
        public void success(String json);
        public void error(String er);

    }

}
