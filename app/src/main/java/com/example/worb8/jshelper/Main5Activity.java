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


public class Main5Activity extends AppCompatActivity implements View.OnClickListener {

    private AlertDialog dialog;
    private ImageButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    private ImageButton btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;
    private ImageButton btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30;
    private ImageButton btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38, btn39, btn40;

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

    private LinearLayout layout1, layout2, layout3, layout4, layout5, layout6, layout7, layout8, layout9, layout10, layout11, layout12, layout13, layout14, layout15, layout16, layout17, layout18, layout19, layout20, layout21, layout22, layout23, layout24, layout25, layout26, layout27, layout28, layout29, layout30, layout31, layout32, layout33, layout34, layout35, layout36, layout37, layout38, layout39;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v("onCreate", "엑티비티가 실행되었습니다.");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        //findViewById↓
        //region

        btn1 = (ImageButton) findViewById(R.id.it1);
        btn2 = (ImageButton) findViewById(R.id.it2);
        btn3 = (ImageButton) findViewById(R.id.it3);
        btn4 = (ImageButton) findViewById(R.id.it4);
        btn5 = (ImageButton) findViewById(R.id.it5);
        btn6 = (ImageButton) findViewById(R.id.it6);
        btn7 = (ImageButton) findViewById(R.id.it7);
        btn8 = (ImageButton) findViewById(R.id.it8);
        btn9 = (ImageButton) findViewById(R.id.it9);
        btn10 = (ImageButton) findViewById(R.id.it10);
        btn11 = (ImageButton) findViewById(R.id.it11);
        btn12 = (ImageButton) findViewById(R.id.it12);
        btn13 = (ImageButton) findViewById(R.id.it13);
        btn14 = (ImageButton) findViewById(R.id.it14);
        btn15 = (ImageButton) findViewById(R.id.it15);
        btn16 = (ImageButton) findViewById(R.id.it16);
        btn17 = (ImageButton) findViewById(R.id.it17);
        btn18 = (ImageButton) findViewById(R.id.it18);
        btn19 = (ImageButton) findViewById(R.id.it19);
        btn20 = (ImageButton) findViewById(R.id.it20);
        btn21 = (ImageButton) findViewById(R.id.it21);
        btn22 = (ImageButton) findViewById(R.id.it22);
        btn23 = (ImageButton) findViewById(R.id.it23);
        btn24 = (ImageButton) findViewById(R.id.it24);
        btn25 = (ImageButton) findViewById(R.id.it25);
        btn26 = (ImageButton) findViewById(R.id.it26);
        btn27 = (ImageButton) findViewById(R.id.it27);
        btn28 = (ImageButton) findViewById(R.id.it28);
        btn29 = (ImageButton) findViewById(R.id.it29);
        btn30 = (ImageButton) findViewById(R.id.it30);
        btn31 = (ImageButton) findViewById(R.id.it31);
        btn32 = (ImageButton) findViewById(R.id.it32);
//        안쓰는 버튼(다른 엑티비티용)
//        btn33=(ImageButton)findViewById(R.id.it33);
//        btn34=(ImageButton)findViewById(R.id.it34);
//        btn35=(ImageButton)findViewById(R.id.it35);
//        btn36=(ImageButton)findViewById(R.id.it36);
//        btn37=(ImageButton)findViewById(R.id.it37);
//        btn38=(ImageButton)findViewById(R.id.it38);
//        btn39=(ImageButton)findViewById(R.id.it39);
//        btn40=(ImageButton)findViewById(R.id.it40);
//endregion
        //setOnClick↓
        //region
        btn1.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);
        btn27.setOnClickListener(this);
        btn28.setOnClickListener(this);
        btn29.setOnClickListener(this);
        btn30.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
//        안쓰는 버튼(다른 엑티비티용)
//        btn33.setOnClickListener(this);
//        btn34.setOnClickListener(this);
//        btn35.setOnClickListener(this);
//        btn36.setOnClickListener(this);
//        btn37.setOnClickListener(this);
//        btn38.setOnClickListener(this);
//        btn39.setOnClickListener(this);
//        btn40.setOnClickListener(this);

//endregion
    }

    @Override
    public void onClick(View v) {
        Log.v("onClick", "버튼이 클릭되어다음페이지로 넘어갔습니다.");
        switch (v.getId()) {
            case R.id.it1:
                Log.v("it", "1버튼이 클릭되었습니다.");
                js_add_count1();
                break;
            case R.id.it2:
                Log.v("it", "2버튼이 클릭되었습니다.");
                js_add_count2();
                break;
            case R.id.it3:
                Log.v("it", "3버튼이 클릭되었습니다.");
                js_add_count3();
                break;
            case R.id.it4:
                Log.v("it", "4버튼이 클릭되었습니다.");
                js_add_count4();
                break;
            case R.id.it5:
                Log.v("it", "5버튼이 클릭되었습니다.");
                js_add_count5();
                break;
            case R.id.it6:
                Log.v("it", "6버튼이 클릭되었습니다.");
                js_add_count6();
                break;
            case R.id.it7:
                Log.v("it", "7버튼이 클릭되었습니다.");
                js_add_count7();
                break;
            case R.id.it8:
                Log.v("it", "8버튼이 클릭되었습니다.");
                js_add_count8();
                break;
            case R.id.it9:
                Log.v("it", "9버튼이 클릭되었습니다.");
                js_add_count9();
                break;
            case R.id.it10:
                Log.v("it", "10버튼이 클릭되었습니다.");
                js_add_count10();
                break;
            case R.id.it11:
                Log.v("it", "11버튼이 클릭되었습니다.");
                js_add_count11();
                break;
            case R.id.it12:
                Log.v("it", "12버튼이 클릭되었습니다.");
                js_add_count12();
                break;
            case R.id.it13:
                Log.v("it", "13버튼이 클릭되었습니다.");
                js_add_count13();
                break;
            case R.id.it14:
                Log.v("it", "14버튼이 클릭되었습니다.");
                js_add_count14();
                break;
            case R.id.it15:
                Log.v("it", "15버튼이 클릭되었습니다.");
                js_add_count15();
                break;
            case R.id.it16:
                Log.v("it", "16버튼이 클릭되었습니다.");
                js_add_count16();
                break;
            case R.id.it17:
                Log.v("it", "17버튼이 클릭되었습니다.");
                js_add_count17();
                break;
            case R.id.it18:
                Log.v("it", "18버튼이 클릭되었습니다.");
                js_add_count18();
                break;
            case R.id.it19:
                Log.v("it", "19버튼이 클릭되었습니다.");
                js_add_count19();
                break;
            case R.id.it20:
                Log.v("it", "20버튼이 클릭되었습니다.");
                js_add_count20();
                break;
            case R.id.it21:
                Log.v("it", "21버튼이 클릭되었습니다.");
                js_add_count21();
                break;
            case R.id.it22:
                Log.v("it", "22버튼이 클릭되었습니다.");
                js_add_count22();
                break;
            case R.id.it23:
                Log.v("it", "23버튼이 클릭되었습니다.");
                js_add_count23();
                break;
            case R.id.it24:
                Log.v("it", "24버튼이 클릭되었습니다.");
                js_add_count24();
                break;
            case R.id.it25:
                Log.v("it", "25버튼이 클릭되었습니다.");
                js_add_count25();
                break;
            case R.id.it26:
                Log.v("it", "26버튼이 클릭되었습니다.");
                js_add_count26();
                break;
            case R.id.it27:
                Log.v("it", "27버튼이 클릭되었습니다.");
                js_add_count27();
                break;
            case R.id.it28:
                Log.v("it", "28버튼이 클릭되었습니다.");
                js_add_count28();
                break;
        }

    }
    //js_add_count↓
//region
    private void js_add_count1() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout1 = inflater.inflate(R.layout.activity_layout1_1, (ViewGroup) findViewById(R.id.alert1));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout1);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count2() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout2 = inflater.inflate(R.layout.activity_layout1_2, (ViewGroup) findViewById(R.id.alert2));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout2);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count3() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout3 = inflater.inflate(R.layout.activity_layout1_3, (ViewGroup) findViewById(R.id.alert3));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout3);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count4() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout4 = inflater.inflate(R.layout.activity_layout1_4, (ViewGroup) findViewById(R.id.alert4));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout4);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count5() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout5 = inflater.inflate(R.layout.activity_layout1_5, (ViewGroup) findViewById(R.id.alert5));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout5);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count6() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout6 = inflater.inflate(R.layout.activity_layout1_6, (ViewGroup) findViewById(R.id.alert6));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout6);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count7() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout7 = inflater.inflate(R.layout.activity_layout1_7, (ViewGroup) findViewById(R.id.alert7));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout7);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count8() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout8 = inflater.inflate(R.layout.activity_layout1_8, (ViewGroup) findViewById(R.id.alert8));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout8);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count9() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout9 = inflater.inflate(R.layout.activity_layout1_9, (ViewGroup) findViewById(R.id.alert9));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout9);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count10() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout10 = inflater.inflate(R.layout.activity_layout2_1, (ViewGroup) findViewById(R.id.alert10));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout10);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count11() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout11 = inflater.inflate(R.layout.activity_layout2_2, (ViewGroup) findViewById(R.id.alert11));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout11);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count12() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout12 = inflater.inflate(R.layout.activity_layout2_3, (ViewGroup) findViewById(R.id.alert13));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout12);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count13() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout13 = inflater.inflate(R.layout.activity_layout2_4, (ViewGroup) findViewById(R.id.alert13));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout13);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count14() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout14 = inflater.inflate(R.layout.activity_layout2_5, (ViewGroup) findViewById(R.id.alert14));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout14);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count15() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout15 = inflater.inflate(R.layout.activity_layout2_6, (ViewGroup) findViewById(R.id.alert15));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout15);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count16() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout16 = inflater.inflate(R.layout.activity_layout2_7, (ViewGroup) findViewById(R.id.alert16));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout16);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count17() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout17 = inflater.inflate(R.layout.activity_layout2_8, (ViewGroup) findViewById(R.id.alert26));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout17);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count18() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout18 = inflater.inflate(R.layout.activity_layout2_9, (ViewGroup) findViewById(R.id.alert18));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout18);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count19() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout19 = inflater.inflate(R.layout.activity_layout3_1, (ViewGroup) findViewById(R.id.alert19));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout19);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count20() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout20 = inflater.inflate(R.layout.activity_layout3_2, (ViewGroup) findViewById(R.id.alert20));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout20);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count21() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout21 = inflater.inflate(R.layout.activity_layout3_3, (ViewGroup) findViewById(R.id.alert21));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout21);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count22() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout22 = inflater.inflate(R.layout.activity_layout3_4, (ViewGroup) findViewById(R.id.alert22));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout22);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count23() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout23 = inflater.inflate(R.layout.activity_layout3_5, (ViewGroup) findViewById(R.id.alert23));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout23);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count24() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout24 = inflater.inflate(R.layout.activity_layout3_6, (ViewGroup) findViewById(R.id.alert24));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout24);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count25() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout25 = inflater.inflate(R.layout.activity_layout3_7, (ViewGroup) findViewById(R.id.alert25));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout25);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count26() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout26 = inflater.inflate(R.layout.activity_layout3_8, (ViewGroup) findViewById(R.id.alert26));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout26);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count27() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout27 = inflater.inflate(R.layout.activity_layout3_9, (ViewGroup) findViewById(R.id.alert27));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout27);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }

    private void js_add_count28() {

        dialog = create_inputDialog();

        // Context 얻고, 해당 컨텍스트의 레이아웃 정보 얻기
        Context context = getApplicationContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        // 레이아웃 설정
        View layout28 = inflater.inflate(R.layout.activity_layout4_1, (ViewGroup) findViewById(R.id.alert28));

        // Input 소프트 키보드 보이기
        dialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);

        // AlertDialog에 레이아웃 추가
        dialog.setView(layout27);
//        popup_input = (EditText) layout.findViewById(R.id.toolEvent_popup_input);

        dialog.show();

    }
//endregion

}