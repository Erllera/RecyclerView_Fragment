package com.geektech.recycle_view_contacts;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    TextView contactsName, contactsNumber;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        contactsName = itemView.findViewById(R.id.contact_name);
        contactsNumber = itemView.findViewById(R.id.contact_number);
    }


    public void bind(String name){
        this.contactsName.setText(name);
    }

/*    public void bind(String number) {
        this.contactsNumber.setText(number);
    }*/
}
