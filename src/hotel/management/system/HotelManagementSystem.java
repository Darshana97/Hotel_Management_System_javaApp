package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HotelManagementSystem extends JFrame {

    HotelManagementSystem() {
        setBounds(300, 200, 1366, 565);
//        setSize(400, 400);

//        setLocation(300, 300);
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
        JLabel l1 = new JLabel(il);
        l1.setBounds(0, 0, 1366, 565);
        add(l1);

        JLabel l2 = new JLabel("Hotel Management System");
        l2.setBounds(20, 430, 1000, 90);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif", Font.PLAIN, 70));
        l1.add(l2);
        
        setLayout(null);
        setVisible(true);
        
        while (true) {   
            l2.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                l2.setVisible(true);
            }
            l2.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
            
        }

        
    }

    public static void main(String[] args) {
        new HotelManagementSystem();
    }

}
