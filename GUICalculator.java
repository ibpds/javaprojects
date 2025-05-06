import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
public class GUICalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");

        final JTextField aText = new JTextField("");
        final JTextField bText = new JTextField("");
        final JLabel equalLabel = new JLabel("="); 
        final JLabel resultLabel = new JLabel("0.0");

        JButton addButton = new JButton("+");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(aText.getText());
                int b = Integer.parseInt(bText.getText());
                int result = a + b;
                resultLabel.setText(Integer.toString(result));
            }
        });

        JButton subButton = new JButton("-");
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(aText.getText());
                int b = Integer.parseInt(bText.getText());
                int result = a - b;
                resultLabel.setText(Integer.toString(result));
            }
        });

        JButton multButton = new JButton("X");
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(aText.getText());
                int b = Integer.parseInt(bText.getText());
                int result = a * b;
                resultLabel.setText(Integer.toString(result));
            }
        });

        JButton divButton = new JButton(":");
        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(aText.getText());
                int b = Integer.parseInt(bText.getText());
                int result = a / b;
                resultLabel.setText(Integer.toString(result));
            }
        });
        frame.setLayout(new GridLayout(2,4));
        frame.add(aText);
        frame.add(bText);
        frame.add(equalLabel);
        frame.add(resultLabel);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(multButton);
        frame.add(divButton);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
