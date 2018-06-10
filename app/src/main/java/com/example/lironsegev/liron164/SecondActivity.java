package com.example.lironsegev.liron164;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView answer;
    Button ret;
    Intent back;
    String str, str2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        answer=(TextView)findViewById(R.id.textView);
        ret=(Button)findViewById(R.id.result);
        back=getIntent();
        str=back.getStringExtra("str");
        answer.setText("The last result is "+str);
        //   back.putExtra("ret", str);
        //   setResult(RESULT_OK, back);
        // finish();
    }
    public void onActivityResult (int rqCode, Intent data_back){
        if (data_back!=null){
            str2 =data_back.getStringExtra("re");
        }

    }
    public void returnb(View view) {
        back.putExtra("re", str);
        setResult(RESULT_OK, back);
        finish();
        Toast.makeText(this, "Im the queen", Toast.LENGTH_LONG).show();
    }

}





