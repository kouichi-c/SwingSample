package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Panel1 extends JPanel {
    private final JButton button;

    public Panel1(LayoutManager layout) {
        setLayout(layout);
        JLabel label = new JLabel("Java Quiz");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        button = new JButton("START");
        button.setActionCommand("button");
        this.add(label, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
    }

    public void setActionListener(ActionListener l) {
        button.addActionListener(l);
    }

}
