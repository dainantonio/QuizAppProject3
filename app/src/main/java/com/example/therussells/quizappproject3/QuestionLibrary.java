package com.example.therussells.quizappproject3;

public class QuestionLibrary {
    // creating member variables that are all arrays

    // single array contains the questions
    private String mQuiz [] = {
            "Who made the first move?",
            "How did you meet each other?",
            "In what month and year did you get married?",
            "Select the correct answer",
            "Describe your wife in a sentence"
    };

    //2 dimensional array contains the choices
    private String mChoices [][] = {
            {"husband", "wife"},
            {"Mutual Friends", "Social Media", "At the grocery store"},
            {"January 2014", "November 2014", "September 2014"},
            {"Got married on the river", "Got married on Wednesday", "Got married in Myrtle Beach"},
            {"Demetria is sensitive, spiritual and opinionated"}
    };

    //single array contains the correct answers
    private String mCorrectAnswers [] =
            {"Social Media", "September 2014", "Got married in Myrtle Beach", "Demetria is sensitive, spiritual and opinionated"};

    // Method that will create the question
    public String getQuiz(int a){
        return mQuiz [a];
    }

    // Method that will return the first choice in the array
    public String getAnswer1(int a){
        return mChoices [a][0];
    }

    // Method that will return the second choice in the array
    public String getAnswer2(int a){
        return mChoices [a][1];
    }

    // Method that will return third choice in the array
    public String getAnswer3(int a){
        return mChoices [a][2];
    }

    //Method that will return the correct answer
    public String getCorrectAnswers(int a) {
        return mCorrectAnswers [a];
    }
}

