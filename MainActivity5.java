package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    CheckBox ch1,ch2,ch3;
    Button btn;
    TextView txtres23;
    int totalfee=0;
    int fee1=0;
    int fee2=0;
    int fee3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ch1 = findViewById(R.id.chk1);
        ch2 = findViewById(R.id.chk2);
        ch3 = findViewById(R.id.chk3);
        btn = findViewById(R.id.btncheck);
        txtres23 = findViewById(R.id.txtrescheck);
        totalfee=0;
        fee1=0;
        fee2=0;
        fee3=0;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                if(ch1.isChecked())
                {
                    fee1=1000;
                    sb.append(ch1.getText().toString() + " ");
                }
                else
                {
                    fee1=0;
                }

                if(ch2.isChecked())
                {
                    sb.append(ch2.getText().toString() + " ");
                    fee2=1200;
                }
                else
                {
                    fee2=0;
                }

                if(ch3.isChecked())
                {
                    sb.append(ch3.getText().toString() + " ");
                    fee3=4000;
                }
                else
                {
                    fee3=0;
                }
               totalfee= fee1 + fee2 + fee3;
                txtres23.setText(""+totalfee);
            }
        });
    }
}