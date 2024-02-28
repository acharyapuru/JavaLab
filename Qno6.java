import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Qno6 extends JFrame {

    JLabel l1, l2, res;
    JTextField num1,num2;

    public Qno6(){
        setLayout(new GridLayout(3,2));
        setSize(400,300);

        l1 = new JLabel("Enter 1st number ");
        num1 = new JTextField();
        add(l1);
        add(num1);

        l2 = new JLabel("Enter 2nd number");
        num2 = new JTextField();
        add(l2);
        add(num2);

        res = new JLabel("Result");
        add(res);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                int sum = n1 + n2;
                res.setText("Sum : "+ sum);
            }
            public void mouseReleased(MouseEvent e){
                int n1 = Integer.parseInt(num1.getText());
                int n2 = Integer.parseInt(num2.getText());
                int difference = n1 - n2;
                res.setText("Difference : "+ difference);
            }
        });

        setVisible(true);
    }
    public static void main(String[] args){
        new Qno6();
    }
}
