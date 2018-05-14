package com.example.lironsegev.liron164;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView answerr;
    Button ret;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        answerr=(TextView)findViewById(R.id.textView);
        ret=(Button)findViewById(R.id.result);
        answerr.setText("The last result is"+getIntent().getExtras().getString("result"));
    }

    public void returnb(View view) {
        Intent t=new Intent(this, MainActivity.class);
        startActivity(t);
        Toast.makeText(this, "Im the queen", Toast.LENGTH_LONG).show();
    }

}





