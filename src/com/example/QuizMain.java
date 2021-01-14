package com.example;

import javax.swing.*;

public class QuizMain {
    public static void main(String[] args) {
        QuizView view = new QuizView();
        QuizModel model = new QuizModel();
        QuizController controller = new QuizController(view, model);

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(500,500);
        view.setLocationRelativeTo(null);
        view.setTitle("Title");
        view.setVisible(true);
    }
}
