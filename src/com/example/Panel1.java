package com.example;

import javax.swing.*;
import java.awt.*;

public class Panel1 extends JPanel {

    public Panel1(LayoutManager layout) {
        EventHandler eh = new EventHandler();

        setLayout(layout);
        JLabel label = new JLabel("First Panel");
        JButton button = new JButton("button");
        button.addActionListener(eh);
        button.setActionCommand("button");
        this.add(label, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
    }

}
