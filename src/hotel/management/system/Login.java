
package hotel.management.system;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Login extends JFrame {
    
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2;
    
    Login(){
        l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        add(l1);
        
        setBounds(500, 300, 600, 400);
        setVisible(true);
    }
    
    public static void main(String[] args) {
       new Login();
    }
    
}
