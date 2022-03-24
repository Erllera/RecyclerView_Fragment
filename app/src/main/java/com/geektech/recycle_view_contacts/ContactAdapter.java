package com.geektech.recycle_view_contacts;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

/*    ArrayList<String> numbers = new ArrayList<>();*/

    public ContactAdapter(ArrayList<String> names) {
        /*this.numbers = numbers;*/
        this.names = names;
    }

    ArrayList<String> names = new ArrayList<>();


    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.bind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
