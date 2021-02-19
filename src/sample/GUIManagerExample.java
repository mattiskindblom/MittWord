package sample;
import javax.swing.*;



public class GUIManagerExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIManagerExample");
        GUIManagerExample gui = new GUIManagerExample();
        frame.setContentPane(gui.panel1);
        frame.setJMenuBar(gui.menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton clearButton;
    private JButton CopyButton;
    private JTextArea textArea1;
    private JPanel panel1;

    private static JMenuBar menuBar;
    private JMenu menu, submenu;
    private JMenuItem menuItem, menuItemNew;
    private JRadioButtonMenuItem rbMenuItem;
    private JCheckBoxMenuItem cbMenuItem;
}




