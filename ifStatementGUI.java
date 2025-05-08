import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
public class ifStatementGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java");

        final JLabel scoreLabel = new JLabel("Informe seu score");
        final JTextField scoreTxT = new JTextField();
        final JLabel res = new JLabel("");

        JButton submit = new JButton("Verificar");
        submit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
            int score = Integer.parseInt(scoreTxT.getText());

            if(score >= 5){
                res.setText("Excelente");
            }else if(score == 4){
                res.setText("Bom");
            }else{
                res.setText("Precisa melhorar");
            }
           } 
        });

        frame.setLayout(new GridLayout(2,2));
        frame.add(scoreLabel);
        frame.add(res);
        frame.add(scoreTxT);
        frame.add(submit);
        frame.setSize(500,100);
        frame.setVisible(true);
    }
}
