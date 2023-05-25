package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {

    GridView grd;
    int logo[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3,R.drawable.img4};
    String str[] = {"Calling","User","INSTAGRAM","SETTINGS"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        grd = findViewById(R.id.grdv);
        GridAdapter obj = new GridAdapter(getApplicationContext(),logo,str);
        grd.setAdapter(obj);
        grd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Result is "+str[i],Toast.LENGTH_LONG).show();
            }
        });
    }
}