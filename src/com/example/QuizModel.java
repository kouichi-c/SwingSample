package com.example;

public class QuizModel {

    private int CorrectAnswer = 0;

    public void addCorrectAnswer(){
        this.CorrectAnswer++;
    }

    public int showCorrectAnswer() {
        return this.CorrectAnswer;
    }

    public void judge(String answer) {
        if (answer.equals("2-3")) this.addCorrectAnswer();
    }

    public void reset() {
        CorrectAnswer = 0;
    }

}
