/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class WindowExample extends JFrame{
    JTextField t1,t2;
    JLabel l1;
    private WindowListener addWindowListener;
    public void setWindow(){
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        l1 = new JLabel("result");
        add(t1);
        add(t2);
        add(l1);
        t1.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                l1.setText("focus gained on textfield 1");
            }

            @Override
            public void focusLost(FocusEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                l1.setText("focus lost on textfield 1");
            }
        });
        //handling window
        addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("Window is opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("Window is closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("Window is opened");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("Window is Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("Window is Deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("Window is Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("Window is Deactivated");
            }
        });
    
        
    
        
          
       
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class WindowEventDemo {
    public static void main(String[] args) {
        WindowExample WE = new WindowExample();
        WE.setWindow();
    }
    
}
    

