package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText txt1,txt2;
    TextView txtv1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt1 = findViewById(R.id.txtnum1);
        txt2 = findViewById(R.id.txtnum2);
        txtv1 = findViewById(R.id.txtaddresult);
        btn = findViewById(R.id.btnadd);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(txt1.getText().toString());
                float b = Float.parseFloat(txt2.getText().toString());
                float c = a+b;
                txtv1.setText("Result is "+c);

            }
        });
    }
}