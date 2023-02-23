package com.example.someth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class practice extends AppCompatActivity {
    EditText a,b;
    TextView c;
    Button d,e,f,g , h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        a=findViewById(R.id.editTextTextPersonName7);
        b=findViewById(R.id.editTextTextPersonName8);
        c=findViewById(R.id.textView14);
        d=findViewById(R.id.b1);
        e=findViewById(R.id.b2);
        f=findViewById(R.id.b3);
        g=findViewById(R.id.b4);
        h=findViewById(R.id.b5);



        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a1=Integer.parseInt(a.getText().toString());
                int a2=Integer.parseInt(b.getText().toString());
                int s=a1+a2;
                Toast.makeText(practice.this, "Sum is "+s, Toast.LENGTH_LONG).show();
                c.setText(String.valueOf(s));
            }
        });


        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a1=Integer.parseInt(a.getText().toString());
                int a2=Integer.parseInt(b.getText().toString());
                int s=a1-a2;
                Toast.makeText(practice.this, "Subtraction is "+s, Toast.LENGTH_LONG).show();
                c.setText(String.valueOf(s));
            }
        });



        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a1=Integer.parseInt(a.getText().toString());
                int a2=Integer.parseInt(b.getText().toString());
                int s=a1*a2;
                Toast.makeText(practice.this, "Multiplication is "+s, Toast.LENGTH_LONG).show();
                c.setText(String.valueOf(s));
            }
        });


        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a1=Integer.parseInt(a.getText().toString());
                int a2=Integer.parseInt(b.getText().toString());
                int s=a1/a2;
                Toast.makeText(practice.this, "Division is "+s, Toast.LENGTH_LONG).show();
                c.setText(String.valueOf(s));
            }
        });



    }
}