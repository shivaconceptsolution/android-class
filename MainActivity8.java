package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    int img[] = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};
    String sname[] = {"Jay kumar","Ravi kumar","Manish Kumar","Kapil Kumar"};
    Spinner sp;
    TextView txtres;
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        sp=findViewById(R.id.custspin);
        txtres=findViewById(R.id.spinnerresult);
        imgv = findViewById(R.id.spimg);
        StuAdapter obj = new StuAdapter(getApplicationContext(),img,sname);
        sp.setAdapter(obj);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                imgv.setImageResource(img[i]);
                txtres.setText("Selected Name is "+sname[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}