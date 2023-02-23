package com.example.someth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ans4 extends AppCompatActivity {
    ToggleButton a,b;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans4);
        a=findViewById(R.id.toggleButton);
        b=findViewById(R.id.toggleButton2);
        btn=findViewById(R.id.button16);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ans4.this,"Toggle Button 1 is :"+a.getText().toString() +"\n Toggle Button 2:"+b.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });



    }
}