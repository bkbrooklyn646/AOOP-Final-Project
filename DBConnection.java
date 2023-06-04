/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Home; 
import java.sql.*; 

/**
 *
 * @author Asus
 */
public class DBConnection { 
    static String db_name ="userdb"; 
    static String user = "root"; 
    static String pass = "root0000" ; 
    static String hostName = "localhost" ; 
    static String db_driver = "com.mysql.cj.jdbc.Driver"; 
    
    public static void main(String[] args) { 
        connectDB();
    }
    
    public static Connection connectDB(){ 
        try{ 
            Class.forName(db_driver) ; //indicate driver 
            String url="jdbc:mysql://"+hostName+"/"+db_name ;  
            Connection connect = DriverManager.getConnection(url,user,pass) ; //connect to db
            System.out.println("Connected to Db successfuly"); 
            
            return connect ;
        }catch(Exception ex) {  
            System.out.println("There were wrrors while connecting to DB."); 
            ex.printStackTrace();
            return null; 
        }
    } 
    
//    public static void showData() { 
//        Connection conn = connectDB(); 
//        try{ 
//            Statement stmt = conn.createStatement(); 
//            ResultSet rs = stmt.executeQuery("select * from userinfo") ; 
//            while (rs.next()) { 
//                String Fname = rs.getString("Fname") ;
//                String Lname = rs.getString("Lname") ;
//                String username = rs.getString("user") ;
//                user u = new user(Fname,Lname,username);
//            }
//            rs.close();
//            stmt.close(); 
//            conn.close() ;
//        } 
//        catch(Exception e) ; { 
//            e.printStackTrace();
//        }
//        }
   
    
//    public static void insertDB() { 
//        String sql = "insert into userdb value()"
//    }
}
