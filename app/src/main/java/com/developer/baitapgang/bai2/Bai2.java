package com.developer.baitapgang.bai2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.developer.baitapgang.R;
import com.developer.baitapgang.adapter.AdapterIMG;
import com.developer.baitapgang.model.Model_IMG;

import java.util.ArrayList;

public class Bai2 extends AppCompatActivity {

    private RecyclerView recyclerview;
    private ArrayList<Model_IMG> imgList;
    private AdapterIMG adapterIMG;
    private LinearLayoutManager linearLayoutManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        imgList=new ArrayList<>();
        imgList.clear();

        for (int i=0;i<=10;i++){

            if (i % 2 ==0){
                imgList.add(new Model_IMG(R.drawable.a,"Hello:"+i));
            }else {
                imgList.add(new Model_IMG(R.drawable.b,"Hello:"+i));
            }
        }
        linearLayoutManager=new LinearLayoutManager(this);
        adapterIMG=new AdapterIMG(this,imgList);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(linearLayoutManager);
        recyclerview.setHasFixedSize(true);
        recyclerview.setAdapter(adapterIMG);
    }
}
