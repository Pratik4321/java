package unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenuBar extends JFrame{
    JMenuBar mb; //to create menubar
    JMenu m1, m2 , m3; //to create item in menubar
    JMenuItem f1, f2, f3; //item list for file menu
    JMenuItem e1, e2, e3; //item list for edit 
    JMenuItem v1,v2,v3; //item list for view menu
    public void setMenu(){
        mb = new JMenuBar();
        m1 = new JMenu("file");
        m2 = new JMenu("Edit");
        m3 = new JMenu("view");
        f1 = new JMenuItem("new");
        f2 = new JMenuItem("new window");
        f3 = new JMenuItem("new open");
        e1 = new JMenuItem("copy");
        e2 = new JMenuItem("cut");
        e3 = new JMenuItem("paste");
        v1 = new JMenuItem("zoom");
        v2 = new JMenuItem("status");
        v3 = new JMenuItem("cancel");
        //adding menuitem to menu
        m1.add(f1);
        m1.add(f2);
        m1.add(f3);
        
        m2.add(e1);
        m2.add(e2);
        m2.add(e3);
        
        m3.add(v1);
        m3.add(v2);
        m3.add(v3);
        
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        add(mb);
        
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT,25,20));
        setSize(400,400);
        setDefaultCloseOperation(3);
        
    }
}



public class MenuDemo {
    public static void main(String[] args) {
        MenuBar mb = new MenuBar();
        mb.setMenu();
    }
    
}
