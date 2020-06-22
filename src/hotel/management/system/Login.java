
package hotel.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Darshana Senevirathn
 */
public  class Login extends JFrame implements ActionListener{
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    
    Login(){
        
        l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        add(l2);
        
        t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        add(t1);
        
        t2 = new JPasswordField();
        t2.setBounds(150, 70, 150, 30);
        add(t2);
        
        b1 = new JButton("Login");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setBounds(40, 150, 120, 30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(180, 150, 120, 30);
        b2.setBackground(Color.red);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350, 10, 200, 200);
        add(l3);
        
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(600, 300, 600, 300);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource()==b1) {
           String username =  t1.getText();
           String password = t2.getText();
        }else if(ae.getSource()==b2){
            System.exit(0);
        }
        
    }
    
    public static void main(String[] args) {
       new Login();
    }
    
}
