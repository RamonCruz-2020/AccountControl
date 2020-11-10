/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountReceivableDAO;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import model.AccountReceivable;

/**
 *
 * @author Ramon
 */
public class AccountReceivableController {
    AccountReceivableDAO arDao = new AccountReceivableDAO();
    
    public void create(String client, String docNumber, String type, String expirationDate, float value, String status){
        try {
            this.arDao.create(setAccountReceivable(0, client, docNumber, type, expirationDate, value, status));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Controller: " + ex);
        }
    }
    public List<AccountReceivable> read(){
        return this.arDao.read();
    }
    public void update(int id, String client, String docNumber, String type, String expirationDate, float value, String status){
        try {
            this.arDao.update(setAccountReceivable(id, client, docNumber, type, expirationDate, value, status));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Controller: " + ex);
        }
    }
    public void delete(int id, String client, String docNumber, String type, String expirationDate, float value, String status){
        try {
            this.arDao.delete(setAccountReceivable(id, client, docNumber, type, expirationDate, value, status));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Controller: " + ex);
        }
    }
    
    private AccountReceivable setAccountReceivable(int id, String client, String docNumber, String type, String expirationDate, float value, String status){
        AccountReceivable ar = new AccountReceivable();
        ar.setId(id);
        ar.setClient(client);
        ar.setDocNumber(docNumber);
        ar.setType(type);
        ar.setExpirationDate(expirationDate);
        ar.setValue(value);
        ar.setStatus(status);
        return ar;
    }

}
