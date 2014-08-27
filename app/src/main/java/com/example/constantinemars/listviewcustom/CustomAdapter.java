package com.example.constantinemars.listviewcustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Constantine Mars on 8/26/2014.
 */
public class CustomAdapter extends ArrayAdapter<String> {

    String values[];
    Context context;

    public CustomAdapter(Context context, String values[]) {
        super(context, R.layout.row, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate((position == 0 ? R.layout.first_row : R.layout.row), parent, false);

        TextView textView = (TextView)rowView.findViewById(R.id.text);
        textView.setText(values[position]);

        return rowView;
    }
}
