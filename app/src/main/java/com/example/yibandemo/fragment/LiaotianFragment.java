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
        list.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
        list.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
        list.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
        list.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
        list.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
    }

    private void initView(View view) {
        lv_liaotian = view.findViewById(R.id.lv_liaotian);

    }

}
