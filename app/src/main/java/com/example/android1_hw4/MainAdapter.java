package com.example.android1_hw4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    ArrayList<ItemModel> data = new ArrayList<>();

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_v, parent, false);
        return new MainViewHolder(view);
    }

    public void addTaext(ArrayList<ItemModel> list) {
        data.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(data.get(position));


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void addItem(ItemModel itemModel) {
        data.add(itemModel);
        notifyDataSetChanged();
    }
}
