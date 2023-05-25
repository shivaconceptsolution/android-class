package com.example.testapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    Context ctx;
    int logos[];
    String s[];
    LayoutInflater inflter;
    GridAdapter(Context ctx, int logos[],String s[])
    {
        this.logos=logos;
        this.ctx=ctx;
        this.s=s;
        inflter = (LayoutInflater.from(ctx));
    }
    @Override
    public int getCount() {
        return logos.length;
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
        view = inflter.inflate(R.layout.gridlayout, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.grdimg); // get the reference of ImageView
        TextView txtv = (TextView) view.findViewById(R.id.txtgrd);
        icon.setImageResource(logos[i]); // set logo images
        txtv.setText(s[i]);
        return view;
    }
}
