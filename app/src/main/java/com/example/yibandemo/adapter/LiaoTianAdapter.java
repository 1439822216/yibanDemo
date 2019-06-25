package com.example.yibandemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yibandemo.R;
import com.example.yibandemo.bean.SchoolBean;

import java.util.List;

public class LiaoTianAdapter extends BaseAdapter {
    private Context context;
    private List<SchoolBean> list;
    public LiaoTianAdapter(Context context, List<SchoolBean> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = LayoutInflater.from(context).inflate(R.layout.liaotian_item,parent,false);
        SchoolBean schoolBean = list.get(position);
        ImageView iv_liaotian = view.findViewById(R.id.iv_liaotian);
        TextView tv_liaotianTitle= view.findViewById(R.id.tv_liaotianTitle);
        TextView tv_liaotianContent= view.findViewById(R.id.tv_liaotianContent);
        iv_liaotian.setImageResource(schoolBean.getImage());
        tv_liaotianTitle.setText(schoolBean.getTitle());
        tv_liaotianContent.setText(schoolBean.getContent());
        return view;
    }
}
