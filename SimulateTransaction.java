package level6.week3lab1;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimulateTransaction extends JFrame implements ActionListener {

    private JButton startTransactionButton;
    private JLabel statusLabel;

    public SimulateTransaction() {
        // Set up the frame
        setTitle("Bank Transaction Simulator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create the start transaction button
        startTransactionButton = new JButton("Start Transaction");
        startTransactionButton.addActionListener(this);

        // Create a label to display the status
        statusLabel = new JLabel("Press 'Start Transaction' to begin.");

        // Add components to the frame
        add(startTransactionButton);
        add(statusLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startTransactionButton) {
            // Simulate transaction process with steps
            new Thread(() -> {
                try {
                    // Step 1: Verify account
                    statusLabel.setText("Verifying account...");
                    Thread.sleep(2000); // Simulate time delay
                    System.out.println("Account verified");

                    // Step 2: Process transaction
                    statusLabel.setText("Processing transaction...");
                    Thread.sleep(3000); // Simulate time delay
                    System.out.println("Transaction processed");

                    // Step 3: Confirm transaction
                    statusLabel.setText("Confirming transaction...");
                    Thread.sleep(2000); // Simulate time delay
                    System.out.println("Transaction confirmed");

                    // Final Step: Transaction completed
                    statusLabel.setText("Transaction complete!");
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }).start();
        }
    }

    public static void main(String[] args) {
        // Create and display the frame
        SimulateTransaction simulateTransaction = new SimulateTransaction();
        simulateTransaction.setVisible(true);
    }
}
