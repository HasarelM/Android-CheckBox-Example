package com.sample.hasarel.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Ui Components
    private CheckBox mChkVan,mChkCar,mChkBus;
    private Button mBtnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        mChkBus = findViewById(R.id.main_activity_chk_check_box_bus);
        mChkCar = findViewById(R.id.main_activity_chk_check_box_car);
        mChkVan = findViewById(R.id.main_activity_chk_check_box_van);
        mBtnClick = findViewById(R.id.main_activity_btn_click);
        mBtnClick.setOnClickListener(this);
    }

    private void checkBoxResult(){

        StringBuilder result=new StringBuilder();
        result.append("Selected Items:");
        if(mChkVan.isChecked()){
            result.append("\nVan Clicked");
        }
        if(mChkCar.isChecked()){
            result.append("\nCar Clicked");
        }
        if(mChkBus.isChecked()){
            result.append("\nBus Clicked");
        }

        //Displaying the message on the toast
        Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_activity_btn_click:
                checkBoxResult();
                break;

        }
    }
}