/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

//import Data.classTaiKhoan;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;




/**
 *
 * @author Gin
 */
public class ConnectData {
    static String url = "jdbc:mysql://127.0.0.1:3306/";
    static String db = "qlsv";
    static String userDB = "root";
    static String passDB = "";
    static Connection conn = null;

    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url+db,userDB,passDB);
            return conn;
            //conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/qlsv","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            //Logger.getLogger(ConnectData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return null;
        }
        
    }

    
}
