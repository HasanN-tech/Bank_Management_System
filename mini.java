package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {

    String pin;
    JButton button1,button2;

    mini(String pin){
        this.pin=pin;
        getContentPane().setBackground(new Color(255,204,204));
        setLayout(null);
        setSize(700, 650);
        setLocation(50, 40);
        setUndecorated(true);

        JLabel label1=new JLabel();
        label1.setBounds(20,140,400,250);
        add(label1);

        JLabel label2=new JLabel("TRANSACTION STATEMENT");
        label2.setFont(new Font("System",Font.BOLD,18));
        label2.setBounds(230,20,250,20);
        add(label2);

        JLabel label3=new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4=new JLabel();
        label4.setFont(new Font("System",Font.BOLD,12));
        label4.setBounds(30,430,400,20);
        add(label4);

        try {
            Conn c=new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * from login where pin='"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number: "+resultSet.getString("card_number").substring(0,4)+"XXXXXXXX"+resultSet.getString("card_number").substring(12));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            int balance = 0;
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin= '" + pin + "'");
            while (resultSet.next()) {
                label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br></html>");

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs. "+balance);

        }catch (Exception e){
            e.printStackTrace();
        }

        button1=new JButton("BACK");
        button1.setBounds(20,500,100,25);
        button1.addActionListener(this);
        button1.setForeground(Color.pink);
        button1.setBackground(Color.BLACK);
        add(button1);

        button2=new JButton("EXIT");
        button2.setBounds(200,500,100,25);
        button2.addActionListener(this);
        button2.setForeground(Color.pink);
        button2.setBackground(Color.BLACK);
        add(button2);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button2){
            System.exit(10);
        } else if (e.getSource()==button1) {
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args) {
        new mini("");
    }
}
