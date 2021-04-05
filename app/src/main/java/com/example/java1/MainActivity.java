package com.example.java1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView1);
        getString(R.string.luck1);
        getString(R.string.luck2);
        getString(R.string.luck3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random name = new Random();

                int number= new java.util.Random().nextInt(3);


                if ( number==0) {
                    textView1.setText(getString(R.string.luck1));
                }else if(number==1){
                    textView1.setText(getString(R.string.luck2));
                }else if(number==2){
                    textView1.setText(getString(R.string.luck3));
                }
            }

        });



    }
}
