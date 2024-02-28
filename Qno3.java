
import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class Qno3  extends JFrame

{

    public Qno3 ()
    {

        setLayout(new GridLayout(4,1,10,20));

        JLabel inputLabel = new JLabel("Input any String: ");

        JTextField inputTextField = new JTextField(20);

        add(inputLabel);

        add(inputTextField);

        JLabel outputLabel = new JLabel("Output: ");

        JTextField outputTextField = new JTextField(20);

        add(outputLabel);

        add(outputTextField);

        outputTextField.setEditable(false);

        JButton checkPalindromeButton = new JButton("Check Palindrome");

        add(checkPalindromeButton);

        JButton reverseButton = new JButton("Reverse");

        add(reverseButton);

        JButton findVowelButton = new JButton("Find Vowel");

        add(findVowelButton);

        checkPalindromeButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                String userInput = inputTextField.getText();
                String reversed = new StringBuilder(userInput).reverse().toString();

                if (reversed.equalsIgnoreCase(userInput))
                {
                    outputTextField.setText("String is palindrome.");
                }
                else
                {
                    outputTextField.setText("String isn't a palindrome.");
                }
            }
        });

        reverseButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                String reversed = new StringBuilder(inputTextField.getText()).reverse().toString();

                outputTextField.setText("Reverse String is: "+ reversed);
            }

        });

        findVowelButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

               String input = inputTextField.getText();
               String vowels = input.replaceAll("[^aeiouAEIOU]", "");

               outputTextField.setText("Vowels are : "+ vowels);
            }

        });

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new Qno3 ();
    }

}