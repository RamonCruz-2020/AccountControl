/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
    public List<AccountPayable> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet ra = null;
        List<AccountPayable> aps = new ArrayList<AccountPayable>();
        try {
            stmt = con.prepareStatement("SELECT * FROM accountpayable;");
            ra = stmt.executeQuery();
            while(ra.next()){
               AccountPayable ap = new AccountPayable();
               ap.setId(ra.getInt("id"));
               ap.setProvider(ra.getString("provider"));
               ap.setDocNumber(ra.getString("docnumber"));
               ap.setType(ra.getString("type_"));
               ap.setDate(ra.getDate("expirationdate"));
               ap.setValue(ra.getFloat("value_"));
               ap.setStatus(ra.getString("status_"));
               aps.add(ap);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountPayableDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, ra);
        }
        return aps;
    }
    
    public void update(AccountPayable ap) throws ParseException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Object param = new java.sql.Timestamp(ap.getDate().getTime());
        try {
            stmt = con.prepareStatement("UPDATE accountpayable SET provider = ?, docnumber = ?, type_ = ?, expirationdate = ?, value_ = ?, status_ = ? WHERE id = ?;");
            stmt.setString(1, ap.getProvider());
            stmt.setString(2, ap.getDocNumber());
            stmt.setString(3, ap.getType());
            stmt.setObject(4, param);
            stmt.setFloat(5, ap.getValue());
            stmt.setString(6, ap.getStatus());
            stmt.setInt(7, ap.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void delete(AccountPayable ap) throws ParseException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Object param = new java.sql.Timestamp(ap.getDate().getTime());
        try {
            stmt = con.prepareStatement("DELETE FROM accountpayable WHERE id = ?;");
            stmt.setInt(1, ap.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
