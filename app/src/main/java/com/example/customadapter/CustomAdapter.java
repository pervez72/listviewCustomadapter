package com.example.customadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] flagsall;
    String[] country_name;
    Context context;

    private  LayoutInflater layoutInflater;

    public CustomAdapter(Context context, String[] country_name, int[] flags) {

         this.context=context;
        this.country_name=country_name;
        this.flagsall=flags;
    }



    @Override
    public int getCount() {
        return country_name.length;
    }



    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ServiceCast")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){

            layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.sampleview,parent,false);

        }

       ImageView imageView= convertView.findViewById(R.id.imageViewID);
       TextView textView= convertView.findViewById(R.id.country_nameId);

       imageView.setImageResource(flagsall[position]);
       textView.setText(country_name[position]);



        return convertView;
    }
}
