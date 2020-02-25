package com.example.mycounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2;
    private TextView text1;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1= (Button)findViewById(R.id.b1);
        button2=(Button)findViewById(R.id.b2);
        text1=(TextView)findViewById(R.id.t1);

        text1.setText(Integer.toString(count));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t= Toast.makeText(getApplicationContext(), "You have pressed Toast button", Toast.LENGTH_LONG);
                t.show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                text1.setText(Integer.toString(count));
            }
        });
    }
}
