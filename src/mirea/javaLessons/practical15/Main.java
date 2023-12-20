package mirea.javaLessons.practical15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        //EzCalc();
        //Countrys();
    }

    public static void EzCalc() {
        Frame f = new Frame("ActionListener Example");
        TextField tfa = new TextField("0");
        TextField tfb = new TextField("0");
        Button badd = new Button("add");
        Button bsub = new Button("subtraction");
        Button bmul = new Button("multiplication");
        Button bdiv = new Button("division");
        Label num1 = new Label("number 1");
        Label num2 = new Label("number 2");
        Label res = new Label("Result:");
        Label ans = new Label("0");

        tfa.setBounds(80, 50, 145, 25);
        tfb.setBounds(80, 80, 145, 25);
        num1.setBounds(20, 50, 60, 25);
        num2.setBounds(20, 80, 60, 25);
        badd.setBounds(20, 135, 100, 25);
        bsub.setBounds(125, 135, 100, 25);
        bmul.setBounds(20, 165, 100, 25);
        bdiv.setBounds(125, 165, 100, 25);
        res.setBounds(90, 220, 40, 25);
        ans.setBounds(135, 220, 60, 25);

        f.setBackground(Color.LIGHT_GRAY);

        badd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ans.setText(Integer.toString(Integer.parseInt(tfa.getText()) + Integer.parseInt(tfb.getText())));
            }
        });
        bsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ans.setText(Integer.toString(Integer.parseInt(tfa.getText()) - Integer.parseInt(tfb.getText())));
            }
        });
        bmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ans.setText(Integer.toString(Integer.parseInt(tfa.getText()) * Integer.parseInt(tfb.getText())));
            }
        });
        bdiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ans.setText(Double.toString(Double.parseDouble(tfa.getText()) / Double.parseDouble(tfb.getText())));
            }
        });

        f.add(tfa);
        f.add(tfb);
        f.add(num1);
        f.add(num2);
        f.add(badd);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
        f.add(res);
        f.add(ans);
        f.setSize(245, 260);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void Countrys() {
        Frame f = new Frame();
        String[] countrys = {"Austria", "China", "England", "Russia"};
        JComboBox cou = new JComboBox(countrys);
        Button b = new Button("Information");
        Label text = new Label("");

        cou.setBounds(20, 50, 100, 25);
        b.setBounds(130, 50, 100, 25);
        text.setBounds(20, 100, 200, 50);

        f.setBackground(Color.LIGHT_GRAY);

        b.addActionListener(e -> {
            if (cou.getSelectedItem().equals(countrys[0])) {
                text.setText("This is not Australia");
            } else if (cou.getSelectedItem().equals(countrys[1])) {
                text.setText("There's a lot of people there");
            } else if (cou.getSelectedItem().equals(countrys[2])) {
                text.setText("There's a lot of tea and football there");
            } else {
                text.setText("There's a lot of territory there");
            }
        });

        f.add(cou);
        f.add(b);
        f.add(text);
        f.setSize(240, 160);
        f.setLayout(null);
        f.setVisible(true);
    }
}
