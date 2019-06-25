package com.example.yibandemo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.yibandemo.R;
import com.example.yibandemo.adapter.SchoolAdapter;
import com.example.yibandemo.adapter.SchoolAdapter2;
import com.example.yibandemo.bean.SchoolBean;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SchoolFragment extends Fragment {
    RecyclerView rv_school;
    List<SchoolBean> list;
    public SchoolFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_school, container, false);
        initView(view);
        initData();
       // SchoolAdapter adapter = new SchoolAdapter(getActivity(),list);
        SchoolAdapter2 adapter = new SchoolAdapter2(getActivity(),list);
        rv_school.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_school.setAdapter(adapter);
        return view;
    }

    private void initData() {
        list = new ArrayList<>();
        list.clear();
        list.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
        list.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
        list.add(new SchoolBean("aa","aa",null,R.drawable.ic_launcher_background));
    }

    private void initView(View view) {
        rv_school = view.findViewById(R.id.rv_school);
    }

}
