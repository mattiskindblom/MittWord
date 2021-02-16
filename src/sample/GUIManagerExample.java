package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIManagerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIManagerExample");
        frame.setContentPane(new GUIManagerExample().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton newButton;
    private JButton clearButton;

    public GUIManagerExample() {
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
