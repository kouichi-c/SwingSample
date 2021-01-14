package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Panel2 extends JPanel {
    private final JButton button;
    private final ButtonGroup bg;

    public Panel2(LayoutManager layout) {
        setLayout(layout);
        JLabel label = new JLabel("問題１  int型は何bit?");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JRadioButton rb = new JRadioButton("8bit");
        rb.setActionCommand("2-1");
        JRadioButton rb2 = new JRadioButton("16bit");
        rb2.setActionCommand("2-2");
        JRadioButton rb3 = new JRadioButton("32bit");
        rb3.setActionCommand("2-3");
        JRadioButton rb4 = new JRadioButton("64bit");
        rb4.setActionCommand("2-4");

        bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        button = new JButton("Continue");
        button.setActionCommand("button2");

        JPanel p = new JPanel(new GridLayout(4,1));
        p.add(rb);
        p.add(rb2);
        p.add(rb3);
        p.add(rb4);
        this.add(label, BorderLayout.NORTH);
        this.add(p, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
    }

    public void setActionListener(ActionListener l) {
        button.addActionListener(l);
    }

    public String getSelection() {
        if (this.bg.getSelection() != null){
            return this.bg.getSelection().getActionCommand();
        }
        return "";
    }
}
