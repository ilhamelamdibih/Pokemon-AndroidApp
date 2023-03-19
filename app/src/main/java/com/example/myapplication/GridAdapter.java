package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
    Context context;
    String[] pokemonName;
    int[] image;
    LayoutInflater inflater;

    public GridAdapter(Context context, String[] pokemonName, int[] image) {
        this.context = context;
        this.pokemonName = pokemonName;
        this.image = image;
    }

    @Override
    public int getCount() {
        return pokemonName.length;
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
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(inflater == null)
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = inflater.inflate(R.layout.grid_item,null);

        ImageView imageView = view.findViewById(R.id.gri_image);
        TextView textView = view.findViewById(R.id.item_name);

        imageView.setImageResource(image[position]);
        textView.setText(pokemonName[position]);

        return view;
    }
}