package com.example.worb8.jshelper;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by worb8 on 2018-04-15.
 */

public class Adapter extends PagerAdapter{
    private int[] images = {R.drawable.item1,
    R.drawable.item2,
    R.drawable.item3};

    private LayoutInflater inflater;
    private Context context;

    public Adapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount(){
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        inflater = (LayoutInflater)context.getSystemService
         (Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.activity_slider, container, false);
        ImageView imageView = (ImageView)v.findViewById(R.id.imageView);
        TextView textView = (TextView) v.findViewById(R.id.textView);

        imageView.setImageResource(images[position]);

        String text = (position + 1) + "번째 이미지";
        textView.setText(text);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.invalidate();
    }
}
