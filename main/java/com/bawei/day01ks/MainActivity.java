package com.bawei.day01ks;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.stx.xhb.xbanner.XBanner;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements  Icontarct.IView{
    RecyclerView recyclerView;
    Banner banner;
    XBanner xBanner;

    //设置数据
    @Override
    protected void initData() {

//
//        Api api=new Api();
//        String str = URLEncoder.encode("板鞋");
//        MyPersenter persenter= (MyPersenter) p;
//        persenter.toRequest(api.toUrl(str,1,5));
        APiv aPiv=new APiv();
        MyPersenter persenter= (MyPersenter) p;
        persenter.toRequest(aPiv.tooUrl());

    }
    //初始化控件
    @Override
    protected void initView() {
        recyclerView=findViewById(R.id.RecyclerView_id);
        //布局管理器
        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
//        banner=findViewById(R.id.banner_id);
//        //设置样式
//        banner.setDelayTime(3000);
//        banner.isAutoPlay(true);
//        banner.setImageLoader(new ImageLoader() {
//            @Override
//            public void displayImage(Context context, Object path, ImageView imageView) {
//                Glide.with(context).load(path).into(imageView);
//            }
//        });
        xBanner=findViewById(R.id.xbanner_id);




    }

    @Override
    protected int Layout() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePersenter PLayout() {
        return new MyPersenter();
    }

    @Override
    public void success(final Shopa shopa) {

        MyAdapter adapter=new MyAdapter(shopa.getListdata(),this);
        Log.i("aa","cc"+shopa.getListdata().get(1).getName());
        recyclerView.setAdapter(adapter);

        xBanner.setBannerData(shopa.getBannerdata());
        xBanner.loadImage(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, Object model, View view, int position) {
                Glide.with(MainActivity.this).load(shopa.getBannerdata().get(position).getImageUrl()).into((ImageView) view);
            }
        });
    }
}
