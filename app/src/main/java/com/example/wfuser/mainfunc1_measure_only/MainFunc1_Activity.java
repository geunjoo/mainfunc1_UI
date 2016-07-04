package com.example.wfuser.mainfunc1_measure_only;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.os.CountDownTimer;
import android.widget.TextView;


public class MainFunc1_Activity extends AppCompatActivity {

    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainfunc1);

        Spinner spinner = (Spinner) findViewById(R.id.measure_unit_select);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.measure_units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        text1 = (TextView)findViewById(R.id.textView1);
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
                text1.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                text1.setText("Timer done!");
            }
        }.start();


    }
}
