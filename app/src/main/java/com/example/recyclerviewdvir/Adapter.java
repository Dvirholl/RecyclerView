package com.example.recyclerviewdvir;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<ViewHolder> implements View.OnCapturedPointerListener {

    Context context;
    List<com.example.recyclerviewdvir.Items> Items;

    public Adapter(Context context) {
        this.context = context;
        List<com.example.recyclerviewdvir.Items> items;
        items = null;
        Items = null;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.itemview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.ImageView.setImageResource(Items.get(position).getimageview);
        holder.Textforimage.setText(Items.get(position).getTextforiamge());
    }

    @Override
    public int getItemCount() {
        return Items.size();
    }

    @Override
    public boolean onCapturedPointer(View view, MotionEvent event) {
        return false;
    }
}
