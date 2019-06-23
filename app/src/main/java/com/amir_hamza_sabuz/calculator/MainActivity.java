package com.amir_hamza_sabuz.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1;
    EditText editText2;

    Button buttonAdd;
    Button buttonSub;

    TextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=findViewById(R.id.etNumber1) ;
        editText2=findViewById(R.id.etNumber2);

        buttonAdd=findViewById(R.id.btnAdd);
        buttonSub=findViewById(R.id.btnSub);

        textViewResult = findViewById(R.id.tvResult);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        try{
            String s1 = editText1.getText().toString();
            String s2= editText2.getText().toString();

            double number1 = Double.parseDouble(s1);
            double number2 = Double.parseDouble(s2);

            double sum = number1+number2;
            double sub = number1-number2;

            if(view.getId()==R.id.btnAdd)
            {
                textViewResult.setText("Result is " + sum);
            }
            if(view.getId()==R.id.btnSub)
            {
                textViewResult.setText("Result is "+ sub);
            }
        }
        catch(Exception e){
            Toast.makeText(MainActivity.this,"Please enter number",Toast.LENGTH_SHORT).show();
        }
    }
}
