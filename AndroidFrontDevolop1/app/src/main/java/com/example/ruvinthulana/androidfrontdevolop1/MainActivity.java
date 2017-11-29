package com.example.ruvinthulana.androidfrontdevolop1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
     Button btn;
    ToggleButton tbn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);
        tbn=(ToggleButton) findViewById(R.id.toggleButton);

        tbn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                           @Override
                                           public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                                               if(isChecked){

                                                   Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();

                                               }else{

                                                   Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                                               }
                                           }
                                       }


        );


        btn.setOnClickListener(new View.OnClickListener(){

            @Override
          public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "android", Toast.LENGTH_LONG).show();
            }
        });
    }




}
