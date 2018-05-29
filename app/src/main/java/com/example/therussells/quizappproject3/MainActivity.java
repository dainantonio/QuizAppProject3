package com.example.therussells.quizappproject3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    // Member Variables
    //Question 1
    RadioGroup Q1RadioGroup;
    RadioButton Q1C1;
    RadioButton Q1C2;
    //Question 2
    Button Q2C1, Q2C2, Q2C3;
    //Question 3
    Button Q3C1, Q3C2, Q3C3;
    //Question 4

    //Question 5


    int score = 0;
    int updateScore;
    int scoreView;
    Button Q2C1 = (Button) findViewById(R.id.q2C1);
    Button Q2C2 = (Button) findViewById(R.id.q2C2);


    //method that handles click event for radiobuttons
    // Question 1, select correct answer from one of the the radiobutton
    Button Q2C3 = (Button) findViewById(R.id.q2C3);

    // here we are connecting the variables to the views in our xml layout
    // Question 2
    Button Q3C1 = (Button) findViewById(R.id.q3C1);
    Button Q3C2 = (Button) findViewById(R.id.q3C2);
    Button Q3C3 = (Button) findViewById(R.id.q3C3);
    private String Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickRadioButton(View view) {
        RadioGroup Q1RadioGroup = findViewById(R.id.q1RadioGroup);
        RadioButton Q1C1 = findViewById(R.id.q1C1);
        RadioButton Q1C2 = findViewById(R.id.q1C2);

        /* Is the button now checked? */
        boolean checked = ((RadioButton) view).isChecked();

        // Switch statement will check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1C1:
                if (checked)
                    // if this button is selected, do nothing and diplay toast message
                    Toast.makeText(MainActivity.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.q1C2:
                if (checked)
                    // if this button is selected toast will display as correct answer and score updated by 1 point
                    score = score + 1;
                updateScore(score);
                Toast.makeText(MainActivity.this, "Great job! Keep going", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void onClick(View view {

        // if the answer selected equals to the correct answer then the score will update by 1
        if (Q2C1.getText() == Answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }


        if (Q2C2.getText() == Answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }


        if (Q2C3.getText() == Answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }


// Question 3


        // if the answer selected equals to the correct answer then the score will update by 1
        if (Q3C1.getText() == Answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }

        // if the answer selected equals to the correct answer then the score will update by 1
        if (Q3C2.getText() == Answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }

        // if the answer selected equals to the correct answer then the score will update by 1
        if (Q3C3.getText() == Answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
    }


    // Question 4 Checked responses
    public void onCheckboxClicked() {
        CheckBox Q4C1 = findViewById(R.id.q4C1);
        CheckBox Q4C2 = findViewById(R.id.q4C2);
        CheckBox Q4C3 = findViewById(R.id.q4C3);
        CheckBox Q4C4 = findViewById(R.id.q4C4);

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked

        if (Q4C2.isChecked()) {
            return;
            //do nothing
            Toast.makeText(MainActivity.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();
        } else if (Q4C4.isChecked()) {
            return;
            //do nothing
            Toast.makeText(MainActivity.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();

        } else if (Q4C1.isChecked() && (Q4C3.isChecked())) {

            score = score + 1;
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        }
    }


    //Method to keep track off score. After each coorect answer, a point is added
    public void updateScore(int score) {
        TextView scoreView = findViewById(R.id.score_value);
        scoreView.setText(String.valueOf(score));
        Toast.makeText(this, ("Your score is " + score), Toast.LENGTH_SHORT).show();
    }

    //Score reset for another attempt to take quiz
    public void RetakeQuiz(View view) {
        score = 0;
        updateScore(score);
        Toast.makeText(MainActivity.this, "Retake Quiz!", Toast.LENGTH_SHORT).show();


    }
}


