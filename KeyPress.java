package level6.week3lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPress extends JFrame implements KeyListener {
    private JTextField jTextField;

    public KeyPress() {
        setTitle("Key Press Logger");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        jTextField = new JTextField();
        jTextField.addKeyListener(this);

        add(new Label(("Type Something")));
        add(jTextField);

    }
        // Implement KeyListener methods
        @Override
        public void keyPressed(KeyEvent e) {
            char keyChar = e.getKeyChar();
            System.out.println("Key Pressed: " + keyChar);
        }

    @Override
    public void keyReleased(KeyEvent e) {
        // Optionally, handle when the key is released
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        System.out.println("Typed");
    }

        public static void main(String[] args) {
            // Create the frame and make it visible
            KeyPress frame = new KeyPress();
            frame.setVisible(true);
        }
    }

