package com.example.anandpratap.calculator;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Button Add,sub,mul,div;
    private EditText et1,et2,et3;




    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Add=(Button)findViewById(R.id.btnadd);
        sub=(Button)findViewById(R.id.btnsub);
        mul=(Button)findViewById(R.id.btnmul);
        div=(Button)findViewById(R.id.btndiv);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        et3=(EditText) findViewById(R.id.et3);


        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("")|| et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"plz enter details",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    Float a1=Float.valueOf(et1.getText().toString());
                    Float a2=Float.valueOf(et2.getText().toString());
                    Float a3;
                    a3=a1+a2;
                    et3.setText(String.valueOf(a3));
                    //dsjfkf
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("")|| et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"plz enter details",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    Float a1=Float.valueOf(et1.getText().toString());
                    Float a2=Float.valueOf(et2.getText().toString());
                    Float a3;
                    a3=a1-a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("")|| et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"plz enter details",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    Float a1=Float.valueOf(et1.getText().toString());
                    Float a2=Float.valueOf(et2.getText().toString());
                    Float a3;
                    a3=a1*a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("")|| et2.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"plz enter details",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    et1.getText().toString();
                    et2.getText().toString();
                    Float a1=Float.valueOf(et1.getText().toString());
                    Float a2=Float.valueOf(et2.getText().toString());
                    Float a3;
                    a3=a1/a2;
                    et3.setText(String.valueOf(a3));
                }
            }
        });

    }
}
