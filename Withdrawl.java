package bank.management.system;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;

    TextField textField;

    JButton b1,b2;

    Withdrawl(String pin){
        this.pin=pin;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1390,750,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1390,750);
        add(l3);

        JLabel l1=new JLabel("MAXIMUM WITHDRAWL IS Rs.10,000");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,18));
        l1.setBounds(380,160,400,35);
        l3.add(l1);

        JLabel l2=new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,18));
        l2.setBounds(380,200,400,35);
        l3.add(l2);

        textField=new TextField();
        textField.setBounds(380,240,340,30);
        textField.setFont(new Font("Raleway",Font.BOLD,20));
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        l3.add(textField);

        b1=new JButton("WITHDRAW");
        b1.setBounds(600,330,150,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("BACK");
        b2.setBounds(600,370,150,30);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(1390,750);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdrawl");
                } else {
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin='" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','withdrawl','" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        }else if (e.getSource()==b2){
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}
