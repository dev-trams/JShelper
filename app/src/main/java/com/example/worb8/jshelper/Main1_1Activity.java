package com.example.worb8.jshelper;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Main1_1Activity extends AppCompatActivity implements View.OnClickListener {

    private AlertDialog dialog;
    private ImageButton btn1;
    private AlertDialog create_inputDialog() {
        AlertDialog dialogBox = new AlertDialog.Builder(this)
                .setTitle("제사도구")
                .setNeutralButton("확인", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // 아니오 버튼 눌렀을때 액션 구현
                    }
                }).create();
        return dialogBox;
    }
    LinearLayout layout1;
    ImageButton it1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        it1 = (ImageButton) findViewById(R.id.it1);

        btn1 = (ImageButton) findViewById(R.id.it1);

        btn1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Log.v("onClick","버튼이 클릭되었습니다.");
        switch (view.getId()){
            case R.id.it1:
                js_add_count1();
                break;

        }
    }

    private void js_add_count1() {
            dialog = create_inputDialog();

            // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
            Context context = getApplicationContext();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

            // 레이아웃 설정
            View view = inflater.inflate(R.layout.activity_layout1_1, (ViewGroup) findViewById(R.id.alert1));
            // Input 소프트 키보드 보이기
            dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

            // AlertDialog에 레이아웃 추가
            dialog.setView(view);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

            dialog.show();
        }
//
//    private void js_add_count2() {
//
//        dialog = create_inputDialog();
//
//        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
//        Context context = getApplicationContext();
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
//
//        // 레이아웃 설정
//        View layout2 = inflater.inflate(R.layout.activity_layout1_2, (ViewGroup) findViewById(R.id.alert2));
//
//        // Input 소프트 키보드 보이기
//        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//
//        // AlertDialog에 레이아웃 추가
//        dialog.setView(layout2);
////        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);
//
//        dialog.show();
//
//    }
//
//    private void js_add_count3() {
//
//        dialog = create_inputDialog();
//
//        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
//        Context context = getApplicationContext();
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
//
//        // 레이아웃 설정
//        View layout3 = inflater.inflate(R.layout.activity_layout1_3, (ViewGroup) findViewById(R.id.alert3));
//
//        // Input 소프트 키보드 보이기
//        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//
//        // AlertDialog에 레이아웃 추가
//        dialog.setView(layout3);
////        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);
//
//        dialog.show();
//
//    }
//
//    private void js_add_count4() {
//
//        dialog = create_inputDialog();
//
//        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
//        Context context = getApplicationContext();
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
//
//        // 레이아웃 설정
//        View layout4 = inflater.inflate(R.layout.activity_layout1_4, (ViewGroup) findViewById(R.id.alert4));
//
//        // Input 소프트 키보드 보이기
//        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//
//        // AlertDialog에 레이아웃 추가
//        dialog.setView(layout4);
////        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);
//
//        dialog.show();
//
//    }
//
//    private void js_add_count5() {
//
//        dialog = create_inputDialog();
//
//        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
//        Context context = getApplicationContext();
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
//
//        // 레이아웃 설정
//        View layout5 = inflater.inflate(R.layout.activity_layout1_5, (ViewGroup) findViewById(R.id.alert5));
//
//        // Input 소프트 키보드 보이기
//        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//
//        // AlertDialog에 레이아웃 추가
//        dialog.setView(layout5);
////        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);
//
//        dialog.show();
//
//    }
//
//    private void js_add_count6() {
//
//        dialog = create_inputDialog();
//
//        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
//        Context context = getApplicationContext();
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);
//
//        // 레이아웃 설정
//        View layout6 = inflater.inflate(R.layout.activity_layout1_6, (ViewGroup) findViewById(R.id.alert6));
//
//        // Input 소프트 키보드 보이기
//        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
//
//        // AlertDialog에 레이아웃 추가
//        dialog.setView(layout6);
////        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);
//
//        dialog.show();
//
//    }
}