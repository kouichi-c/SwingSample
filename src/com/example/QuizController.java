package com.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizController{
    private QuizView quizView;
    private QuizModel quizModel;

    QuizController(QuizView view, QuizModel model) {
        this.quizView = view;
        this.quizModel = model;
        this.quizView.addQuizListener(new QuizListener());
    }

    class QuizListener implements  ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            switch (cmd) {
                case "button":
                    QuizView.layout.next(QuizView.cardPanel);
                    break;
                case "button2":
                    quizModel.judge(quizView.getAnswer());
                    quizView.setResult(quizModel);
                    QuizView.layout.next(QuizView.cardPanel);
                    break;
                case "back":
                    quizModel.reset();
                    QuizView.layout.first(QuizView.cardPanel);
                    break;
            }

        }
    }

}
