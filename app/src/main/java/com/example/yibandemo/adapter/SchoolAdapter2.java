package com.example.yibandemo.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yibandemo.R;
import com.example.yibandemo.activity.WebActivity;
import com.example.yibandemo.bean.SchoolBean;

import java.util.List;

public class SchoolAdapter2 extends RecyclerView.Adapter<SchoolAdapter2.MyViewHolder> {
    Context context;
    List<SchoolBean> list;
    public SchoolAdapter2( Context context,List<SchoolBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.school_item,viewGroup,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return  viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_title.setText(list.get(i).getTitle());
        myViewHolder.content.setText(list.get(i).getContent());
        myViewHolder.schoolImage.setImageResource(list.get(i).getImage());
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WebActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_title,content,souce;
        ImageView schoolImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            content = itemView.findViewById(R.id.content);
            souce = itemView.findViewById(R.id.souce);
            schoolImage = itemView.findViewById(R.id.schoolImage);

        }
    }
}
