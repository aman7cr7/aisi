package com.example.someth;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class partone extends AppCompatActivity {
    private Button btn;
    public int sa=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partone);
        btn=findViewById(R.id.button10);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //int n=200;
                Toast.makeText(partone.this, "this is my toast :"+ sa +" ", Toast.LENGTH_LONG).show();
                sa++;
            }
        });
    }
}