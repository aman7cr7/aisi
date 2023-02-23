package com.example.someth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ans3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ans3);

    }

    public void radioButtonClicked(View view){
        boolean checked=((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.radioButton8:
                if(checked){
                    Toast.makeText(this, "You choosed 1st option", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.radioButton9:
                Toast.makeText(this, "You choosed 2nd option", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton10:
                Toast.makeText(this, "You choosed 3rd option", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton11:
                Toast.makeText(this, "You choosed 4th option", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}