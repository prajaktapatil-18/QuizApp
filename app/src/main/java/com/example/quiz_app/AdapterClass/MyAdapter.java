package com.example.quiz_app.AdapterClass;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quiz_app.R;
import com.example.quiz_app.model.ModelClass;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    Context context;
    ArrayList<ModelClass> list;

    public MyAdapter(Context context, ArrayList<ModelClass> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view = LayoutInflater.from(context).inflate(R.layout.item_recycle,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {


        ModelClass modelClass =  list.get(position);
        holder.titleQuiz.setText(modelClass.getTitle());
        holder.desp.setText(modelClass.getDesp());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView titleQuiz , desp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            titleQuiz = itemView.findViewById(R.id.titleQuiz);
            desp = itemView.findViewById(R.id.desp);
        }
    }
}
