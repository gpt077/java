
package studentresume;

import java.awt.*;
import javax.swing.*;

public class StudentResume {
    JFrame jf;
    JLabel lname,lage,laddress;
    JTextField tname,tage;
    JRadioButton male,female;
    JTextArea taddress;
    ButtonGroup Gender;
    JButton bSubmit;
    
    public StudentResume(){
    jf  = new JFrame("Resume");
    lname = new JLabel("Enter your Name: ");
    lage = new JLabel("Enter your Age: ");
    laddress = new JLabel("Enter your Address: ");
    
    tname = new JTextField();
    tage = new JTextField();
    
    
    taddress = new JTextArea();
    
    male = new JRadioButton("Male");
    female = new JRadioButton("Female");
    Gender = new ButtonGroup();
    
    Gender.add(male);
    Gender.add(female);
    
    bSubmit = new JButton("Submit");
    
    jf.add(lname);
    jf.add(tname);
    
    jf.add(lage);
    jf.add(tage);
    
    jf.add(laddress);
    jf.add(taddress);
    
    jf.add(male);
    jf.add(female);
    
    jf.add(bSubmit);
    
    jf.setVisible(true);
    jf.setSize(300,300);
    jf.setLayout(new GridLayout(5,2));
    }
    public static void main(String[] args) {
        new StudentResume();
    }
    
}
