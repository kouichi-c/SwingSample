package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Result extends JPanel {
    JLabel label;
    JButton back;
    Result(LayoutManager layout) {
        setLayout(layout);
        label = new JLabel("正答数");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        back = new JButton("back");
        back.setActionCommand("back");
        this.add(label, BorderLayout.CENTER);
        this.add(back, BorderLayout.SOUTH);
    }
    public void setActionListener(ActionListener l) {
        back.addActionListener(l);
    }
    public void setLabel(QuizModel model) {
        label.setText("正答数: " + model.showCorrectAnswer());
    }
}
