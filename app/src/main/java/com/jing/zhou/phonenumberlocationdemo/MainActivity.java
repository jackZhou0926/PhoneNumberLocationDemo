package com.jing.zhou.phonenumberlocationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

/**
 * @author zhou
 */
public class MainActivity extends AppCompatActivity {

    private TextView query;
    //http://www.mofada.cn/Utils/guishudi.php?query=155****0471
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText inputPhoneNum =  (EditText) findViewById(R.id.activity_main_input_et);
        TextView locationOperator = (TextView) findViewById(R.id.activity_main_location_operator_tv);
        TextView operator = (TextView) findViewById(R.id.activity_main_operator_tv);
        TextView phoneNum = (TextView) findViewById(R.id.activity_main_phone_num_tv);
        TextView province = (TextView) findViewById(R.id.activity_main_province_tv);
        query = (TextView) findViewById(R.id.activity_main_query_tv);
    }


}
