package com.example.rasel.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button3,button4,button5,
            button6,button7,button8,button9,button0,
            buttonAdd,buttonSub,buttonMul,buttonDiv,buttonDot,
            buttonEqual,buttonClear;

    TextView answer;
    double value1,value2;
    boolean add,sub,mul,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);

        buttonDot = findViewById(R.id.buttonDot);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonClear = findViewById(R.id.buttonClear);

        answer = findViewById(R.id.answer);


//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+"1");
//            }
//        });
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+"2");
//            }
//        });
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+"3");
//            }
//        });
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+"4");
//            }
//        });
//        button5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+"5");
//            }
//        });
//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+"6");
//            }
//        });
//        button7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+"7");
//            }
//        });
//        button8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+"8");
//            }
//        });
//        button9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+"9");
//            }
//        });
//        button0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+"0");
//            }
//        });
//        buttonDot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(answer.getText()+".");
//            }
//        });
//        buttonAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                value1 = Double.parseDouble(answer.getText()+"");
//                add=true;
//                answer.setText(null);
//            }
//        });
//        buttonSub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                value1 = Double.parseDouble(answer.getText()+"");
//                sub=true;
//                answer.setText(null);
//            }
//        });
//        buttonMul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                value1 = Double.parseDouble(answer.getText()+"");
//                mul=true;
//                answer.setText(null);
//            }
//        });
//        buttonDiv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                value1 = Double.parseDouble(answer.getText()+"");
//                div=true;
//                answer.setText(null);
//            }
//        });
//        buttonEqual.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                value2 = Double.parseDouble(answer.getText()+"");
//                if (add==true){
//                    answer.setText(value1+value2+"");
//                    add=false;
//                }
//                if (sub==true){
//                    answer.setText(value1-value2+"");
//                    sub=false;
//                }
//                if (mul==true){
//                    answer.setText(value1*value2+"");
//                    mul=false;
//                }
//                if (div==true){
//                    answer.setText(value1/value2+"");
//                    div=false;
//                }
//            }
//        });
//        buttonClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                answer.setText(null);
//            }
//        });

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);

        buttonDot.setOnClickListener(this);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        if (view == button1){
            answer.setText(answer.getText()+"1");
        }
        if (view == button2){
            answer.setText(answer.getText()+"2");
        }
        if (view == button3){
            answer.setText(answer.getText()+"3");
        }
        if (view == button4){
            answer.setText(answer.getText()+"4");
        }
        if (view == button5){
            answer.setText(answer.getText()+"5");
        }
        if (view == button6){
            answer.setText(answer.getText()+"6");
        }
        if (view == button7){
            answer.setText(answer.getText()+"7");
        }
        if (view == button8){
            answer.setText(answer.getText()+"8");
        }
        if (view == button9){
            answer.setText(answer.getText()+"9");
        }
        if (view == button0){
            answer.setText(answer.getText()+"0");
        }

        if (view == buttonDot){
            answer.setText(answer.getText()+".");
        }
        if (view == buttonAdd){
            value1 = Double.parseDouble(answer.getText()+"");
            add=true;
            answer.setText(null);
        }
        if (view == buttonSub){
            value1 = Double.parseDouble(answer.getText()+"");
            sub=true;
            answer.setText(null);
        }
        if (view == buttonMul){
            value1 = Double.parseDouble(answer.getText()+"");
            mul=true;
            answer.setText(null);
        }
        if (view == buttonDiv){
            value1 = Double.parseDouble(answer.getText()+"");
            div=true;
            answer.setText(null);
        }
        if (view == buttonClear){
            answer.setText(null);
        }

        if (view == buttonEqual){
            value2 = Double.parseDouble(answer.getText()+"");
            if (add){
                answer.setText(value1+value2+"");
                add=false;
            }
            if (sub){
                answer.setText(value1-value2+"");
                sub=false;
            }
            if (mul){
                answer.setText(value1*value2+"");
                mul=false;
            }
            if (div){
                answer.setText(value1/value2+"");
                div=false;
            }
        }








    }
}
