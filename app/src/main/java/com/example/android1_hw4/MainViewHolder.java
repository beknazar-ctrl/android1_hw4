
package com.example.android1_hw4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txtdate;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        txt1=itemView.findViewById(R.id.zagolovok);
        txt2=itemView.findViewById(R.id.opisanie);
        txt3 = itemView.findViewById(R.id.one);
        txtdate=itemView.findViewById(R.id.date);

    }
    public void onBind(ItemModel data){
        txt1.setText(data.zagolovok);
        txt2.setText(data.opisanie);
        txt3.setText("" + (1+getAdapterPosition()));
        txtdate.setText(data.date);
    }
}
