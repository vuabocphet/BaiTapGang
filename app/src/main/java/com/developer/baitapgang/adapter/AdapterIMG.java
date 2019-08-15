package com.developer.baitapgang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.developer.baitapgang.R;
import com.developer.baitapgang.model.Model_IMG;
import com.developer.baitapgang.viewholder.ViewHodelIMG;

import java.util.ArrayList;

public class AdapterIMG extends RecyclerView.Adapter<ViewHodelIMG> {
    private Context context;
    private ArrayList<Model_IMG> model_imgs;

    public AdapterIMG(Context context, ArrayList<Model_IMG> model_imgs) {
        this.context = context;
        this.model_imgs = model_imgs;
    }

    @NonNull
    @Override
    public ViewHodelIMG onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHodelIMG(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHodelIMG holder, final int position) {

        Model_IMG img=model_imgs.get(position);

        holder.txt.setText(img.getTxt());
        holder.img.setImageResource(img.getImg());

        holder.love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Love:"+position, Toast.LENGTH_SHORT).show();
            }
        });

        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Share:"+position, Toast.LENGTH_SHORT).show();
            }
        });


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "View:"+position, Toast.LENGTH_SHORT).show();
            }
        });



    }

    @Override
    public int getItemCount() {
        if (model_imgs.isEmpty())return 0;
        else return model_imgs.size();
    }
}
