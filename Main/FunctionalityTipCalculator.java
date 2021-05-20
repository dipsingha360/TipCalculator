package TipCalculator.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class FunctionalityTipCalculator extends JFrame{
    private JPanel mainPanel;
    private JTextField textBill;
    private JButton clearButton;
    private JButton calculateButton;
    private JRadioButton goodRadioButton;
    private JRadioButton veryGoodRadioButton;
    private JRadioButton excellentRadioButton;


    // Constructor

    public FunctionalityTipCalculator() {

        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setBounds(100,100,450,300);
        this.setLocation(700,380);
        this.setVisible(true);
//        textBill.setBounds(10,50,10,50);

        ButtonGroup  buttonGroup = new ButtonGroup();
        buttonGroup.add(goodRadioButton);
        buttonGroup.add(veryGoodRadioButton);
        buttonGroup.add(excellentRadioButton);


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double bill = Double.valueOf(textBill.getText());

                if(goodRadioButton.isSelected() == true) {
                    JOptionPane.showMessageDialog(null, "Your Total Bill : " + (bill+10+" tk") );
                } else if (veryGoodRadioButton.isSelected() == true) {
                    JOptionPane.showMessageDialog(null, "Your Total Bill : " + (bill+15+" tk") );
                } else if (excellentRadioButton.isSelected() == true) {
                    JOptionPane.showMessageDialog(null, "Your Total Bill : " + (bill+20+" tk") );
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}