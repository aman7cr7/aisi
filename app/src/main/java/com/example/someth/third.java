package com.example.someth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class third extends AppCompatActivity {
    RadioButton a,b,c;
    TextView d;
    Switch e;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        a=findViewById(R.id.rb);
        b=findViewById(R.id.rb2);
        c=findViewById(R.id.rb3);
        d=findViewById(R.id.textView9);
        e=findViewById(R.id.switch1);
        Objects.requireNonNull(getSupportActionBar()).setTitle("LIGHT-NIGHT MODE SWITCH");

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(third.this, "Package", Toast.LENGTH_SHORT).show();
                d.setText("Answer: Package");
            }
        });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(third.this, "Faculties", Toast.LENGTH_SHORT).show();
                d.setText("Answer: Faculty");
            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(third.this, "Assignment", Toast.LENGTH_SHORT).show();
                d.setText("Answer: Assignment");
            }
        });

        e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });


    }
}