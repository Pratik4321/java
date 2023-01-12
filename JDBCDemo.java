/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit2;
import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) throws SQLException {
        connection conn;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:7882/db_nccsB";
            String username = "root";
            String password = "";
         
            conn = (connection) DriverManager.getConnection(url,username,password);
            System.out.println("connected");
            Statement st = conn.createStatement();
            //query to create table
            String tblQuery = "Create table tbl_emp (id int primary key,"
                    +"name varchar(50),address varchar(50),gender varchar(50),"
                    +"position varchar(50), salary varchar(50))";
            st.execute(tblQuery);
            System.out.println("table created");
            
            
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException s){
            System.out.println(s);
        }
                
    }

   
}


