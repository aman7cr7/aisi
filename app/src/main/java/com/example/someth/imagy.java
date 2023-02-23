package com.example.someth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class imagy extends AppCompatActivity {
    ImageButton a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagy);


        a=findViewById(R.id.i1);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(imagy.this, "Upload the image", Toast.LENGTH_SHORT).show();
            }
        });
    }
}