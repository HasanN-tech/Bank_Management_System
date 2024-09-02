package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton sb,c;
    String formno;

    Signup3(String formno){
        this.formno=formno;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(62,10,80,80);
        add(image);

        JLabel label1=new JLabel("Page 3");
        label1.setBounds(200,50,600,30);
        label1.setFont(new Font("Raleway",Font.BOLD,26));
        add(label1);

        JLabel label2=new JLabel("Account Details");
        label2.setFont(new Font("Raleway",Font.BOLD,24));
        label2.setBounds(200,90,600,30);
        add(label2);

        JLabel label3=new JLabel("Account type : ");
        label3.setFont(new Font("Raleway",Font.BOLD,24));
        label3.setBounds(200,180,200,30);
        add(label3);

        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        r1.setBounds(200,220,180,30);
        r1.setBackground(new Color(215, 252, 252));
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        r2.setBounds(450,220,250,30);
        r2.setBackground(new Color(215, 252, 252));
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,18));
        r3.setBounds(200,260,180,30);
        r3.setBackground(new Color(215, 252, 252));
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,18));
        r4.setBounds(450,260,280,30);
        r4.setBackground(new Color(215, 252, 252));
        add(r4);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel label4=new JLabel("Card Number :");
        label4.setFont(new Font("Raleway",Font.BOLD,24));
        label4.setBounds(200,320,200,30);
        add(label4);

        JLabel label5=new JLabel("(Your 16-digit card number)");
        label5.setFont(new Font("Raleway",Font.BOLD,18));
        label5.setBounds(170,350,280,30);
        add(label5);

        JLabel label6=new JLabel("XXXX-XXXX-XXXX-7220");
        label6.setFont(new Font("Raleway",Font.BOLD,18));
        label6.setBounds(450,320,280,30);
        add(label6);

        JLabel label7=new JLabel("(It would appear in ATM card/chech book and Statement)");
        label7.setFont(new Font("Raleway",Font.BOLD,18));
        label7.setBounds(450,350,500,30);
        add(label7);

        JLabel label8=new JLabel("PIN :");
        label8.setFont(new Font("Raleway",Font.BOLD,24));
        label8.setBounds(200,410,100,30);
        add(label8);

        JLabel label9=new JLabel("XXXX");
        label9.setFont(new Font("Raleway",Font.BOLD,20));
        label9.setBounds(450,410,100,30);
        add(label9);

        JLabel label10=new JLabel("(4-digit password)");
        label10.setFont(new Font("Raleway",Font.BOLD,18));
        label10.setBounds(200,430,280,30);
        add(label10);

        JLabel label11=new JLabel("Service Required :");
        label11.setFont(new Font("Raleway",Font.BOLD,24));
        label11.setBounds(200,470,250,30);
        add(label11);

        c1=new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215, 252, 252));
        c1.setFont(new Font("Raleway",Font.BOLD,18));
        c1.setBounds(200,500,180,30);
        add(c1);

        c2=new JCheckBox("Net Banking");
        c2.setBackground(new Color(215, 252, 252));
        c2.setFont(new Font("Raleway",Font.BOLD,18));
        c2.setBounds(400,500,180,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215, 252, 252));
        c3.setFont(new Font("Raleway",Font.BOLD,18));
        c3.setBounds(200,530,180,30);
        add(c3);

        c4=new JCheckBox("Email Alerts");
        c4.setBackground(new Color(215, 252, 252));
        c4.setFont(new Font("Raleway",Font.BOLD,18));
        c4.setBounds(400,530,180,30);
        add(c4);

        c5=new JCheckBox("Chech Book");
        c5.setBackground(new Color(215, 252, 252));
        c5.setFont(new Font("Raleway",Font.BOLD,18));
        c5.setBounds(200,560,180,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(215, 252, 252));
        c6.setFont(new Font("Raleway",Font.BOLD,18));
        c6.setBounds(400,560,180,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I here by declare that the above entire details correct to the best of my knowledge." ,true);
        c7.setBackground(new Color(215, 252, 252));
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(200,610,980,30);
        add(c7);


        JLabel label12=new JLabel("Form No.:-");
        label12.setFont(new Font("Raleway",Font.BOLD,20));
        label12.setBounds(950,50,150,30);
        add(label12);

        JLabel label13=new JLabel(formno);
        label13.setFont(new Font("Raleway",Font.BOLD,20));
        label13.setBounds(1070,50,100,30);
        add(label13);

        sb=new JButton("Submit");
        sb.setFont(new Font("Raleway",Font.BOLD,20));
        sb.setBackground(Color.BLACK);
        sb.setForeground(Color.WHITE);
        sb.setBounds(350,650,100,30);
        sb.addActionListener(this);
        add(sb);

        c=new JButton("Cancle");
        c.setFont(new Font("Raleway",Font.BOLD,20));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(500,650,100,30);
        c.addActionListener(this);
        add(c);


        getContentPane().setBackground(new Color(215, 252, 252));
        setLayout(null);
        setSize(1390,750);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String atype=null;
        if (r1.isSelected())
            atype="Saving Account";
        else if (r2.isSelected()) {
            atype="Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype="Current Account";
        } else if (r4.isSelected()) {
            atype="Recurring Deposit Account";
        }
        Random ran=new Random();
        long first7=(ran.nextLong()%90000000L)+1409963000000000L;
        String cardno=""+Math.abs(first7);
        long first3=(ran.nextLong()%9000L)+1000L;
        String pin=""+Math.abs(first3);
        String fac="";
        if (c1.isSelected())
            fac +="ATM CARD";
        else if (c2.isSelected()) {
            fac +="Net Banking";
        } else if (c3.isSelected()) {
            fac +="Mobile Banking";
        } else if (c4.isSelected()) {
            fac +="Email Alerts";
        } else if (c5.isSelected()) {
            fac +="Chech Book";
        } else if (c6.isSelected()) {
            fac +="E-Statement";
        }
        try{
            if (e.getSource()==sb){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Conn c1=new Conn();
                    String q1="insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2="insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n PIN : "+pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
