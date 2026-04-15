package com.example.a3gtrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        int[] pictures = {
                R.drawable.apple, R.drawable.banana, R.drawable.orange,
                R.drawable.mango, R.drawable.kiwi, R.drawable.lime,
                R.drawable.papaya, R.drawable.currant, R.drawable.plum
        };

       RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(
                MainActivity.this,
                getResources().getStringArray(R.array.names),
                pictures
        ));




    }
}