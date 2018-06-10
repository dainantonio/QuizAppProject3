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

    // Variables
    //Question 1
    RadioGroup Q1RadioGroup;
    RadioButton Q1C1 , Q1C2;
    int scoreView;
    //Question 2
    Button Q2C1,  Q2C2 , Q2C3;
    //Question 3
    Button Q3C1, Q3C2 , Q3C3;
    //Question 4
    //Question 5
    private EditText Q5Answer;
    Button Q5Button;
    private int score = 0;
    private int updateScore;
    private String answer;


    // here we are connecting the variables to the views in our xml layout
    // Question 1


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton Q1C1 = findViewById(R.id.q1C1);
        RadioButton Q1C2 = findViewById(R.id.q1C2);
        Button Q2C1 = findViewById(R.id.q2C1);
        Button Q2C2 = findViewById(R.id.q2C2);
        Button Q2C3 = findViewById(R.id.q2C3);
        Button Q3C1 = findViewById(R.id.q3C1);
        Button Q3C2 = findViewById(R.id.q3C2);
        Button Q3C3 = findViewById(R.id.q3C3);




    }



    public void clickRadioButton (View view){
        /* Is the button now checked? */
        boolean checked = ((RadioButton) view).isChecked();

        // Switch statement will check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1C1:
                if (checked)
                    // if this button is selected, do nothing and display toast message
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

    // Question 2, answer "Social Media"
    public void onClick(View view) {
        // if the answer selected equals to the correct answer then the score will update by 1
        if (Q2C1.getText() == answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            score =  0;
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }

        if (Q2C2.getText() == answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            score = 0;
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }


        if (Q2C3.getText() == answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            score = 0;
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }


        // Question 3, answer "September 2014"
        // if the answer selected equals to the correct answer then the score will update by 1
        if (Q3C1.getText() == answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            score = 0;
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }

        // if the answer selected equals to the correct answer then the score will update by 1
        if (Q3C2.getText() == answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            score = 0;
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }

        // if the answer selected equals to the correct answer then the score will update by 1
        if (Q3C3.getText() == answer) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            score = 0;
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    // Question 4 Checked responses
    public void onCheckboxClicked(View view) {
        CheckBox Q4C1 = findViewById(R.id.q4C1);
        CheckBox Q4C2 = findViewById(R.id.q4C2);
        CheckBox Q4C3 = findViewById(R.id.q4C3);
        CheckBox Q4C4 = findViewById(R.id.q4C4);

        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        if (Q4C1.isChecked() && (Q4C3.isChecked())) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else if (Q4C2.isChecked() || (Q4C4.isChecked()))
            score = 0;
            //do nothing
            Toast.makeText(MainActivity.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();


        }

    //Question 5, answer is Russell
    public void onClickEditText(View view) {

        EditText Q5Answer = findViewById(R.id.q5Answer);
        String string = Q5Answer.getText().toString();

        if (string.equalsIgnoreCase("Russell")) {
            score = score + 1;
            updateScore(score);
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            score = 0;
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    //Method to keep track of score. After each correct answer, a point is added
    private void updateScore(int score) {
        TextView scoreView = findViewById(R.id.score_value);
        scoreView.setText(String.valueOf(score));
        Toast.makeText(this, ("Your score is " + score), Toast.LENGTH_SHORT).show();
    }

    //Score reset for another attempt to take quiz
    public void RetakeQuiz(View view) {
        Button retakeQuiz = findViewById(R.id.retakeButton);
        score = 0;
        updateScore(score);
        Toast.makeText(MainActivity.this, "Retake Quiz!", Toast.LENGTH_SHORT).show();
    }
}




