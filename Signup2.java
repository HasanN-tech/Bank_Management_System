package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAd;
    JRadioButton r1,r2,e1,e2;
    JButton next;

    String formno;

    Signup2(String formno){

        super("Application Form");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(62,10,80,80);
        add(image);

        this.formno=formno;

        JLabel label1=new JLabel("Page 2");
        label1.setBounds(200,30,600,30);
        label1.setFont(new Font("Raleway",Font.BOLD,26));
        add(label1);

        JLabel label2=new JLabel("Additional Details");
        label2.setFont(new Font("Raleway",Font.BOLD,24));
        label2.setBounds(200,60,600,30);
        add(label2);

        JLabel label3=new JLabel("Religion : ");
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        label3.setBounds(200,180,100,30);
        add(label3);

        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox=new JComboBox<>(religion);
        comboBox.setBackground(new Color(246,222,46));
        comboBox.setFont(new Font("Raleway",Font.BOLD,20));
        comboBox.setBounds(450,180,400,30);
        add(comboBox);

        JLabel label4=new JLabel("Category :");
        label4.setFont(new Font("Raleway",Font.BOLD,20));
        label4.setBounds(200,220,150,30);
        add(label4);

        String Category[]={"General","OBC","SC","ST","Other"};
        comboBox2=new JComboBox<>(Category);
        comboBox2.setBackground(new Color(246,222,46));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,20));
        comboBox2.setBounds(450,220,400,30);
        add(comboBox2);

        JLabel label5=new JLabel("Income :");
        label5.setFont(new Font("Raleway",Font.BOLD,20));
        label5.setBounds(200,260,150,30);
        add(label5);

        String income[]={"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000","Above 10,00,000"};
        comboBox3=new JComboBox<>(income);
        comboBox3.setBackground(new Color(246,222,46));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 20));
        comboBox3.setBounds(450,260,400,30);
        add(comboBox3);

        JLabel label6=new JLabel("Educational :");
        label6.setFont(new Font("Raleway",Font.BOLD,20));
        label6.setBounds(200,300,150,30);
        add(label6);

        String educational[]={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBox4=new JComboBox<>(educational);
        comboBox4.setBackground(new Color(246,222,46));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,20));
        comboBox4.setBounds(450,300,400,30);
        add(comboBox4);

        JLabel label7=new JLabel("Occupation :");
        label7.setFont(new Font("Raleway",Font.BOLD,20));
        label7.setBounds(200,340,150,30);
        add(label7);

        String occupational[]={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        comboBox5=new JComboBox<>(occupational);
        comboBox5.setBackground(new Color(246,222,46));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,20));
        comboBox5.setBounds(450,340,400,30);
        add(comboBox5);

        JLabel label8=new JLabel("PAN Number :");
        label8.setFont(new Font("Raleway",Font.BOLD,20));
        label8.setBounds(200,380,150,30);
        add(label8);

        textPan=new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,20));
        textPan.setBounds(450,380,400,30);
        add(textPan);

        JLabel label9=new JLabel("Aadhar Number :");
        label9.setFont(new Font("Raleway",Font.BOLD,20));
        label9.setBounds(200,420,200,30);
        add(label9);

        textAd=new JTextField();
        textAd.setFont(new Font("Raleway",Font.BOLD,20));
        textAd.setBounds(450,420,400,30);
        add(textAd);

        JLabel label10=new JLabel("Senior Citizen :");
        label10.setFont(new Font("Raleway",Font.BOLD,20));
        label10.setBounds(200,460,200,30);
        add(label10);

        r1=new JRadioButton("YES");
        r1.setBackground(new Color(246,222,46));
        r1.setFont(new Font("Raleway",Font.BOLD,20));
        r1.setBounds(450,460,200,30);
        add(r1);

        r2=new JRadioButton("NO");
        r2.setBackground(new Color(246,222,46));
        r2.setFont(new Font("Raleway",Font.BOLD,20));
        r2.setBounds(800,460,200,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel label11=new JLabel("Existing Account :");
        label11.setFont(new Font("Raleway",Font.BOLD,20));
        label11.setBounds(200,500,200,30);
        add(label11);

        e1=new JRadioButton("YES");
        e1.setBackground(new Color(246,222,46));
        e1.setFont(new Font("Raleway",Font.BOLD,20));
        e1.setBounds(450,500,200,30);
        add(e1);

        e2=new JRadioButton("NO");
        e2.setBackground(new Color(246,222,46));
        e2.setFont(new Font("Raleway",Font.BOLD,20));
        e2.setBounds(800,500,200,30);
        add(e2);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        JLabel label12=new JLabel("Form No.:-");
        label12.setFont(new Font("Raleway",Font.BOLD,20));
        label12.setBounds(950,50,100,30);
        add(label12);

        JLabel label13=new JLabel(formno);
        label13.setFont(new Font("Raleway",Font.BOLD,20));
        label13.setBounds(1060,50,100,30);
        add(label13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,20));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(800,550,80,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(246, 222, 46));
        setLayout(null);
        setSize(1390,750);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent z) {

        String rel=(String) comboBox.getSelectedItem();
        String  cate=(String)  comboBox2.getSelectedItem();
        String inc=(String)  comboBox3.getSelectedItem();
        String edu=(String) comboBox4.getSelectedItem();
        String occ=(String) comboBox5.getSelectedItem();

        String pan=textPan.getText();
        String aadhar=textAd.getText();

        String s_c=null;
        if(r1.isSelected())
            s_c="Yes";
        else if (r1.isSelected())
            s_c="No";


        String eaccount=null;
        if(r1.isSelected())
            eaccount="Yes";
        else if (r1.isSelected())
            eaccount="No";


        try{

            if(textPan.getText().equals("") || textAd.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else {
                Conn conn1=new Conn();
                String q="insert into signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+s_c+"','"+eaccount+"')";
                conn1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
