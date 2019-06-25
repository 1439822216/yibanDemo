package com.example.yibandemo.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.yibandemo.R;
import com.example.yibandemo.adapter.GridBaseAdapter;
import com.example.yibandemo.bean.GridBean;
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
        return view;
    }

    private void initDate() {
        images = new ArrayList<>();
        images.add(R.drawable.yb1);
        images.add(R.drawable.yb2);
       // images.add(R.drawable.yb3);
        images.add(R.drawable.yb4);
        images.add(R.drawable.yb5);
        gridBeans.add(new GridBean("易喵喵",R.drawable.ic_launcher_background));
        gridBeans.add(new GridBean("广东高校易班",R.drawable.ic_launcher_background));
        gridBeans.add(new GridBean("粤易班",R.drawable.ic_launcher_background));
        gridBeans.add(new GridBean("易班熊",R.drawable.ic_launcher_background));
        gridBeans.add(new GridBean("校园好声音",R.drawable.ic_launcher_background));
        gridBeans.add(new GridBean("精品课程",R.drawable.ic_launcher_background));
        gridBeans.add(new GridBean("能力测试",R.drawable.ic_launcher_background));
        gridBeans.add(new GridBean("易培训",R.drawable.ic_launcher_background));
    }

    private void intiView(View view) {
        banner = view.findViewById(R.id.banner);
        gridView = view.findViewById(R.id.gridView);
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
