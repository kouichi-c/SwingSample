package com.example;

import javax.swing.*;
import java.awt.*;

public class Panel2 extends JPanel {

    public Panel2(LayoutManager layout) {
        EventHandler eh = new EventHandler();

        setLayout(layout);
        JLabel label = new JLabel("Second Panel");
        JButton button = new JButton("button");
        button.addActionListener(eh);
        button.setActionCommand("button2");
        this.add(label, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
    }
}
