package com.bawei.day01ks;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/*
 *@auther:郝世龙
 *@Date: 2019-11-04
 *@Time:8:41
 *@Description:${DESCRIPTION}
 **/public abstract class BaseActivity<P extends BasePersenter> extends AppCompatActivity {
    public P p;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局
        setContentView(Layout());
        p=PLayout();
        if (p!=null){
            p.acctch(this);
        }
        initView();
        initData();

    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int Layout();
    protected abstract P PLayout();
    //解绑方法

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (p!=null){
            p.Uacctch();
            p=null;
        }
    }
}
