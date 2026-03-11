package com.srujana.myapplicationlayout;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link ListView
        listView = findViewById(R.id.listView);

        // Simple data
        String[] items = {
                "FrameLayout",
                "RelativeLayout",
                "AbsoluteLayout",
                "TableLayout",

        };

        // Adapter
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_list_item_1,
                        items
                );

        // Set adapter
        listView.setAdapter(adapter);
    }
}
