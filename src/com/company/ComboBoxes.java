package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxes extends JApplet {
    private String[] description = {"Ebullient", "Obtuse", "Recalcitrant",
            "Brilliant", "Somnescent", "Timorous", "Florid", "Putrescent"};

    private JTextField t = new JTextField(15);

    private JComboBox c = new JComboBox();

    private JButton b = new JButton("Add items");

    private int count = 0;

    public void init() {
        for (int i = 0; i < 4; i++)
            c.addItem(description[count++]);
        t.setEditable(false);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (count < description.length)
                    c.addItem(description[count++]);
            }
        });
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText("index: " + c.getSelectedIndex() + "   "
                        + ((JComboBox) e.getSource()).getSelectedItem());
            }
        });
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(t);
        cp.add(c);
        cp.add(b);
    }
}