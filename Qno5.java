import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Qno5 extends JFrame implements ActionListener{
    private JLabel pl, tl, rl;
    private JTextField principal, time, rate, result;
    private JButton btn;

    public Qno5(){
        setLayout(new GridLayout(4,2));
        setSize(300,300);

        pl = new JLabel("Principal");
        principal = new JTextField(10);
        add(pl);
        add(principal);

        tl = new JLabel("Time");
        time = new JTextField(10);
        add(tl);
        add(time);

        rl = new JLabel("Rate");
        rate = new JTextField(10);
        add(rl);
        add(rate);

        btn = new JButton("Simple Interest");
        add(btn);

        result = new JTextField();
        result.setEditable(false);
        add(result);

        btn.addActionListener(this);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn){
            Double p = Double.parseDouble(principal.getText());
            Double t = Double.parseDouble(time.getText());
            Double r = Double.parseDouble(rate.getText());
            Double SI = (p*t*r)/100;

            result.setText(String.valueOf(SI));
        }
    }
    public static void main(String[] args){
        new Qno5();
    }
}
