
package unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class BorderDemo extends JFrame{
    JButton b1, b2 ,b3, b4, b5;
    public void setBorder(){
        b1 = new JButton("North");
        b2 = new JButton("South");
        b3 = new JButton("East");
        b4 = new JButton("west");
        b5 = new JButton("center");
        setVisible(true);
        setLayout(new BorderLayout());
        setSize(400,400);
        setDefaultCloseOperation(3);
        add(b1, BorderLayout.NORTH); //adding b1 into north side
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);
    }
    
}

public class BorderLayoutDemo {
    public static void main(String[] args) {
        BorderDemo bd = new BorderDemo();
        bd.setBorder();
    }
    
}
