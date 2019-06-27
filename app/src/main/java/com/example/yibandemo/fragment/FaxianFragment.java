package com.example.yibandemo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.yibandemo.R;
import com.example.yibandemo.adapter.LianxirenAdapter;
import com.example.yibandemo.bean.SchoolBean;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FaxianFragment extends Fragment {
    ListView lv_faxian;
    List<SchoolBean> list = new ArrayList<>();
    public FaxianFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_faxian, container, false);
        initView(view);
        initData();
        LianxirenAdapter adapter = new LianxirenAdapter(getActivity(),list);
        lv_faxian.setAdapter(adapter);
        return view;
    }
    private void initData() {
        list.clear();
        list.add(new SchoolBean("动态",null,null,R.drawable.dt));
        list.add(new SchoolBean("易瞄瞄",null,null,R.drawable.icon1));
        list.add(new SchoolBean("易运动",null,null,R.drawable.yd));
        list.add(new SchoolBean("易班熊",null,null,R.drawable.icon4));
        list.add(new SchoolBean("签到",null,null,R.drawable.qd));
        list.add(new SchoolBean("扫一扫",null,null,R.drawable.sys));
        list.add(new SchoolBean("应用广场",null,null,R.drawable.yy));
        list.add(new SchoolBean("网薪红包",null,null,R.drawable.hb));
        list.add(new SchoolBean("易班优客",null,null,R.drawable.icon6));
    }
    private void initView(View view) {
        lv_faxian = view.findViewById(R.id.lv_faxian);

    }

}
