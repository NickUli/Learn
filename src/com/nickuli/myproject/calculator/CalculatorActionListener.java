package com.nickuli.myproject.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorActionListener implements ActionListener {
    CalculatorFrameSwing parent;
    double currentResult = 0;
    double memory = 0;
    String selectedAction = " ";
    boolean needText = false;

    CalculatorActionListener(CalculatorFrameSwing parent) {
        this.parent = parent;
    }

    static void pressButton() {

    }

    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        String displayFieldText = parent.displayField.getText();
        switch (clickedButton.getText()) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                if (needText) displayFieldText += clickedButton.getText();
                else {
                    displayFieldText = clickedButton.getText();
                    needText = true;
                }
                break;
            case "+":
            case "-":
            case "*":
            case "/":
            case "=":
                if (clickedButton.getText()=="=") needText=true;
                if (needText) {
                    switch (selectedAction) {
                        case " ":
                            currentResult = Double.parseDouble(displayFieldText);
                            break;
                        case "+":
                            currentResult += Double.parseDouble(displayFieldText);
                            break;
                        case "-":
                            currentResult -= Double.parseDouble(displayFieldText);
                            break;
                        case "*":
                            currentResult *= Double.parseDouble(displayFieldText);
                            break;
                        case "/":
                            currentResult /= Double.parseDouble(displayFieldText);
                            break;
                    }

                }
                selectedAction = clickedButton.getText();
                needText = false;
                int integerNumber = (int) currentResult;
                if (currentResult - integerNumber == 0) displayFieldText = "" + integerNumber;
                else displayFieldText = "" + currentResult;
                //       if (selectedAction == "+") currentResult += Double.parseDouble(displayFieldText);
                //              if (selectedAction == '-') currentResult -= Double.parseDouble(displayFieldText);
                //         if (selectedAction == '*') currentResult *= Double.parseDouble(displayFieldText);
                //         if (selectedAction == '/') currentResult /= Double.parseDouble(displayFieldText);
                break;
            case ".":
                if (needText&&!displayFieldText.contains(".")) displayFieldText += ".";
                if (!needText) {
                    displayFieldText = "0.";
                    needText = true;
                }
            case "C":
                displayFieldText="0";
                currentResult=0;
                selectedAction=" ";
        }
        parent.displayField.setText(displayFieldText);
  //      if (selectedAction=="=") currentResult=0;
        //    case "=":
        //   mem += Double.parseDouble(displayFieldText);
        //   parent.displayField.setText("" + mem);

    }
    //   if (source==parent.buttons[11]) parent.displayField.setText("7");
}

