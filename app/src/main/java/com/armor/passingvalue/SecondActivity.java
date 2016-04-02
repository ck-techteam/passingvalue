package com.armor.passingvalue;

/**
 * Created by admin on 01-04-2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity {

    TextView tvView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        tvView = (TextView) findViewById(R.id.tvView);

        Intent intent = getIntent();

        String Uname = intent.getStringExtra("Uname");
        String Upwd = intent.getStringExtra("Pwd");

        tvView.setText("Your crediatils is: " + Uname + " " + Upwd);
    }
}
