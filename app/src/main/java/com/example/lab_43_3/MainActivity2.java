package com.example.lab_43_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txt;
    ImageView imgV;
    int i[]={R.drawable.ct1,R.drawable.ct2,R.drawable.ct3,R.drawable.ct4,R.drawable.ct5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt=findViewById(R.id.text);
        imgV=findViewById(R.id.img);
        Bundle b=getIntent().getExtras();
        int n=b.getInt("data");
        imgV.setImageResource(i[n]);
    }
}