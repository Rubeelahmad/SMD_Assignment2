package com.example.rubeelkhan.assign2;


import android.app.Notification;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class constraint_java extends AppCompatActivity  {

    Button button2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
        button2 = (Button) findViewById(R.id.SignUp);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                RadioGroup radio = (RadioGroup) findViewById(R.id.Radiogroup1);
                int RadioButoonId = -1;
                RadioButoonId = radio.getCheckedRadioButtonId();
                // find the radiobutton by returned id
                RadioButton radioButton = (RadioButton) findViewById(RadioButoonId);
                CheckBox check = (CheckBox) findViewById(R.id.Checkbox);
                EditText name = (EditText)  findViewById(R.id.EiditTxtview1);
                EditText password = (EditText)  findViewById(R.id.EiditTxtview2);
                String str = name.getText().toString();
                String str2 = password.getText().toString();
                if (check.isChecked())
                {
                    if (str.isEmpty())
                        Toast.makeText(getApplicationContext(),
                                "Enter email " ,
                                Toast.LENGTH_SHORT).show();
                    else if (str2.isEmpty())
                        Toast.makeText(getApplicationContext(),
                                "Enter password " ,
                                Toast.LENGTH_SHORT).show();
                    else if (RadioButoonId == -1)
                        Toast.makeText(getApplicationContext(),
                                "Select gender " ,
                                Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(getApplicationContext(),
                                "Email: " + str + '\n'
                                        + "Password: " + str2 + '\n'
                                        + "Gender: " + radioButton.getText() ,
                                Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),
                            "Accept the terms and conditions." ,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}

