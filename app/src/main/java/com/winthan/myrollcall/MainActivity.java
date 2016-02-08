package com.winthan.myrollcall;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private Button btnCalculate;
    private EditText etRollTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);
        btnCalculate = (Button)findViewById(R.id.btn_calculate);
        etRollTimes = (EditText)findViewById(R.id.et_roll_times);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(etRollTimes.getText().toString());
                if (a <= 140) {
                    a = (a / 140) * 100;
                    int ans = (int)a;
                    result.setText(String.valueOf("Your roll call is : " +ans + "%"));
                    result.setTextColor(Color.BLACK);
                    etRollTimes.setText("");
                }else{
                    result.setText("Invalid");
                    result.setTextColor(Color.RED);
                    etRollTimes.setText("");
                }

            }
        });

    }
}