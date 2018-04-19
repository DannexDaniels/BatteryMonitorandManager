package com.dannextech.apps.batterymonitorandmanager;

import android.app.ActivityManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 2/22/18.
 */

public class MyAdapter extends BaseAdapter{

    LayoutInflater inflater;
    ArrayList<MyModel> objects;

    public class ViewHolder{
        TextView tvName,tvPercentage;
    }

    public MyAdapter(Context context, ArrayList<MyModel> objects) {
        inflater = LayoutInflater.from(context);
        this.objects = objects;
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.running_details,null);
            holder.tvName = (TextView) convertView.findViewById(R.id.tvAppName);
            holder.tvPercentage = (TextView) convertView.findViewById(R.id.tvPercentage);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvPercentage.setText(objects.get(position).getPercentage());
        holder.tvName.setText(objects.get(position).getApp());

        return convertView;
    }
}
