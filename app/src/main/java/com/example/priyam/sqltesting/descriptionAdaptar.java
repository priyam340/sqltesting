package com.example.priyam.sqltesting;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class descriptionAdaptar extends ArrayAdapter {
    List list=new ArrayList();
    public descriptionAdaptar( Context context, int resource) {
        super(context, resource);
    }

    public void add(description object) {
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }


    @Override
    public Object getItem(int position) {
        return list.get(position);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        View row;
        row=convertView;
        holder holder;
        if(row==null)
        {
            LayoutInflater layoutInflater=(LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row= layoutInflater.inflate(R.layout.rowlayout,parent,false);
            holder=new holder();
            holder.tx_title=(TextView)row.findViewById(R.id.tx_title);
            holder.tx_descr=(TextView)row.findViewById(R.id.tx_descr);
        //    holder.tx_link=(TextView)row.findViewById(R.id.tx_link);
            row.setTag(holder);
        }
        else{
            holder=(holder) row.getTag();
        }
        description description=(description) this.getItem(position);
        holder.tx_title.setText(description.getTitle());
        holder.tx_descr.setText(description.getDescr());
      //  holder.tx_link.setText(description.getLink());
        return row;
    }
    static class holder{

        TextView tx_title,tx_descr;
    }


}
