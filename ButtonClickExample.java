package level6.week3lab1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickExample {
    public static void main(String[] args) {

    JFrame jFrame = new JFrame("Button Click Example");
    jFrame.setSize(300, 200);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton jButton = new JButton("Click Me");

    JLabel jLabel = new JLabel("");

    jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jLabel.setText("Button Clicked...");
        }
    });

    jFrame.setLayout(new java.awt.FlowLayout());
    jFrame.add(jButton);
    jFrame.add(jLabel);
    jFrame.setVisible(true);
}
}
