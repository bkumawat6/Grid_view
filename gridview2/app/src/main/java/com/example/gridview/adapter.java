package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adapter extends BaseAdapter{
 private final String name[];
 private final int images[];
 Context context;

    public adapter(Context context ,String[] name, int[] images) {
        this.context=context;
        this.name = name;
        this.images = images;

    }

    @Override
    public int getCount() {
        return name.length;
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
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1=layoutInflater.inflate(R.layout.singleframe,null);

        ImageView img=(ImageView) view.findViewById(R.id.iconimg);
        TextView tv=(TextView) view.findViewById(R.id.textdata);

        img.setImageResource(images[i]);
        tv.setText(name[i]);


        return view;
    }
}
