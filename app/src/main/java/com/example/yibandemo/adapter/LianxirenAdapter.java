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

public class LianxirenAdapter extends BaseAdapter {
    private Context context;
    private List<SchoolBean> list;
    public LianxirenAdapter(Context context, List<SchoolBean> list) {
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
        view = LayoutInflater.from(context).inflate(R.layout.lianxiren_item,parent,false);
        ImageView iv_lianxiren = view.findViewById(R.id.iv_lianxiren);
        TextView tv_lianxiren = view.findViewById(R.id.tv_lianxiren);
        SchoolBean schoolBean = list.get(position);
        iv_lianxiren.setImageResource(schoolBean.getImage());
        tv_lianxiren.setText(schoolBean.getTitle());
        return view;
    }
}
