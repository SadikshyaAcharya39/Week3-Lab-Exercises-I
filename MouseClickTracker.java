package level6.week3lab1;

import javax.swing.*;
import java.awt.event.*;

public class MouseClickTracker extends JFrame implements MouseListener {

    public MouseClickTracker(){
        setTitle("Mouse Click Tracker");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding mouse event
        addMouseListener(this);

    }

    // Implement the MouseListener interface methods
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse clicked at X: " + x + " Y: " + y);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    @Override
    public void mouseEntered(MouseEvent e) {

    }
    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        MouseClickTracker tracker = new MouseClickTracker();
        tracker.setVisible(true);
    }

}
