package com.example.someth;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class ans1 extends AppCompatActivity {
    CheckBox a,b,c;
    Button d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans1);

        a=findViewById(R.id.checkBox2);
        b=findViewById(R.id.checkBox3);
        c=findViewById(R.id.checkBox4);

        d=findViewById(R.id.button12);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amt=0;
                StringBuilder result=new StringBuilder();
                result.append("selected items");
                if(a.isChecked()){
                    result.append("\n Rs 100--> PIZZA");
                    amt+=100;
                }
                if(b.isChecked()){
                    result.append("\n Rs 20--> BURGER");
                    amt+=20;
                }
                if(c.isChecked()){
                    result.append("\n Rs 30-->SANDWICH");
                    amt+=30;
                }


                result.append("\n Total amount is :Rs"+amt);
                Toast.makeText(ans1.this, result.toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}