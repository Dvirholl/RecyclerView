package com.example.recyclerviewdvir;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView ImageView;
    TextView Textforimage;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        ImageView = itemView.findViewById(R.id.imageview);
        Textforimage = itemView.findViewById(R.id.Textforimage);
    }
}
