package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JButton next;

    JRadioButton r1,r2,m1,m2,m3;
    JDateChooser dateChooser;
    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    String first=" "+Math.abs(first4);
    JTextField textName,textFName,textEmail,textAdd,textCt,textPin,textSt;


    Signup(){

        super("Application Form");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(62,10,80,80);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO. "+ first);
        label1.setBounds(430,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setBounds(700,100,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,26));
        add(label2);

        JLabel label3=new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,24));
        label3.setBounds(950,150,600,30);
        add(label3);

        JLabel labelName=new JLabel("Name : ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(200,180,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,20));
        textName.setBounds(450,180,400,30);
        add(textName);


        JLabel labelfName=new JLabel("Father's Name : ");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(200,220,200,30);
        add(labelfName);

        textFName=new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,20));
        textFName.setBounds(450,220,400,30);
        add(textFName);


        JLabel DOB=new JLabel("Date Of Birth : ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(200,260,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(450,260,400,30);
        add(dateChooser);

        JLabel label6=new JLabel("Gender :");
        label6.setFont(new Font("Raleway",Font.BOLD,20));
        label6.setBounds(200,300,200,30);
        add(label6);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,20));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(450,300,100,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,20));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(750,300,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail=new JLabel("Email Address :");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(200,340,200,30);
        add(labelEmail);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,20));
        textEmail.setBounds(450,340,400,30);
        add(textEmail);

        JLabel labelMs=new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(200,380,200,30);
        add(labelMs);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,20));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(450,380,100,30);
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,20));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(600,380,150,30);
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,20));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(750,380,100,30);
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel labelAdd=new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(200,420,200,30);
        add(labelAdd);

        textAdd=new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,20));
        textAdd.setBounds(450,420,400,30);
        add(textAdd);

        JLabel labelCt=new JLabel("City :");
        labelCt.setFont(new Font("Raleway",Font.BOLD,20));
        labelCt.setBounds(200,460,200,30);
        add(labelCt);

        textCt=new JTextField();
        textCt.setFont(new Font("Raleway",Font.BOLD,20));
        textCt.setBounds(450,460,400,30);
        add(textCt);

        JLabel labelPin=new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(200,500,200,30);
        add(labelPin);

        textPin=new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,20));
        textPin.setBounds(450,500,400,30);
        add(textPin);


        JLabel labelSt=new JLabel("State :");
        labelSt.setFont(new Font("Raleway",Font.BOLD,20));
        labelSt.setBounds(200,540,200,30);
        add(labelSt);

        textSt=new JTextField();
        textSt.setFont(new Font("Raleway",Font.BOLD,20));
        textSt.setBounds(450,540,400,30);
        add(textSt);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(850,600,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(1390,750);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno=first;
        String name=textName.getText();
        String fname=textFName.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected())
            gender="male";
        else if (r2.isSelected())
            gender="female";

        String email=textEmail.getText();
        String marital=null;
        if (m1.isSelected())
            marital="Married";
        else if (m2.isSelected()) {
            marital="Unmarried";
        } else if (m3.isSelected()) {
            marital="Other";
        }

        String address=textAdd.getText();
        String city=textCt.getText();
        String pincode=textPin.getText();
        String state=textSt.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the Details");
            }else {
                Conn conn=new Conn();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                conn.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {

        new Signup();
    }
}
