package com.yakov_fain.practical_java.lesson8;

import javax.swing.*;
import java.awt.*;

public class CalculatorGridBagLayout extends JFrame {
    public CalculatorGridBagLayout() {
        JPanel windowContent = new JPanel();

        // Set the layout manager for the panel
        //GridLayout gl = new GridLayout(4,2);
        GridBagLayout gridBagLayout = new GridBagLayout();
        //windowContent.setLayout(gl);
        windowContent.setLayout(gridBagLayout);

        GridBagConstraints bagConstraints = new GridBagConstraints();
        bagConstraints.ipadx = 1;
        bagConstraints.ipady = 0;
        bagConstraints.gridheight = 1;
        bagConstraints.gridwidth = 2;
        bagConstraints.fill = GridBagConstraints.BOTH;
        bagConstraints.weightx = 1.0;
        bagConstraints.weighty = 1.0;
        bagConstraints.anchor = GridBagConstraints.CENTER;

        GridBagConstraints bagConstraints2 = new GridBagConstraints();
        bagConstraints2.ipadx = 0;
        bagConstraints2.ipady = 0;
        bagConstraints2.gridheight = 1;
        bagConstraints2.gridwidth = 6;
        bagConstraints2.fill = GridBagConstraints.BOTH;
        bagConstraints2.weightx = 1.0;
        bagConstraints2.weighty = 1.0;
        bagConstraints2.anchor = GridBagConstraints.NORTH;

        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");
        JButton dot = new JButton(".");
        JTextField displayField = new JTextField();

        gridBagLayout.setConstraints(one, bagConstraints);
        gridBagLayout.setConstraints(two, bagConstraints);
        gridBagLayout.setConstraints(three, bagConstraints);
        gridBagLayout.setConstraints(four, bagConstraints);
        gridBagLayout.setConstraints(five, bagConstraints);
        gridBagLayout.setConstraints(six, bagConstraints);
        gridBagLayout.setConstraints(seven, bagConstraints);
        gridBagLayout.setConstraints(eight, bagConstraints);
        gridBagLayout.setConstraints(nine, bagConstraints);
        gridBagLayout.setConstraints(zero, bagConstraints);
        gridBagLayout.setConstraints(dot, bagConstraints);
        gridBagLayout.setConstraints(displayField, bagConstraints2);

        windowContent.add(displayField);
        windowContent.add(one);
        windowContent.add(two);
        windowContent.add(three);
        windowContent.add(four);
        windowContent.add(five);
        windowContent.add(six);
        windowContent.add(seven);
        windowContent.add(eight);
        windowContent.add(nine);
        windowContent.add(zero);
        windowContent.add(dot);
        // Add controls to the panel


        // Create the frame and add the panel to it
        JFrame frame = new JFrame("My First Calculator");

        frame.setContentPane(windowContent);

        // set the size and display the window
        frame.setSize(400, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        CalculatorGridBagLayout calculatorGridBagLayout = new CalculatorGridBagLayout();
    }
}
