package sample;
import javax.swing.*;



public class GUIManagerExample {

    public GUIManagerExample() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUIManagerExample");
        GUIManagerExample gui = new GUIManagerExample();
        frame.setContentPane(gui.panel1);
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton clearButton;
    private JButton AddTextButton;
    private JTextArea textArea1;
    private JPanel panel1;


    JTextArea textArea = new JTextArea(
            "You pressed the unforgivable button. " +
                    "You are now \"DOOMED\" to hell, " +
                    "if you're still reading it's because " +
                    "this text is so random it got you curious."
    );
    textArea.setLineWrap(true);
textArea.setWrapStyleWord(true);



    private static JMenuBar menuBar;
    private JMenu menu, submenu;
    private JMenuItem menuItem, menuItemNew;
    private JRadioButtonMenuItem rbMenuItem;
    private JCheckBoxMenuItem cbMenuItem;
}




