package com.geektech.recycle_view_contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ContactAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);

        ArrayList<String> names = new ArrayList<>();
        names.add("Эрлан");
        names.add("Самат");
        names.add("Илимбек");
        names.add("Майрам");
        names.add("Бека");
        names.add("Анико");
        names.add("Жазира");
        names.add("Гулиза");

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("0222-36-66-00");
        numbers.add("0771-27-93-04");
        numbers.add("0707-25-78-52");
        numbers.add("0550-20-10-88");
        numbers.add("0779-00-71-01");

        adapter = new ContactAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}