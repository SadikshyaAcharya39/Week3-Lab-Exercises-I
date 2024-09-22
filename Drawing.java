package level6.week3lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Drawing extends JFrame implements MouseListener, MouseMotionListener, ActionListener {

    private JPanel panel;
    private JComboBox<String> shapeSelector;
    private String currentShape = "Line";
    private int startX, startY, endX, endY;

    public Drawing() {
        setTitle("Drawing on Canvas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the drawing panel
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);

                switch (currentShape) {
                    case "Line":
                        g.drawLine(startX, startY, endX, endY);
                        break;
                    case "Rectangle":
                        g.drawRect(Math.min(startX, endX), Math.min(startY, endY),
                                Math.abs(endX - startX), Math.abs(endY - startY));
                        break;
                    case "Oval":
                        g.drawOval(Math.min(startX, endX), Math.min(startY, endY),
                                Math.abs(endX - startX), Math.abs(endY - startY));
                        break;
                }
            }
        };

        panel.setBackground(Color.WHITE);
        panel.addMouseListener(this);
        panel.addMouseMotionListener(this);

        // Create the shape selector combo box
        String[] shapes = { "Line", "Rectangle", "Oval" };
        shapeSelector = new JComboBox<>(shapes);
        shapeSelector.addActionListener(this);

        // Add components to the frame
        add(panel, BorderLayout.CENTER);
        add(shapeSelector, BorderLayout.NORTH);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        startX = e.getX();
        startY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        endX = e.getX();
        endY = e.getY();
        panel.repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        endX = e.getX();
        endY = e.getY();
        panel.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == shapeSelector) {
            currentShape = (String) shapeSelector.getSelectedItem();
        }
    }

    // Unused MouseListener and MouseMotionListener methods
    @Override
    public void mouseMoved(MouseEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        // Create and display the drawing app window
        Drawing app = new Drawing();
        app.setVisible(true);
    }
}
