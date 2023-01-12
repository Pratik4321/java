
package unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GridExample extends JFrame{
    JButton b1, b2 ,b3, b4, b5,b6;
    public void setBorder(){
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");
        b5 = new JButton("button5");
        b6 = new JButton("button6");
        setVisible(true);
        setLayout(new GridLayout(3,3)); //parameter specify row and column
        setSize(400,400);
        setDefaultCloseOperation(3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
       
    }
    
}

public class GridLayoutDemo {
    public static void main(String[] args) {
        GridExample gd = new GridExample();
        gd.setBorder();
    }
    
}
