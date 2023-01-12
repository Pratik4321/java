
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Combo extends JFrame{
    JComboBox j1;
    JLabel l1,l2;
    JList j2;
    JTable tb1;
    public void setCombo(){
        String country[]={"Nepal","China","USA","India"};
        String courses[]={"BIM","BCA","CSIT","BHM","BBM","BBS","BBA","BE","Bsc"};
        //for table header
        String[] header = {"id","name","gender","faculty","grade"};
        String [][]data = {
            {"1","Ram","male","CSIT","A"},
            {"1","Ram","male","CSIT","A"},
            {"1","Ram","male","CSIT","A"},
            {"1","Ram","male","CSIT","A"},
            {"1","Ram","male","CSIT","A"},
            {"1","Ram","male","CSIT","A"},
            {"1","Ram","male","CSIT","A"},
            {"1","Ram","male","CSIT","A"},
            {"1","Ram","male","CSIT","A"},
            {"1","Ram","male","CSIT","A"},
            
        };
        j1 = new JComboBox(country);
        l1 = new JLabel("Result");
        l2 = new JLabel("Result for list");
        j2 = new JList(courses);
        tb1 = new JTable(data,header);
        tb1.setPreferredScrollableViewportSize(new Dimension(250,100));
        //to insert scroll bar
        JScrollPane scroll = new JScrollPane(j2);
        JScrollPane sc1 = new JScrollPane(tb1);
        add(sc1);
        add(j1);
        add(scroll);
        
        add(l1);
        
        //for multiple selection 0 for single selection, 1 for single selection 2 for multiple
        j2.setSelectionMode(2);
        //combox throws two event: action and itemevent
        j1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                 //to abstract selected item
                String country = (String)j1.getSelectedItem();
                l1.setText("Your Country is "+country);
                
            }
            
        });
        //event handling for JList
        //ListSelectionevent
        j2.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                String str="";
                ArrayList<String>st = (ArrayList)j2.getSelectedValuesList();
                for(String var:st){
                    str+=var;
                    
                }
                l2.setText("And your courses are " + str + ",");
            }
            
        
        });
        add(l2);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,500);
        setDefaultCloseOperation(3);
        
        
       
        
    }
}
public class ComboBoxDemo {
    public static void main(String[] args) {
        Combo c = new Combo();
        c.setCombo();
    }
}
