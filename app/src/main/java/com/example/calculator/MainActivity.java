package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnClear, btnNum1, btnNum2, btnNum3, btnNum4, btnNum5, btnNum6, btnNum7, btnNum8, btnNum9, btnNum0, btnAdd, btnSub, btnMul, btnDiv, btnEqual;
    private TextView txtMainContainer;
    float ans, firstnum, secondnum;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNum0=findViewById(R.id.num0);
        btnNum1=findViewById(R.id.num1);
        btnNum2=findViewById(R.id.num2);
        btnNum3=findViewById(R.id.num3);
        btnNum4=findViewById(R.id.num4);
        btnNum5=findViewById(R.id.num5);
        btnNum6=findViewById(R.id.num6);
        btnNum7=findViewById(R.id.num7);
        btnNum8=findViewById(R.id.num8);
        btnNum9=findViewById(R.id.num9);
        btnNum0=findViewById(R.id.num0);
        btnAdd=findViewById(R.id.actionPlus);
        btnSub=findViewById(R.id.actionSub);
        btnMul=findViewById(R.id.actionMultiply);
        btnDiv=findViewById(R.id.actionDiv);
        btnEqual=findViewById(R.id.actionEqual);
        txtMainContainer=findViewById(R.id.MainContainer);
        btnClear=findViewById(R.id.btnClear);

        btnNum0.setOnClickListener(new btnNum0());
        btnNum1.setOnClickListener(new btnNum1());
        btnNum2.setOnClickListener(new btnNum2());
        btnNum3.setOnClickListener(new btnNum3());
        btnNum4.setOnClickListener(new btnNum4());
        btnNum5.setOnClickListener(new btnNum5());
        btnNum6.setOnClickListener(new btnNum6());
        btnNum7.setOnClickListener(new btnNum7());
        btnNum8.setOnClickListener(new btnNum8());
        btnNum9.setOnClickListener(new btnNum9());
        btnClear.setOnClickListener(new btnClear());
        btnAdd.setOnClickListener(new btnAdd());
        btnEqual.setOnClickListener(new btnEqual());
        btnSub.setOnClickListener(new btnSub());
        btnMul.setOnClickListener(new btnMul());
        btnDiv.setOnClickListener(new btnDiv());

    }



    private class btnClear implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            txtMainContainer.setText("00.00");
        }
    }

    private class btnNum0 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(txtMainContainer.getText()=="00.00") {
                txtMainContainer.setText("0");
            }
            else {
                txtMainContainer.setText(txtMainContainer.getText() + "0");
            }
        }
    }

    private class btnNum1 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(txtMainContainer.getText()=="00.00"){
                txtMainContainer.setText("1");
            }
            else {
                txtMainContainer.setText(txtMainContainer.getText() + "1");
            }
        }
    }

    private class btnNum2 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(txtMainContainer.getText()=="00.00"){
                txtMainContainer.setText("2");
            }
            else {
                txtMainContainer.setText(txtMainContainer.getText() + "2");
            }
        }
    }

    private class btnNum3 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(txtMainContainer.getText()=="00.00"){
                txtMainContainer.setText("3");
            }
            else {
                txtMainContainer.setText(txtMainContainer.getText() + "3");
            }
        }
    }

    private class btnNum4 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(txtMainContainer.getText()=="00.00"){
                txtMainContainer.setText("4");
            }
            else {
                txtMainContainer.setText(txtMainContainer.getText() + "4");
            }
        }
    }

    private class btnNum5 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(txtMainContainer.getText()=="00.00"){
                txtMainContainer.setText("5");
            }
            else {
                txtMainContainer.setText(txtMainContainer.getText() + "5");
            }
        }
    }

    private class btnNum6 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(txtMainContainer.getText()=="00.00"){
                txtMainContainer.setText("6");
            }
            else {
                txtMainContainer.setText(txtMainContainer.getText() + "6");
            }
        }
    }

    private class btnNum7 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(txtMainContainer.getText()=="00.00"){
                txtMainContainer.setText("7");
            }
            else {
                txtMainContainer.setText(txtMainContainer.getText() + "7");
            }
        }
    }

    private class btnNum8 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(txtMainContainer.getText()=="00.00"){
                txtMainContainer.setText("8");
            }
            else {
                txtMainContainer.setText(txtMainContainer.getText() + "8");
            }
        }
    }

    private class btnNum9 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(txtMainContainer.getText()=="00.00"){
                txtMainContainer.setText("9");
            }
            else {
                txtMainContainer.setText(txtMainContainer.getText() + "9");
            }
        }
    }

    private class btnAdd implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            firstnum=Float.parseFloat(txtMainContainer.getText()+"");
            txtMainContainer.setText("");
            add=true;
        }
    }

    private class btnSub implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            firstnum=Float.parseFloat(txtMainContainer.getText()+"");
            txtMainContainer.setText("");
            sub=true;
        }
    }

    private class btnMul implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            firstnum=Float.parseFloat(txtMainContainer.getText()+"");
            txtMainContainer.setText("");
            mul=true;
        }
    }

    private class btnDiv implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            firstnum=Float.parseFloat(txtMainContainer.getText()+"");
            txtMainContainer.setText("");
            div=true;
        }
    }

    private class btnEqual implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(add==true) {
                secondnum = Float.parseFloat(txtMainContainer.getText() + "");
                ans = firstnum + secondnum;
                txtMainContainer.setText(ans + "");
                add=false;
            }

            if(sub==true){
                secondnum = Float.parseFloat(txtMainContainer.getText() + "");
                ans = firstnum - secondnum;
                txtMainContainer.setText(ans + "");
                sub=false;
            }

            if(mul==true){
                secondnum = Float.parseFloat(txtMainContainer.getText() + "");
                ans = firstnum * secondnum;
                txtMainContainer.setText(ans + "");
                mul=false;
            }

            if(div==true){
                secondnum = Float.parseFloat(txtMainContainer.getText() + "");
                ans = firstnum / secondnum;
                txtMainContainer.setText(ans + "");
                div=false;
            }
        }
    }
}