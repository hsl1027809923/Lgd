package com.bawei.day01ks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/*
 *@auther:郝世龙
 *@Date: 2019-11-04
 *@Time:9:14
 *@Description:${DESCRIPTION}
 **/public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {
    List<Shopa.ListdataBean> list;
    Context context;

    public MyAdapter(List<Shopa.ListdataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_layout,null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        holder.textView.setText(list.get(i).getName()+"");
        Log.i("aa","bb"+list.get(i).getName());
        Glide.with(context).load(list.get(i).getAvatar()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public Holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img_it);
            textView=itemView.findViewById(R.id.text_it);
        }
    }
}
