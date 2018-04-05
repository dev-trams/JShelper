package com.example.worb8.jshelper;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Main1Activity extends AppCompatActivity implements View.OnClickListener {

    private AlertDialog dialog;
    ImageButton[] imageButtons = new ImageButton[6];
    ImageButton[] btn = new ImageButton[6];
    LinearLayout[] linearLayouts = new LinearLayout[20];

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        int id = R.id.it1;
        for (int i = 1; i < 6; i++) {
            imageButtons[i] = (ImageButton) findViewById(id + i);
            btn[i] = (ImageButton) findViewById(id + 1);
            btn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        Log.v("onClick", "버튼이 클릭되었습니다.");
        int id = R.id.btn1;
        for (int i = 1; i < 6; i++) {
            switch (id) {
                case 1:
                    js_add_count1();
                default:
                    break;

            }
        }
    }

    private void js_add_count1() {
        int aclayout = R.layout.activity_layout1_1;
        int alert = R.id.alert1;
        for (int i = 1; i < 6; i++) {
            dialog = create_inputDialog();

            // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
            Context context = getApplicationContext();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

            // 레이아웃 설정
            View view = inflater.inflate(aclayout + i, (ViewGroup) findViewById(alert + i));
            // Input 소프트 키보드 보이기
            dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

            // AlertDialog에 레이아웃 추가
            dialog.setView(view);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

            dialog.show();
        }
    }
}