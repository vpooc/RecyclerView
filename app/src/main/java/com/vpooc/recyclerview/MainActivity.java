package com.vpooc.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
//    private RecyclerView.LayoutManager layoutManager;
    private LinearLayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private RecyclerView.ItemAnimator animation;
    private ArrayList<String> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv);

        //initData
        initData();

        //LayoutManager
//        layoutManager=new LayoutManager();
        layoutManager=new LinearLayoutManager(this);

        //Adapter
        adapter=new RecyclerViewAdapter(this,mDatas);

        //Animation
        animation=new DefaultItemAnimator();

        //Decoration
        RecyclerView.ItemDecoration decoration=new ItemDecoration(this, LinearLayout.VERTICAL);

        //set Layout
        recyclerView.setLayoutManager(layoutManager);

        //set Adapter
        recyclerView.setAdapter(adapter);

        //set Animation
        recyclerView.setItemAnimator(animation);

        //set Decoration
        recyclerView.addItemDecoration(decoration);

    }

    private void initData() {
        mDatas = new ArrayList<String>();
        for (int i = 'A'; i < 'z'; i++)
        {
            mDatas.add("" + (char) i);
        }
    }


}
