package com.example.android_num_18_listviewadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] this_Str = getResources().getStringArray(R.array.cities);
        ArrayAdapter<String> Str = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, this_Str);
        ListView listView = (ListView)findViewById(R.id.listV1);
        listView.setAdapter(Str);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView)findViewById(R.id.set_msg);
                textView.setText("你選擇: " + this_Str[position]);
            }
        });
    }
}