/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author edanP
 */
public class database {
    Connection db = null;
    
    public Connection connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            db = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dbtest", "root", "");
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
        }
        return db;
    }
}
