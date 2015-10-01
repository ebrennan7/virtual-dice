package com.egroegnosbig.virtualdice;

import javax.swing.*;

public class VirtualDice {
    public static void main(String[] args) {
        JFrame f = new JFrame("Virtual Dice");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dice dice = new Dice(6);
        DicePanel GUI = new DicePanel(dice);
        f.add(GUI);
        f.setSize(400, 250);
        f.setResizable(false);
        f.setVisible(true);
    }
}