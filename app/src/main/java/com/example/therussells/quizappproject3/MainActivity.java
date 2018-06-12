package com.example.therussells.quizappproject3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
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
    RadioButton Q1C1, Q1C2;
    int scoreView;
    //Question 2
    RadioButton Q2C1, Q2C2;
    //Question 3
    RadioButton Q3C1, Q3C2;
    //Question 4
    CheckBox Q4C1, Q4C2, Q4C3, Q4C4;
    //Question 5
    EditText Question5;
    String Q5Answer;
    Button Q5Button;
    int score = 0;
    int updateScore;
    String answer;
    int score1, score2, score3, score4, score5 = 0;
    Button submitAnswers;
    // here we are connecting the variables to the views in our xml layout
    //------------------------------------------------------------------------------------------
    // Question 1, answer "wife"
    //------------------------------------------------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);

        //these methods are used to get the view instances in Java by using the ids defined in the XML.

        RadioButton Q1C1 = findViewById(R.id.q1C1);
        RadioButton Q1C2 = findViewById(R.id.q1C2);
        RadioButton Q2C1 = findViewById(R.id.q2C1);
        RadioButton Q2C2 = findViewById(R.id.q2C2);
        RadioButton Q3C1 = findViewById(R.id.q3C1);
        RadioButton Q3C2 = findViewById(R.id.q3C2);
        Button submitAnswers = findViewById(R.id.submitAnswersButton);
        Button saveEditText = findViewById(R.id.q5AnswerButton);
        Button retakeQuiz = findViewById(R.id.retakeButton);


    }

    public void clickRadioButton(View view) {
        /* Is the button now checked? */
        boolean checked = ((RadioButton) view).isChecked();

        // Switch statement will check which radio button was clicked
        switch (view.getId()) {
            case R.id.q1C1:
                if (checked)
                    score1 = 0;
                // if this button is selected, do nothing and display toast message
                Toast.makeText(MainActivity.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q1C2:
                if (checked)
                    // if this button is selected toast will display as correct answer and score updated by 1 point
                    score1 = score1 + 1;
                Toast.makeText(MainActivity.this, "Great job! Keep going", Toast.LENGTH_SHORT).show();
                break;
        }
        //------------------------------------------------------------------------------------------
        // Question 2, answer "Social Media"
        //------------------------------------------------------------------------------------------
        // Switch statement will check which radio button was clicked
        switch (view.getId()) {
            case R.id.q2C1:
                if (checked)
                    score2 = 0;
                // if this button is selected, do nothing and display toast message
                Toast.makeText(MainActivity.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q2C2:
                if (checked)
                    // if this button is selected toast will display as correct answer and score updated by 1 point
                    score2 = score2 + 1;
                Toast.makeText(MainActivity.this, "Great job! Keep going", Toast.LENGTH_SHORT).show();
                break;
        }
        //------------------------------------------------------------------------------------------
        // Question 3, answer "September 2014"
        //------------------------------------------------------------------------------------------
        // Switch statement will check which radio button was clicked
        switch (view.getId()) {
            case R.id.q3C1:
                if (checked)
                    score3 = 0;
                // if this button is selected, do nothing and display toast message
                Toast.makeText(MainActivity.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.q3C2:
                if (checked)
                    // if this button is selected toast will display as correct answer and score updated by 1 point
                    score3 = score3 + 1;
                Toast.makeText(MainActivity.this, "Great job! Keep going", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    //------------------------------------------------------------------------------------------
    // Question 4 Checked responses, answers are options 1 and 3
    //------------------------------------------------------------------------------------------
    public void onCheckboxClicked(View view) {
        CheckBox Q4C1 = findViewById(R.id.q4C1);
        CheckBox Q4C2 = findViewById(R.id.q4C2);
        CheckBox Q4C3 = findViewById(R.id.q4C3);
        CheckBox Q4C4 = findViewById(R.id.q4C4);

        // Is the view now checked?
        ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        if (Q4C1.isChecked() && (Q4C3.isChecked())) {
            score4 = score4 + 1;
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else if (Q4C2.isChecked() || (Q4C4.isChecked()))
            score4 = 0;
        //do nothing
        Toast.makeText(MainActivity.this, "Incorrect, try again!", Toast.LENGTH_SHORT).show();
    }
    //------------------------------------------------------------------------------------------
    // Question 5, answer is Russell
    //------------------------------------------------------------------------------------------
    public void onClickEditText(View view) {
        EditText Question5 = findViewById(R.id.question5);
        String Q5Answer = Question5.getText().toString();
        if (Q5Answer.equalsIgnoreCase("Russell")) {
            score5 = score5 + 1;
            Toast.makeText(MainActivity.this, "Great job!", Toast.LENGTH_SHORT).show();
        } else {
            score5 = 0;
            Toast.makeText(MainActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
    }
    public void submitAnswers(View view) {
        TextView scoreView = findViewById(R.id.score_value);
        scoreView.setText(String.valueOf(score));
        score = score1 + score2 + score3 + score4 + score5;
        if (score == 5) {
            Toast.makeText(MainActivity.this, "Awesome! you got all 5 correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "I am giving you one more chance to get it all right", Toast.LENGTH_SHORT).show();
        }
    }
    //Score reset for another attempt to take quiz
    public void RetakeQuiz(View view) {
        score = 0;
        TextView scoreView = findViewById(R.id.score_value);
        scoreView.setText(String.valueOf(score));
        Toast.makeText(MainActivity.this, "Retake Quiz!", Toast.LENGTH_SHORT).show();

        //Resetting all RadioGroups
        //Question 1
        RadioGroup radioGroup1 = findViewById(R.id.q1RadioGroup);
        radioGroup1.clearCheck();
        //Question 2
        RadioGroup radioGroup2 = findViewById(R.id.q2RadioGroup);
        radioGroup2.clearCheck();
        //Question 3
        RadioGroup radioGroup3 = findViewById(R.id.q3RadioGroup);
        radioGroup3.clearCheck();

        //Resetting all CheckBoxes
        //Question 4
        CheckBox Q4C1 = findViewById(R.id.q4C1);
        Q4C1.setChecked(false);
        CheckBox Q4C2 = findViewById(R.id.q4C2);
        Q4C2.setChecked(false);
        CheckBox Q4C3 = findViewById(R.id.q4C3);
        Q4C3.setChecked(false);
        CheckBox Q4C4 = findViewById(R.id.q4C4);
        Q4C4.setChecked(false);

        //Reset EditText
        EditText Q5Answer = findViewById(R.id.question5);
        Q5Answer.setText("");
    }
}




