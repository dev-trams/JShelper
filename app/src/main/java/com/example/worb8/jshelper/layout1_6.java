package com.example.worb8.jshelper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class layout1_6 extends AppCompatActivity{

    Adapter adapter;
    ViewPager viewPager;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1_6);

        viewPager = (ViewPager)findViewById(R.id.view);
        adapter = new Adapter(this);
        viewPager.setAdapter(adapter);
    }
}
