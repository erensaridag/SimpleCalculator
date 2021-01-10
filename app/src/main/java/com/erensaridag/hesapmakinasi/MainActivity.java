package com.erensaridag.hesapmakinasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1_txt;
    EditText number2_txt;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number1_txt = findViewById(R.id.number1_txt);
        number2_txt = findViewById(R.id.number2_txt);
        resultText = findViewById(R.id.resultText);

    }

    public void toplama(View view) {

        if (number1_txt.getText().toString().matches("") || number2_txt.getText().toString().matches("")) {

            resultText.setText("Enter Number !");

        } else {
            int number1 = Integer.parseInt(number1_txt.getText().toString());
            int number2 = Integer.parseInt(number2_txt.getText().toString());
            int result = number1 + number2;
            resultText.setText("RESULT : " + result);

        }


    }

    public void cikarma(View view) {
        if (number1_txt.getText().toString().matches("") || number2_txt.getText().toString().matches("")) {

            resultText.setText("Enter Number !");

        } else {
            int number1 = Integer.parseInt(number1_txt.getText().toString());
            int number2 = Integer.parseInt(number2_txt.getText().toString());
            int result = number1 - number2;
            resultText.setText("RESULT : " + result);

        }

    }

    public void carpma(View view) {
        if (number1_txt.getText().toString().matches("") || number2_txt.getText().toString().matches("")) {

            resultText.setText("Enter Number !");

        } else {
            int number1 = Integer.parseInt(number1_txt.getText().toString());
            int number2 = Integer.parseInt(number2_txt.getText().toString());
            int result = number1 * number2;
            resultText.setText("RESULT : " + result);

        }

    }

    public void bolme(View view) {
        if (number1_txt.getText().toString().matches("") || number2_txt.getText().toString().matches("")) {

            resultText.setText("Enter Number !");

        } else {
            int number1 = Integer.parseInt(number1_txt.getText().toString());
            int number2 = Integer.parseInt(number2_txt.getText().toString());
            int result = number1 / number2;
            resultText.setText("RESULT : " + result);

        }

    }

}