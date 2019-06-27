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

public class GuanZhiAdapter extends BaseAdapter {
    private Context context;
    private List<SchoolBean> list;
    public GuanZhiAdapter(Context context, List<SchoolBean> list) {
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
        TextView tv_guanzhiContent,tv_guanzhiTitle;
        ImageView iv_guanzhi;
        view = LayoutInflater.from(context).inflate(R.layout.guanzhi_item,parent,false);
        tv_guanzhiContent = view.findViewById(R.id.tv_guanzhiContent);
        tv_guanzhiTitle = view.findViewById(R.id.tv_guanzhiTitle);
        iv_guanzhi = view.findViewById(R.id.iv_guanzhi);
        SchoolBean schoolBean = list.get(position);
        tv_guanzhiTitle.setText(schoolBean.getTitle());
        tv_guanzhiContent.setText(schoolBean.getContent());
        iv_guanzhi.setImageResource(schoolBean.getImage());
        return view;
    }
}
