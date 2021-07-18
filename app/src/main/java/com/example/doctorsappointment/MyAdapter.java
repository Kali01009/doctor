package com.example.doctorsappointment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<user> list;

    public MyAdapter(Context context, ArrayList<user> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext ()).inflate(R.layout.item,parent,false);



        return new MyViewHolder ( v );
    }

    @Override
    public void onBindViewHolder(@NonNull  MyAdapter.MyViewHolder holder, int position) {

        user usr = list.get(position);

        holder.firstname.setText(usr.getFirstName());
        holder.lastname.setText(usr.getLastName());
        holder.firstname.setText(usr.getAge());
        holder.date.setText(usr.getDate());



    }

    @Override
    public int getItemCount() {


        return list.size();
    }

    public static
    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView firstname,lastname,age,date;


        public MyViewHolder(@NonNull  View itemView) {
            super(itemView);

            firstname = itemView.findViewById(R.id.nameHolder);
            lastname = itemView.findViewById(R.id.surnameHolder);
            age = itemView.findViewById(R.id.ageHolder);
            date = itemView.findViewById ( R.id.dateHolder );
        }
    }
}