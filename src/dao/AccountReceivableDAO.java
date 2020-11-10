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
import model.AccountReceivable;

/**
 *
 * @author Ramon
 */
public class AccountReceivableDAO {
    
    
    
    public void create(AccountReceivable ar) throws ParseException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Object param = new java.sql.Timestamp(ar.getDate().getTime());
        try {
            stmt = con.prepareStatement("INSERT INTO accountreceivable (client_, docnumber, type_, expirationdate, value_, status_) VALUES (?,?,?,?,?,?);");
            stmt.setString(1, ar.getClient());
            stmt.setString(2, ar.getDocNumber());
            stmt.setString(3, ar.getType());
            stmt.setObject(4, param);
            stmt.setFloat(5, ar.getValue());
            stmt.setString(6, ar.getStatus());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
        
    public List<AccountReceivable> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet ra = null;
        List<AccountReceivable> ars = new ArrayList<AccountReceivable>();
        try {
            stmt = con.prepareStatement("SELECT * FROM accountreceivable;");
            ra = stmt.executeQuery();
            while(ra.next()){
               AccountReceivable ar = new AccountReceivable();
               ar.setId(ra.getInt("id"));
               ar.setClient(ra.getString("client_"));
               ar.setDocNumber(ra.getString("docnumber"));
               ar.setType(ra.getString("type_"));
               ar.setDate(ra.getDate("expirationdate"));
               ar.setValue(ra.getFloat("value_"));
               ar.setStatus(ra.getString("status_"));
               ars.add(ar);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountReceivableDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, ra);
        }
        return ars;
    }
    
    public void update(AccountReceivable ar) throws ParseException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        Object param = new java.sql.Timestamp(ar.getDate().getTime());
        try {
            stmt = con.prepareStatement("UPDATE accountreceivable SET client_ = ?, docnumber = ?, type_ = ?, expirationdate = ?, value_ = ?, status_ = ? WHERE id = ?;");
            stmt.setString(1, ar.getClient());
            stmt.setString(2, ar.getDocNumber());
            stmt.setString(3, ar.getType());
            stmt.setObject(4, param);
            stmt.setFloat(5, ar.getValue());
            stmt.setString(6, ar.getStatus());
            stmt.setInt(7, ar.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void delete(AccountReceivable ar) throws ParseException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM accountreceivable WHERE id = ?;");
            stmt.setInt(1, ar.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
