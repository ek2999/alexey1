package ru.synergy.alexey1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LogTag = "CALCULATOR_ACTIVITY";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LogTag, "i am onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LogTag, "i am onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LogTag, "i am onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LogTag, "i am onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LogTag, "i am onPause");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LogTag, "i am onCreate");

        setContentView(R.layout.activity_calculator);

        final Button calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(LogTag, "on button have be pushd");
                calculateAnswer();
            }
        });

    }
    private void calculateAnswer(){
        EditText numOne = (EditText) findViewById(R.id.editTextNumber);
        EditText numTwo = (EditText) findViewById(R.id.editTextNumber2);

        RadioButton add = (RadioButton) findViewById(R.id.add);
        RadioButton subtract = (RadioButton) findViewById(R.id.subtract);
        RadioButton multiply = (RadioButton) findViewById(R.id.multiply);
        RadioButton divide = (RadioButton) findViewById(R.id.divide);

        TextView answer = (TextView) findViewById(R.id.result);

        Log.d(LogTag, "all views has been founded");

        float numbOne = Integer.parseInt(numOne.getText().toString());
        float numbTwo = Integer.parseInt(numTwo.getText().toString());

        Log.d(LogTag, "Sucess grab data from input fields");

        float solution = 0;

        if(add.isChecked()){
            solution = numbOne + numbTwo;
        }
        if(subtract.isChecked()){
            solution = numbOne - numbTwo;
        }
        if(multiply.isChecked()){
            solution = numbOne * numbTwo;
        }
        if (divide.isChecked() && !(numbTwo == 0)) {
            solution = numbOne / numbTwo;
        }

        answer.setText("The answer is "+solution);


    }

      //setContentView(R.layout.activity_main);

      //setContentView(R.layout.activity_second);

       //TextView textView = (TextView) findViewById(R.id.header);

       //textView.setText("Hello from Java");

        /*ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setText("Привет!");
        textView.setTextSize(26);

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;

        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);
        *///setContentView(constraintLayout);

    //}
}