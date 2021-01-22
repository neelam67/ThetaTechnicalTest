package com.example.thetatechnicaltest;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList<UserDetails> personNames;
    Context context;

    public CustomAdapter(Context context, ArrayList<UserDetails> personNames) {
        this.context = context;
        this.personNames = personNames;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_cell, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // set the data in items
        holder.email.setText(personNames.get(position).getEmail());
        holder.firstName.setText(personNames.get(position).getFirstName());
        holder.firstName.setText(personNames.get(position).getLastName());
        holder.avatar.setImageURI(Uri.parse(personNames.get(position).getAvatar()));


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView email, firstName, lastName ;// init the item view's
        ImageView avatar;

        public MyViewHolder(View itemView) {
            super(itemView);

            // get the reference of item view's
            email = (TextView) itemView.findViewById(R.id.Email);
            firstName = (TextView) itemView.findViewById(R.id.FirstName);
            lastName = (TextView) itemView.findViewById(R.id.LastName);
            avatar = (ImageView) itemView.findViewById(R.id.Avatar);






        }
    }
}
