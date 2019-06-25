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

public class SchoolAdapter extends BaseAdapter {
    Context context;
    List<SchoolBean> list;
    public SchoolAdapter(Context context,List<SchoolBean> list) {
        this.context = context;
        this.list = list;
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
        TextView tv_title,content,souce;
        ImageView schoolImage;
        view = LayoutInflater.from(context).inflate(R.layout.school_item,parent,false);
        tv_title = view.findViewById(R.id.tv_title);
        content = view.findViewById(R.id.content);
        souce = view.findViewById(R.id.souce);
        schoolImage = view.findViewById(R.id.schoolImage);
        tv_title.setText(list.get(position).getTitle());
        content.setText(list.get(position).getContent());
        //souce.setText(list.get(position).getTitle());
        schoolImage.setImageResource(list.get(position).getImage());
        return view;
    }
}
