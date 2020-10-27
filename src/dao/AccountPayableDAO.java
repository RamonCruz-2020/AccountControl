/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import model.AccountPayable;

/**
 *
 * @author Ramon
 */
public class AccountPayableDAO {
    
    
    
    public void create(AccountPayable ap) throws ParseException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Object param = new java.sql.Timestamp(ap.getDate().getTime());
        try {
            stmt = con.prepareStatement("INSERT INTO accountpayable (provider, docnumber, type_, expirationdate, value_, status_) VALUES (?,?,?,?,?,?);");
            stmt.setString(1, ap.getProvider());
            stmt.setString(2, ap.getDocNumber());
            stmt.setString(3, ap.getType());
            stmt.setObject(4, param);
            stmt.setFloat(5, ap.getValue());
            stmt.setString(6, ap.getStatus());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
