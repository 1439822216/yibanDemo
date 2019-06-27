package com.example.yibandemo.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.yibandemo.R;
import com.example.yibandemo.activity.GuanZhiActivity;
import com.example.yibandemo.adapter.GridBaseAdapter;
import com.example.yibandemo.adapter.SchoolAdapter2;
import com.example.yibandemo.bean.GridBean;
import com.example.yibandemo.bean.SchoolBean;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    Banner banner;
    List<Integer> images;
    GridView gridView;
    List<GridBean> gridBeans = new ArrayList<>();
    String[] titles;
    List<Fragment> list = new ArrayList<>();
    RecyclerView rv_school;
    List<SchoolBean> schoolBeanList;
    TextView tv_gz;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        intiView(view);
        initDate();
        banner.setImages(images);
        banner.setImageLoader(new GlideImageLoader());
        banner.start();
        GridBaseAdapter gridBaseAdapter = new GridBaseAdapter(getActivity(),gridBeans);
        gridView.setAdapter(gridBaseAdapter);
        SchoolAdapter2 adapter2 = new SchoolAdapter2(getActivity(),schoolBeanList);
        rv_school.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_school.setAdapter(adapter2);
        rv_school.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
        tv_gz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GuanZhiActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    private void initDate() {
        images = new ArrayList<>();
        images.add(R.drawable.yb1);
        images.add(R.drawable.yb2);
       // images.add(R.drawable.yb3);
        images.add(R.drawable.yb4);
        images.add(R.drawable.yb5);
        gridBeans.clear();
        gridBeans.add(new GridBean("易喵喵",R.drawable.icon1));
        gridBeans.add(new GridBean("广东高校易班",R.drawable.icon2));
        gridBeans.add(new GridBean("粤易班",R.drawable.icon3));
        gridBeans.add(new GridBean("易班熊",R.drawable.icon4));
        gridBeans.add(new GridBean("校园好声音",R.drawable.icon5));
        gridBeans.add(new GridBean("精品课程",R.drawable.icon6));
        gridBeans.add(new GridBean("能力测试",R.drawable.icon7));
        gridBeans.add(new GridBean("易培训",R.drawable.icon8));
        titles = new String[]{"学校","易班推荐","学院"};
        schoolBeanList = new ArrayList<>();
        schoolBeanList.clear();
        schoolBeanList.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
        schoolBeanList.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
        schoolBeanList.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
        schoolBeanList.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
        schoolBeanList.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
    }

    private void intiView(View view) {
        banner = view.findViewById(R.id.banner);
        gridView = view.findViewById(R.id.gridView);
        rv_school = view.findViewById(R.id.rv_school);
        tv_gz = view.findViewById(R.id.tv_gz);
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
