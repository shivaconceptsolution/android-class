package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity9 extends AppCompatActivity {

    int img[] = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};
    String sname[] = {"Jay kumar","Ravi kumar","Manish Kumar","Kapil Kumar"};
    ListView lstv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        lstv = findViewById(R.id.lstview2);
        StuAdapter obj = new StuAdapter(getApplicationContext(),img,sname);
        lstv.setAdapter(obj);
    }
}