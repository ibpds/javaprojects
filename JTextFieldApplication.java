import java.awt.BorderLayout;
import javax.swing.*;
public class JTextFieldApplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");
        JTextField textField = new JTextField("Hello World");
        frame.add(textField, BorderLayout.NORTH);
        textField.setHorizontalAlignment(JLabel.CENTER);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
