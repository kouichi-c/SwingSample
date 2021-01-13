package com.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("button")){
            CardLayoutTest1.layout.next(CardLayoutTest1.cardPanel);
        } else if(cmd.equals("button2")) {
            CardLayoutTest1.layout.previous(CardLayoutTest1.cardPanel);
        }
    }
}
