package com.example.testapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StuAdapter extends BaseAdapter {
    int imgid[];
    String sname[];
    Context ctx;
    LayoutInflater inflter;
    StuAdapter(Context ctx,int imgid[],String sname[])
    {
         this.imgid=imgid;
         this.sname=sname;
         this.ctx=ctx;
         inflter = LayoutInflater.from(ctx);
    }
    public int getCount() {
        return sname.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = inflter.inflate(R.layout.spinnerlayout,viewGroup, false);
        ImageView img = (ImageView) row.findViewById(R.id.custimgview);
        img.setImageResource(imgid[i]);
        TextView label = (TextView) row.findViewById(R.id.custtextview);
        label.setText(sname[i]);
        return row;
    }
}
