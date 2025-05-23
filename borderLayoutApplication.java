import java.awt.BorderLayout;
import javax.swing.*;
public class borderLayoutApplication {
    public static void main(String[] args){
        JFrame frame = new JFrame("Java");

        JLabel labelNorth = new JLabel("north");
        labelNorth.setHorizontalAlignment(JLabel.CENTER);

        JLabel labelSouth = new JLabel("south");
        labelSouth.setHorizontalAlignment(JLabel.CENTER);

        JLabel labelWest = new JLabel("West");
        JLabel labelEast = new JLabel("East");
        JLabel labelCenter = new JLabel("Center");
        labelCenter.setHorizontalAlignment(JLabel.CENTER);

        frame.add(labelNorth, BorderLayout.NORTH);
        frame.add(labelSouth, BorderLayout.SOUTH);
        frame.add(labelWest, BorderLayout.WEST);
        frame.add(labelEast, BorderLayout.EAST);
        frame.add(labelCenter, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setVisible(true);
        }
}
