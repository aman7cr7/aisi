package com.example.someth;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class partTwo extends AppCompatActivity {

private Button button;

public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_two);

        button = (Button) findViewById(R.id.button19);

        button.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View arg0) {

        // get your custom_toast.xml ayout
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(R.layout.layout,
        (ViewGroup) findViewById(R.id.custom_toast_layout_id));

    // set a dummy image
        ImageView image = (ImageView) layout.findViewById(R.id.image);
        image.setImageResource(R.drawable.ic_launcher_background);

    // set a message
       TextView text = (TextView) layout.findViewById(R.id.text);
       text.setText("Button is clicked!");

    // Toast...
    Toast toast = new Toast(getApplicationContext());
    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
    toast.setDuration(Toast.LENGTH_LONG);
    toast.setView(layout);
    toast.show();
   // Toast.makeText(partTwo.this, "kkigytt", Toast.LENGTH_SHORT).show();
}
        });
}
}