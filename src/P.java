import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P extends JFrame {

    private JTextArea Calculation;
    private JTextField Number;
    private JTextField Percent;
    private JTextField Repeat;
    private JTextArea Information;
    private JButton CLRButton;
    private JButton doItButton1;
    private JPanel mainPanel;

    public P (){

        setTitle("Welcome");
        setSize(460, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(mainPanel);
        Information.setText("This program will help you take a percentage out of a number \n for the number of times you want");
        Calculation.setText("The Result");
        doItButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int base = Number.getX();
                int count = 1;

                for (int i = 0; i < Repeat.getColumns(); i++) {
                    System.out.print(count + " - ");
                    count++;
                    int calculation = base * (Percent.getY() / 100);
                    int result = base - calculation;
                    base = result;

                    Calculation.setText(String.valueOf(result));

                }
            }
        });
        CLRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Number.setText("");
                Percent.setText("");
                Repeat.setText("");
                Calculation.setText("");
            }
        });
    }
    public static void main(String[] args) {
        P mainFrame = new P();
    }
}
