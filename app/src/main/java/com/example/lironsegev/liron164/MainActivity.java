package com.example.lironsegev.liron164;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button btnp, btnm, btnke, btnhi, btnac, btnsh, btncre;
    EditText et;
    double num, num2=0, b;
    int op=1;
    String str, bac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnp=(Button) findViewById(R.id.button5);
        btnm= (Button) findViewById(R.id.button6);
        btnke=(Button) findViewById(R.id.button7);
        btnhi=(Button) findViewById(R.id.button8);
        btnac=(Button) findViewById(R.id.button11);
        btnsh=(Button) findViewById(R.id.button12);
        btncre=(Button) findViewById(R.id.button) ;
        et=(EditText) findViewById(R.id.editText2);
    }



    public void et(View view) {
    }

    public void btnp(View view) {
        if ((!et.getText().toString().equals(""))&&((!et.getText().toString().equals("."))&&(!et.getText().toString().equals("-"))&&(!et.getText().toString().equals("-.")))) {
            String dp = et.getText().toString();
            num2 = Double.parseDouble(dp);
            et.setText("");
            switch (op) {
                case 1:
                    num = num + num2;
                    break;
                case 2:
                  num = num - num2;
                    break;
                case 3:
                    num = num *num2;
                    break;
                case 4:
                    if (num2 == 0)
                        Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                    num = num / num2;
                    break;
            }
            str = Double.toString(num);
            et.setHint(str);
        }
        else {
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 1;
    }


    public void btnm(View view) {
        if
                ((!et.getText().toString().equals(""))&&((!et.getText().toString().equals("."))&&(!et.getText().toString().equals("-"))&&(!et.getText().toString().equals("-.")))) {
                String dp = et.getText().toString();
                 num2 = Double.parseDouble(dp);
                  et.setText("");
                   switch (op) {
                          case 1:
                              num = num +  num2;
                               break;
                         case 2:
                             num = num -  num2;
                             break;
                         case 3:
                             num = num * num2;
                             break;
                         case 4:
                               if (num2 == 0)
                                Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                                 num = num /  num2;
                                break;
            }
                    str = Double.toString(num);
                    et.setHint(str);
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 2;
    }

    public void btnke(View view) {
        if ((!et.getText().toString().equals(""))&&((!et.getText().toString().equals("."))&&(!et.getText().toString().equals("-"))&&(!et.getText().toString().equals("-.")))) {
            String dp = et.getText().toString();
            num2= Double.parseDouble(dp);
            et.setText("");
            switch (op) {
                case 1:
                    num = num + num2;
                    break;
                case 2:
                    num = num - num2;
                    break;
                case 3:
                    num = num * num2;
                    break;
                case 4:
                    if (num2 == 0)
                        Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                    num = num / num2;
                    break;
            }
            str = Double.toString(num);
            et.setHint(str);
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 3;
    }

    public void btnhi(View view) {
        if
                ((!et.getText().toString().equals(""))&&((!et.getText().toString().equals("."))&&(!et.getText().toString().equals("-"))&&(!et.getText().toString().equals("-.")))) {
            String dp = et.getText().toString();
            num2= Double.parseDouble(dp);
            et.setText("");
            switch (op) {
                case 1:
                    num = num + num2;
                    break;
                case 2:
                    num = num - num2;
                    break;
                case 3:
                    num = num * num2;
                    break;
                case 4:
                    if (num2 == 0)
                        Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                    num = num / num2;
                    break;
            }
            str = Double.toString(num);
            et.setHint(str);
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        op = 3;
    }

    public void btnac(View view) {
        et.setText("");
        et.setHint("display");
        num=0;
        num2=0;
        op=0;
    }

    public void btnsh(View view) {
        if
                ((!et.getText().toString().equals(""))&&((!et.getText().toString().equals("."))&&(!et.getText().toString().equals("-"))&&(!et.getText().toString().equals("-.")))) {
            String dp = et.getText().toString();
            num = Double.parseDouble(dp);
            et.setText("");
            switch (op) {
                case 1:
                    num = num + num2;
                    break;
                case 2:
                    num = num - num2;
                    break;
                case 3:
                    num = num * num2;
                    break;
                case 4:
                    if (num2 == 0)
                        Toast.makeText(this, "error (0)", Toast.LENGTH_SHORT).show();
                    num = num / num2;
                    break;
            }
            str = Double.toString(num);
            et.setHint(str);
        }
        else{
            Toast.makeText(this, "Input is unavailable", Toast.LENGTH_SHORT).show();
        }
        b=num;
        op=1; num2=num=0;
    }

    public void btncre(View view) {
            Intent t=new Intent(this, SecondActivity.class);
            if (num==0){
                str=Double.toString(b);
                t.putExtra("str", str);
            }
            else{
                str=Double.toString(num);
                t.putExtra("str", str);
            }
            startActivityForResult(t,1);
        }
        public void onActivityResult (int a, int b ,Intent c){
            bac=c.getStringExtra("re");
            et.setText("The last result is "+bac);
        }

    }


