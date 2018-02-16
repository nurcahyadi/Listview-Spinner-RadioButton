package com.example.android.m5_si3904_37_nurcahyadi;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class AdapterListview extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;

    public AdapterListview(Activity context, String[] itemname) {
        super(context, R.layout.activity_list, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        txtTitle.setText(itemname[position]);

        return rowView;

    }
}