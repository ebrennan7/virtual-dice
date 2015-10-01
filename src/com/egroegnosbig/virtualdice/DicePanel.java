package com.egroegnosbig.virtualdice;

import java.awt.*;
import javax.swing.*;

public class DicePanel extends JPanel {
    private final Dice dice;
    private final JButton rollButton;
    private final JLabel nameLabel;
    private JLabel displayLabel;
    

    public DicePanel(Dice dice) {
        this.dice = dice;
        
        rollButton = new JButton("Roll");
        displayLabel = new JLabel();
        
        rollButton.addActionListener(e -> displayLabel.setText("                                                     You rolled a " + dice.roll() + "."));
        
        nameLabel = new JLabel();
        nameLabel.setText("                                                       Virtual Dice");
        
        setLayout(new GridLayout(4, 2));
        add(nameLabel);
        add(rollButton);
        add(displayLabel);
    }
}