package com.bawei.day01ks;

/*
 *@auther:郝世龙
 *@Date: 2019-11-04
 *@Time:9:04
 *@Description:${DESCRIPTION}
 **/public class Api {
    public String toUrl(String keyword, int page, int count){
        String url="http://172.17.8.100/small/commodity/v1/findCommodityByKeyword"+"?keyword="+keyword+"&page="+page+"&count="+count;
        return url;
    }
}
