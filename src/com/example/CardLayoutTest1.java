package com.example;

import javax.swing.*;
import java.awt.*;

public class CardLayoutTest1 extends JFrame{
    public static JPanel cardPanel;
    public static CardLayout layout;

    public static void main(String[] args) {
        CardLayoutTest1 frame = new CardLayoutTest1();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10,10,300,200);
        frame.setTitle("Title");
        frame.setVisible(true);
    }

    CardLayoutTest1() {
        Panel1 card1 = new Panel1(new BorderLayout());
        Panel2 card2 = new Panel2(new BorderLayout());

        cardPanel = new JPanel();
        layout = new CardLayout();
        cardPanel.setLayout(layout);

        cardPanel.add(card1, "button");
        cardPanel.add(card2, "button2");

        getContentPane().add(cardPanel, BorderLayout.CENTER);
    }

}
