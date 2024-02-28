import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Qno2 extends JFrame {
    private JLabel a, b, r, result;
    private JTextField at, bt, rt;
    

    public Qno2(){
        setTitle("Sum Calculator");
        setLayout(new GridLayout(4,2,30,20));
        setSize(400,400);
        
        a = new JLabel("Enter First Number");
        at = new JTextField(10);
        add(a);
        add(at);

        b = new JLabel("Enter Second Number");
        bt = new JTextField(10);
        add(b);
        add(bt);

        r = new JLabel("Enter Any Key");
        rt = new JTextField();
        add(r);
        add(rt);


        result = new JLabel();
        add(result);
        

        rt.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                int x = Integer.parseInt(at.getText());
                int y = Integer.parseInt(bt.getText());
                int sum = x+y;
                result.setText("The sum is : " + String.valueOf(sum));
            }
        });

        setVisible(true);
        
    }
    public static void main(String[] args){
        new Qno2();
    }
}
