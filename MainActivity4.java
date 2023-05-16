package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    RadioButton rb1,rb2,rb3;
    Button btn;
    TextView txtdata;
    String s = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        rb1 = findViewById(R.id.rbjava);
        rb2 = findViewById(R.id.rbnet);
        rb3 = findViewById(R.id.rbphp);
        txtdata = findViewById(R.id.txtradiores);
        btn= findViewById(R.id.btnradio);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rb1.isChecked())
                {
                    s = rb1.getText().toString();
                }
                else if(rb2.isChecked())
                {
                    s = rb2.getText().toString();
                }
                else
                {
                    s = rb3.getText().toString();
                }
                txtdata.setText(s);
            }
        });

    }
}