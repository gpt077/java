package databasegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseGUI extends JFrame implements ActionListener {

JTextField tName, tRno, tprogram;
JButton bAdd, bExit;
Connection con;

DatabaseGUI() {
JLabel jName = new JLabel("Enter Student Name: ");
JLabel jRno = new JLabel("Enter Roll Number: ");

JLabel jlContact = new JLabel("Enter Student program: ");

tName = new JTextField(20);
tRno = new JTextField(5);
tprogram = new JTextField(5);

bAdd = new JButton("Add Details");



this.setLayout(new GridLayout(4, 2));
add(jName);
add(tName);
add(jRno);
add(tRno);
add(jlContact);
add(tprogram);

bAdd.addActionListener(this);


add(bAdd);

}

public void actionPerformed(ActionEvent ae) {
if (ae.getSource() == bAdd) {
try {
Class.forName("org.apache.derby.jdbc.ClientDriver");
con = DriverManager.getConnection("jdbc:derby://localhost:1527/datagui", "sycsa1",
"sycsa1");

String sname = tName.getText();
int rno = Integer.parseInt(tRno.getText());
String pro = tprogram.getText();

PreparedStatement ps = con.prepareStatement("insert into gui values (?,?,?)");
ps.setInt(1, rno);
ps.setString(2, sname);
ps.setString(3, pro);

ps.executeUpdate();
System.out.println("Record Added");

} catch (ClassNotFoundException ex) {
Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
} catch (SQLException ex) {
Logger.getLogger(DatabaseGUI.class.getName()).log(Level.SEVERE, null, ex);
}

}


}


public static void main(String[] args) {
DatabaseGUI sd = new DatabaseGUI();
sd.setSize(300, 300);
sd.setVisible(true);


}

}