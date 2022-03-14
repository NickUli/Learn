package com.nickuli.myproject.calculator;

import javax.swing.*;
import java.awt.*;

public class CalculatorFrameSwing {
    JFrame frame = new JFrame("Calculator");
    JLabel displayField = new JLabel("0", SwingConstants.RIGHT);
    JPanel windowContent = new JPanel();
    JButton[] buttons = new JButton[30];

    CalculatorFrameSwing() {
        windowContent.setLayout(new BorderLayout());
        windowContent.add("North", displayField);
        Font font = new Font("Courier New", Font.PLAIN, 25);
        displayField.setFont(font);
        JPanel buttonsPanel = new JPanel(new GridLayout(6, 5));
        createButtons();
        for (JButton button : buttons) buttonsPanel.add(button);
        windowContent.add("Center", buttonsPanel);
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CalculatorActionListener calculatorAction = new CalculatorActionListener(this);
        for (JButton button : buttons) button.addActionListener(calculatorAction);
    }

    private void createButtons() {
        String[] symbols = {"MC", "%", "CE", "C", "<", "MR", "1/x", "x^2", "sqr(x)", "/", "M+", "7", "8", "9", "*",
                "M-", "4", "5", "6", "-", "MS", "1", "2", "3", "+", "n!", "+/-", "0", ".", "="};
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(symbols[i]);
        }
    }
}
