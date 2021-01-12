package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutTest1 extends JFrame implements ActionListener {
    JPanel cardPanel;
    CardLayout layout;

    public static void main(String[] args) {
        CardLayoutTest1 frame = new CardLayoutTest1();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10,10,300,200);
        frame.setTitle("Title");
        frame.setVisible(true);
    }

    CardLayoutTest1() {
        // panel1
        JPanel card1 = new JPanel(new BorderLayout());
        JLabel label = new JLabel("First Panel");
        JButton button1 = new JButton("button");
        button1.addActionListener(this);
        button1.setActionCommand("button");
        card1.add(label, BorderLayout.CENTER);
        card1.add(button1, BorderLayout.SOUTH);

        // panel2
        JPanel card2 = new JPanel(new BorderLayout());
        JLabel label2 = new JLabel("Second Panel");
        JButton button2 = new JButton("button2");
        button2.addActionListener(this);
        button2.setActionCommand("button2");
        card2.add(label2, BorderLayout.CENTER);
        card2.add(button2, BorderLayout.SOUTH);

        cardPanel = new JPanel();
        layout = new CardLayout();
        cardPanel.setLayout(layout);

        cardPanel.add(card1, "button");
        cardPanel.add(card2, "button2");

        getContentPane().add(cardPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("button")) {
            layout.next(cardPanel);
        } else if(cmd.equals("button2")) {
            layout.previous(cardPanel);
        }
    }
}
