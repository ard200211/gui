package rapot;
import jadwal.*;
import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arif Rachmat Darmawa
 */
public class Config {
    static final String db_url = "jdbc:mysql://localhost/db10120235sekolah";
    static final String username = "root";
    static final String password = "";
    static final String classDriver = "com.mysql.jdbc.Driver";
    
    static Connection conn;
    static Statement stmt;
    static boolean isConnected;

    
    public void dbConnect(){
        try {
            Class.forName(classDriver);
            conn = DriverManager.getConnection(db_url,username,password);
            isConnected = true;
        } catch (ClassNotFoundException | SQLException e) {
            isConnected = false;
        }
    }

}
