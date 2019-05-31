package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button plus;
    private Button min;
    private Button mul;
    private Button div;
    private Button zero;
    private Button clear;
    private Button equal;
    private TextView Hasil;
    private TextView Control;

   private final char ADDISION='+';
    private final char MINUS='-';
    private final char MULTIPLY='*';
    private final char DIVISION='/';
    private final char EQU = '=';

    private double val1=Double.NaN;
    private double val2;

    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrintUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Control.setText(Control.getText().toString()+"0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Control.setText(Control.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Control.setText(Control.getText().toString()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Control.setText(Control.getText().toString()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Control.setText(Control.getText().toString()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Control.setText(Control.getText().toString()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Control.setText(Control.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Control.setText(Control.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Control.setText(Control.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Control.setText(Control.getText().toString()+"9");
            }
        });


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION=ADDISION;
                Hasil.setText(String.valueOf(val1)+"+");
                Control.setText(null);
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION=MINUS;
                Hasil.setText(String.valueOf(val1)+"-");
                Control.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION=MULTIPLY;
                Hasil.setText(String.valueOf(val1)+"*");
                Control.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                ACTION=DIVISION;
                Hasil.setText(String.valueOf(val1)+"/");
                Control.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                Hasil.setText(String.valueOf(val1));
                Control.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(Control.getText().length()>0)
                {
                    CharSequence name= Control.getText().toString();
                    Control.setText(name.subSequence(0,name.length()-1));
                }
                else{
                    val1=Double.NaN;
                    val2=Double.NaN;
                    Control.setText(null);
                    Hasil.setText(null);
                }
            }
        });
    }

    private void PrintUIViews(){

        one = (Button) findViewById(R.id.btn1);
        two = (Button) findViewById(R.id.btn2);
        three = (Button) findViewById(R.id.btn3);
        four = (Button) findViewById(R.id.btn4);
        five= (Button) findViewById(R.id.btn5);
        six= (Button) findViewById(R.id.btn6);
        seven= (Button) findViewById(R.id.btn7);
        eight= (Button) findViewById(R.id.btn8);
        nine= (Button) findViewById(R.id.btn9);
        zero= (Button) findViewById(R.id.btn0);
        plus= (Button) findViewById(R.id.btnplus);
        min= (Button) findViewById(R.id.btnmin);
        mul= (Button) findViewById(R.id.btnmul);
        div= (Button) findViewById(R.id.btndiv);
        equal=(Button)findViewById(R.id.btnequal);
        clear=(Button)findViewById(R.id.btnclear);
        Control= (TextView) findViewById(R.id.tvcontrol);
        Hasil= (TextView) findViewById(R.id.tvhasil);


    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(Control.getText().toString());

            switch (ACTION)
            {
                case ADDISION: val1 = val1 + val2; break;
                case MINUS: val1 = val1 - val2; break;
                case MULTIPLY: val1 = val1 * val2; break;
                case DIVISION: val1 = val1 / val2; break;
                case EQU: val1 = val1; break;
            }
        }
        else
        {
            val1 = Double.parseDouble(Control.getText().toString());
        }
    }


}
