package com.example.someth;


import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class calci extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText a,b;
        Button c,d,e,f,z;
        TextView g,h;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);

        a=findViewById(R.id.editTextTextPersonName3);
        b=findViewById(R.id.editTextTextPersonName4);

        c=findViewById(R.id.button4);
        d=findViewById(R.id.button5);
        e=findViewById(R.id.button6);
        f=findViewById(R.id.button7);
        z=findViewById(R.id.bh1);

        g=findViewById(R.id.textView6);
        h=findViewById(R.id.textView7);


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a1=Integer.parseInt(a.getText().toString());
                int a2=Integer.parseInt(b.getText().toString());

                int s=a1+a2;
                Toast.makeText(calci.this, "Sum is:"+s, Toast.LENGTH_LONG).show();
                g.setText("Answer :"+String.valueOf(s));

            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a1=Integer.parseInt(a.getText().toString());
                int a2=Integer.parseInt(b.getText().toString());

                int s=a1-a2;
                Toast.makeText(calci.this, "minus is:"+s, Toast.LENGTH_LONG).show();
                g.setText("Answer :"+String.valueOf(s));

            }
        });


        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a1=Integer.parseInt(a.getText().toString());
                int a2=Integer.parseInt(b.getText().toString());

                int s=a1*a2;
                Toast.makeText(calci.this, "multiply is:"+s, Toast.LENGTH_LONG).show();
                g.setText("Answer :"+String.valueOf(s));

            }
        });


        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a1=Integer.parseInt(a.getText().toString());
                int a2=Integer.parseInt(b.getText().toString());

                int s=a1/a2;
                Toast.makeText(calci.this, "div is:"+s, Toast.LENGTH_LONG).show();
                g.setText("Answer :"+String.valueOf(s));
                h.setText("THANK YOU FOR GUIDING US");

            }
        });

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aman=new Intent(calci.this , bhan.class);
                startActivity(aman);
            }
        });

    }
}