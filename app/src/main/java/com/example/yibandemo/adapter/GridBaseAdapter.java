package com.example.yibandemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yibandemo.R;
import com.example.yibandemo.bean.GridBean;
import com.example.yibandemo.utils.OvalImageView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class GridBaseAdapter extends BaseAdapter {
    Context context;
    List<GridBean> list = new ArrayList<>();
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
        TextView textView;
        CircleImageView circleImageView;
        convertView = LayoutInflater.from(context).inflate(R.layout.grid_item,parent,false);
        textView =  convertView.findViewById(R.id.textView);
        circleImageView = convertView.findViewById(R.id.circleImageView);
        textView.setText(list.get(position).getTitle());
        circleImageView.setImageResource(list.get(position).getImage());


        return convertView;
    }
}
