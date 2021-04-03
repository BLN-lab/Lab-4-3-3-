package com.example.lab_43_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    Button btn;
    String[] users={"City-1","City-2","City-3","City-4","City-5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=findViewById(R.id.Spinner);
        btn=findViewById(R.id.Button);

        ArrayAdapter adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,users);
        sp.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("data",sp.getSelectedItemPosition());
                startActivity(i);
            }
        });
    }
}