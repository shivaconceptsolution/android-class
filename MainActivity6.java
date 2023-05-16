package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity6 extends AppCompatActivity {

    ToggleButton tb;
    Switch sw;
    TextView txtv,txtv1;
    LinearLayout main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        tb = findViewById(R.id.togglebtn);
        sw = findViewById(R.id.swtchbtn);
        txtv = findViewById(R.id.txtres3);
        txtv1 = findViewById(R.id.txtres4);
        main = findViewById(R.id.mainlayout);
        main.setBackgroundColor(Color.GRAY);
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tb.getText().equals("ON"))
                {
                    txtv.setText("ONN");
                }
                else
                {
                    txtv.setText("OFF");
                }
                if(sw.isChecked())
                {
                    txtv1.setText("SWITCH ONN");
                }
                else
                {
                    txtv1.setText("SWITCH OFF");
                }
            }
        });
    }
}