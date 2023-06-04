/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Home;

import static Home.DBConnection.connectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class user {

    String Fname;
    String Lname;
    String UserName;
//    int EventJoin;
    public user ()  {} ;
    public user(String name, String surname, String username) {
        Fname = name;
        Lname = surname;
        UserName = username;
    }

    public void createObj(String un) {

        Connection conn = connectDB();
        user_extended uu = new user_extended() ;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from userinfo");
            while (rs.next()) {
                String Fname = (String) rs.getString("Fname");
                String Lname = (String) rs.getString("Lname");
                String username = (String) rs.getString("user");
                user u = new user(Fname, Lname, username);  
                uu.add(u) ; 
            }
            rs.close();
            stmt.close();
            conn.close(); 
            uu.compare(un);
            uu.printstring() ;
        } 
    
        catch (Exception e) { e.printStackTrace();} 
    }
    

    public void printoString()  {
        System.out.println(Fname);
        System.out.println(Lname);
        System.out.println(UserName);
    }


}
