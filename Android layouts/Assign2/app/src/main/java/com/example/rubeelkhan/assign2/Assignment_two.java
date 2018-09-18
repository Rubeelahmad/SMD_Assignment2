package com.example.rubeelkhan.assign2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Assignment_two extends AppCompatActivity {

    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_two);
        button1=(Button)findViewById(R.id.button1); //This Button is for Relative Layout
        button1.setOnClickListener(new View.OnClickListener() {
         //   @Override

            public void onClick(View v) {

               OpenMyActivity_1();

            }
        });
        button2=(Button)findViewById(R.id.button2); //This Button is for Constraint Layout
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenMyActivity_2();
            }
        });
    }

    public void OpenMyActivity_1(){

    Intent in =new Intent(this, relative_java.class);
    startActivity(in);
    }

    public void OpenMyActivity_2(){

        Intent in =new Intent(this, constraint_java.class);
        startActivity(in);
    }

}
