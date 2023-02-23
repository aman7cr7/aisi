package com.example.someth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a;
    EditText b;
    Button s;
    Button minus;
    Button mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.editTextTextPersonName);
        b=findViewById(R.id.editTextTextPersonName2);
        s=findViewById(R.id.button);
        minus=findViewById(R.id.button2);
        mul=findViewById(R.id.button3);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(a.getText().toString());
                int v2 = Integer.parseInt(b.getText().toString());

                int s = v1 + v2;
                Toast.makeText(MainActivity.this, "The sum is : "+s, Toast.LENGTH_LONG).show();
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(a.getText().toString());
                int v2 = Integer.parseInt(b.getText().toString());

                int minus = v1 - v2;
                Toast.makeText(MainActivity.this, "The subtraction is : "+minus, Toast.LENGTH_SHORT).show();
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(a.getText().toString());
                int v2 = Integer.parseInt(b.getText().toString());

                int mul = v1 * v2;

                Toast.makeText(MainActivity.this, "Multiplication of two no is : "+mul, Toast.LENGTH_SHORT).show();
            }
        });
    }
}