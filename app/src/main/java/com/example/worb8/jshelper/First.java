package com.example.worb8.jshelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }
    public void onbtnClick1 (View view) {
        Log.v("경기도", "눌림");
        Intent intent1 = new Intent(getApplicationContext(),Main1Activity.class);
        startActivity(intent1);

    }
    public void onbtnClick2 (View view) {
        Log.v("강원도", "눌림");
        Intent intent2 = new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent2);
    }
    public void onbtnClick3 (View view) {
        Log.v("경상도", "눌림");
        Intent intent3 = new Intent(getApplicationContext(),Main3Activity.class);
        startActivity(intent3);
    }
    public void onbtnClick4 (View view) {
        Log.v("전라도", "눌림");
        Intent intent4 = new Intent(getApplicationContext(),Main4Activity.class);
        startActivity(intent4);
    }
    public void onbtnClick5 (View view) {
        Log.v("충청도", "눌림");
        Intent intent5 = new Intent(getApplicationContext(),Main5Activity.class);
        startActivity(intent5);
    }
    public void onbtnClick6 (View view) {
        Log.v("준비중", "눌림");
        Intent intent6 = new Intent(getApplicationContext(),Main6Activity.class);
        startActivity(intent6);
    }
}