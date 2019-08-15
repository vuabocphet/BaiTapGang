package com.developer.baitapgang.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.developer.baitapgang.R;

public class ViewHodelIMG extends RecyclerView.ViewHolder {
    public ImageView img;
    public TextView txt;
    public ImageView love;
    public ImageView share;



    public ViewHodelIMG(@NonNull View itemView) {
        super(itemView);

        img = (ImageView) itemView.findViewById(R.id.img);
        txt = (TextView) itemView.findViewById(R.id.txt);
        love = (ImageView) itemView.findViewById(R.id.love);
        share = (ImageView) itemView.findViewById(R.id.share);
    }
}
