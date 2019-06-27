package com.example.yibandemo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.yibandemo.R;
import com.example.yibandemo.adapter.LianxirenAdapter;
import com.example.yibandemo.adapter.LiaoTianAdapter;
import com.example.yibandemo.bean.SchoolBean;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LianxirenFragment extends Fragment {
    ListView lv_lianxiren;
    List<SchoolBean> list = new ArrayList<>();
    public LianxirenFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lianxiren, container, false);
        initView(view);
        initData();
        LianxirenAdapter adapter = new LianxirenAdapter(getActivity(),list);
        lv_lianxiren.setAdapter(adapter);
        return view;
    }

    private void initData() {
        list.clear();
        list.add(new SchoolBean("申请消息",null,null,R.drawable.lxr1));
        list.add(new SchoolBean("机构号",null,null,R.drawable.lxr2));
        list.add(new SchoolBean("群组",null,null,R.drawable.lxr3));
    }

    private void initView(View view) {
        lv_lianxiren = view.findViewById(R.id.lv_lianxiren);

    }

}
