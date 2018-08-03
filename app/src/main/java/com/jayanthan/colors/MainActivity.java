package com.jayanthan.colors;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton RED = (RadioButton)findViewById(R.id.rb1);
        RadioButton GREEN = (RadioButton)findViewById(R.id.rb2);
        RadioButton LARGE = (RadioButton)findViewById(R.id.rb3);
        RadioButton SMALL = (RadioButton)findViewById(R.id.rb4);
        final View.OnClickListener colour = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TextView text = (TextView)findViewById(R.id.txtview);
                switch (view.getId()){
                    case R.id.rb1:
                        text.setTextColor(Color.RED);
                        break;
                    case R.id.rb2:
                        text.setTextColor(Color.GREEN);
                        break;
                    case R.id.rb3:
                        text.setTextSize(70);
                        break;
                    case R.id.rb4:
                        text.setTextSize(25);
                        break;
                }
            }
        };
        RED.setOnClickListener(colour);
        GREEN.setOnClickListener(colour);
        LARGE.setOnClickListener(colour);
        SMALL.setOnClickListener(colour);
    }
}