/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author malfin
 */
public class koneksi {
     private static Connection con;
     public static Connection KoneksiDB() throws SQLException {
        if (con == null) {
        try {

            String DB ="jdbc:mysql://localhost:3306/db_mobil";
            String user="root";
            String pass="password";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = (Connection) DriverManager.getConnection(DB,user,pass);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal");
        }
    }
         return con;

    }
}
