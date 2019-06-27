package com.example.yibandemo.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.example.yibandemo.R;
import com.example.yibandemo.adapter.GuanZhiAdapter;
import com.example.yibandemo.bean.SchoolBean;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class GuanZhiActivity extends AppCompatActivity {
    Banner bn_gz;
    ListView lv_gz;
    List<Integer> images = new ArrayList<>();
    List<SchoolBean> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guan_zhi);
        initView();
        initData();
        bn_gz.setImageLoader(new GlideImageLoader());
        bn_gz.setImages(images);
        bn_gz.start();
        GuanZhiAdapter adapter = new GuanZhiAdapter(getApplicationContext(),list);
        lv_gz.setAdapter(adapter);
    }

    private void initData() {
        images.clear();
        images.add(R.drawable.lbt1);
        images.add(R.drawable.lbt2);

        list.clear();
        list.add(new SchoolBean("移动172优秀人才名单！！！","今天终于迎来了优秀人才名单！",null,R.drawable.tu1));
        list.add(new SchoolBean("信息系优秀班级名单公布！","大家知道第一名花落谁家吗？？",null,R.drawable.tu2));
        list.add(new SchoolBean("广职院火啦，只因这样一件小事......","如题",null,R.drawable.tu3));
        list.add(new SchoolBean("半年时间赚够了3年学费，他竟然这样做......","人才",null,R.drawable.tu4));
        list.add(new SchoolBean("46级成绩公布啦！","大家快点击这里哦！",null,R.drawable.tu5));
    }

    private void initView() {
        bn_gz = findViewById(R.id.bn_gz);
        lv_gz = findViewById(R.id.lv_gz);
    }
    class GlideImageLoader extends ImageLoader {

        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context)
                    .load(path)
                    .into(imageView);
        }
    }
}
