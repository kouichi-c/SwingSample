package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class QuizView extends JFrame{
    public static JPanel cardPanel;
    public static CardLayout layout;
    private Panel1 panel1;
    private Panel2 panel2;
    private Result panel3;

    QuizView() {
        panel1 = new Panel1(new BorderLayout());
        panel2 = new Panel2(new BorderLayout());
        panel3 = new Result(new BorderLayout());

        cardPanel = new JPanel();
        layout = new CardLayout();
        cardPanel.setLayout(layout);

        cardPanel.add(panel1, "button");
        cardPanel.add(panel2, "button2");
        cardPanel.add(panel3, "result");

        getContentPane().add(cardPanel, BorderLayout.CENTER);
    }

    public void addQuizListener(ActionListener listener) {
        panel1.setActionListener(listener);
        panel2.setActionListener(listener);
        panel3.setActionListener(listener);
    }

    public String getAnswer() {
        if (panel2.getSelection() != null){
            return panel2.getSelection();
        }
        return "0";
    }

    public void setResult(QuizModel model) {
        panel3.setLabel(model);
    }

}
