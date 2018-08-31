package com.example.matheusmaxwellmeireles.aulalistview2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Integer> listImages;
    private ArrayList<String> listCars;

    public MyAdapter(Context context, ArrayList<Integer> listImages, ArrayList<String> listCars) {
        this.context = context;
        this.listImages = listImages;
        this.listCars = listCars;
    }

    @Override
    public int getCount() {
        return listCars.size();
    }

    @Override
    public Object getItem(int i) {
        return listCars.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){

            view = View.inflate(context, R.layout.items_list, null);

        }

        ImageView image = (ImageView) view.findViewById(R.id.image);
        TextView text = (TextView) view.findViewById(R.id.text);

        image.setImageResource(listImages.get(i));
        text.setText(listCars.get(i));

        return view;
    }
}
