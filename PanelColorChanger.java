package level6.week3lab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelColorChanger extends JFrame implements MouseListener {
    private JPanel panel;

    public PanelColorChanger() {
        setTitle("Mouse Enter and Exit Colour Changer");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setBackground(Color.BLUE);

        panel.addMouseListener(this);
        add(panel, BorderLayout.CENTER);

    }

    public void mouseEntered(MouseEvent e){
        panel.setBackground(Color.BLACK);
    }

    public void mouseExited(MouseEvent e){
        panel.setBackground(Color.BLUE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}

    public static void main(String[] args) {
        PanelColorChanger panelColorChanger = new PanelColorChanger();
        panelColorChanger.setVisible(true);
    }

}
