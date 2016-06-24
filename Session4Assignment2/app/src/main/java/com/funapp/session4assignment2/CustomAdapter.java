package com.funapp.session4assignment2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Keith on 6/24/2016.
 */
public class CustomAdapter extends ArrayAdapter {

    Activity context;
    String[] name;
    String[] phone;


public CustomAdapter(Activity context, String[] name, String[] phone) {
    super(context, R.layout.listlayout,name);
    this.context = context;
    this.name = name;
    this.phone = phone;
    }

public View getView(int position, View view, ViewGroup parent){

    LayoutInflater inflater = context.getLayoutInflater();
    View rowView = inflater.inflate(R.layout.listlayout,null,true);

    TextView textName = (TextView) rowView.findViewById(R.id.textName);
    TextView textPhone = (TextView) rowView.findViewById(R.id.textPhone);

    textName.setText(name[position]);
    textPhone.setText(phone[position]);

    return rowView;
    }
}
