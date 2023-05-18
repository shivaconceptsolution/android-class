package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {

    Spinner spdata;
    ListView lst;
    TextView txtresdata;
    String course[] = {"Select Course","C","C++","DS","JAVA","PHP","ANDROID","iOS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        spdata = findViewById(R.id.spcourse);
        txtresdata = findViewById(R.id.spresult);
        lst = findViewById(R.id.lstdata);
        ArrayAdapter obj = new ArrayAdapter(this, android.R.layout.simple_spinner_item,course);
        spdata.setAdapter(obj);
        spdata.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                txtresdata.setText("Course is "+course[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter obj1 = new ArrayAdapter(this, android.R.layout.simple_list_item_1,course);
        lst.setAdapter(obj1);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                txtresdata.setText("Course is "+course[i]);
            }
        });


    }
}