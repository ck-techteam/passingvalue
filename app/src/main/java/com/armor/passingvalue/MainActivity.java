package com.armor.passingvalue;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    EditText edtUname;
    EditText edtpwd;

    Button btnSubmit;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        edtUname= (EditText) findViewById(R.id.edtUname);
        edtpwd= (EditText) findViewById(R.id.edtpwd);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Uname", edtUname.getText().toString());
                intent.putExtra("Pwd", edtpwd.getText().toString());
                startActivity(intent);

            }
        });
    }
}
