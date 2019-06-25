package com.example.yibandemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.yibandemo.R;
import com.example.yibandemo.bean.GridBean;

import java.util.List;

public class GridBaseAdapter extends BaseAdapter {
    Context context;
    List<GridBean> list;
    public GridBaseAdapter(Context context, List<GridBean> list) {
        this.context = context;
        this.list=list;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.grid_item,parent,false);

        return null;
    }
}
