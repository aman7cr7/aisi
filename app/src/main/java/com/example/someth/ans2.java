package com.example.someth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class ans2 extends AppCompatActivity {
    RadioButton a,b,c;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans2);

        a=findViewById(R.id.radioButton5);
        b=findViewById(R.id.radioButton6);
        c=findViewById(R.id.radioButton7);

        btn=findViewById(R.id.button15);




    }
}