package com.example.yibandemo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.yibandemo.R;
import com.example.yibandemo.adapter.LiaoTianAdapter;
import com.example.yibandemo.bean.SchoolBean;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LiaotianFragment extends Fragment {
    ListView lv_liaotian;
    List<SchoolBean> list = new ArrayList<>();
    public LiaotianFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_liaotian, container, false);
        initView(view);
        initData();
        LiaoTianAdapter adapter = new LiaoTianAdapter(getActivity(),list);
        lv_liaotian.setAdapter(adapter);
        return view;
    }

    private void initData() {
        list.clear();
        list.add(new SchoolBean("广东职业技术学院","你好",null,R.drawable.icon2));
        list.add(new SchoolBean("易班熊","你好",null,R.drawable.icon4));
        list.add(new SchoolBean("粤易班",null,null,R.drawable.icon3));
        list.add(new SchoolBean("优客",null,null,R.drawable.icon6));
        list.add(new SchoolBean("人才招聘","我们这里有最新招聘信息",null,R.drawable.icon7));
    }

    private void initView(View view) {
        lv_liaotian = view.findViewById(R.id.lv_liaotian);

    }

}
