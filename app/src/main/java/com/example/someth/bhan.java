package com.example.someth;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class bhan extends AppCompatActivity {
   RadioButton a,b,c,d;
   Button e;
   RadioGroup grp;
   TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhan);

        a=findViewById(R.id.radioButton);
        b=findViewById(R.id.radioButton2);
        c=findViewById(R.id.radioButton3);
        d=findViewById(R.id.radioButton4);

        e=findViewById(R.id.button9);

        grp=findViewById(R.id.aman);


        grp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.radioButton){
                    Toast.makeText(bhan.this, "aman", Toast.LENGTH_SHORT).show();
                }
                else if(i==R.id.radioButton2){
                    Toast.makeText(bhan.this, "Vaibhav", Toast.LENGTH_SHORT).show();
                }
                else if(i==R.id.radioButton3){
                    Toast.makeText(bhan.this, "katiyar", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(bhan.this, "Ansh", Toast.LENGTH_SHORT).show();
                }

                Intent aman=new Intent(bhan.this , calci.class);
                startActivity(aman);

            }
        });


//        txt=findViewById(R.id.textView16);



//
//        e.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int selectedId= grp.getCheckedRadioButtonId();
//                if(selectedId==a.getId()){
//                    txt.setText("You choosed Aman");
//                }
//                else if(selectedId==b.getId()){
//                    txt.setText("You choosed Vaibhav");
//                }
//
//                else if(selectedId==c.getId()){
//                    txt.setText("You choosed Katiyar");
//                }
//
//                else {
//                    txt.setText("You choosed Ansh");
//                }
//            }
//        });






    }
}