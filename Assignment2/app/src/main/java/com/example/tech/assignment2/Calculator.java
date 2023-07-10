package com.example.tech.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity implements View.OnClickListener{

    Button Addbtn, Subbtn, Mulbtn, Divbtn;
    EditText editTextN1, editTextN2;
    TextView textView;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Addbtn =(Button)findViewById(R.id.btnAdd);
        Subbtn =(Button)findViewById(R.id.btnSub);
        Mulbtn =(Button)findViewById(R.id.btnMul);
        Divbtn =(Button)findViewById(R.id.btnDiv);
        editTextN1=(EditText)findViewById(R.id.num1);
        editTextN2=(EditText)findViewById(R.id.num2);
        textView=(TextView)findViewById(R.id.answer);

        Addbtn.setOnClickListener(this);
        Subbtn.setOnClickListener(this);
        Mulbtn.setOnClickListener(this);
        Divbtn.setOnClickListener(this);

    }

    public int getIntFromEditText(EditText editText){
        if (editText.getText().toString().equals("")){
            Toast.makeText(Calculator.this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        } else
            return Integer.parseInt(editText.getText().toString());
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editTextN1);
        num2 = getIntFromEditText(editTextN2);
        switch (view.getId()){
            case R.id.btnAdd:
                textView.setText("Answer = " + (num1 + num2));
                break;

            case R.id.btnSub:
                textView.setText("Answer = " + (num1 - num2));
                break;

            case R.id.btnMul:
                textView.setText("Answer = " + (num1 * num2));
                break;

            case R.id.btnDiv:
                textView.setText("Answer = " + ((float)num1 / (float)num2));
                break;
        }


    }
}
