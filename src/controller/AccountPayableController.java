/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountPayableDAO;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import model.AccountPayable;

/**
 *
 * @author Ramon
 */
public class AccountPayableController {

    AccountPayableDAO apDao = new AccountPayableDAO();
    
    public void create(String provider, String docNumber, String type, String expirationDate, float value, String status){
        try {
            this.apDao.create(setAccountPayable(0, provider, docNumber, type, expirationDate, value, status));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Controller: " + ex);
        }
    }
    public List<AccountPayable> read(){
        return this.apDao.read();
    }
    public void update(int id, String provider, String docNumber, String type, String expirationDate, float value, String status){
        try {
            this.apDao.update(setAccountPayable(id, provider, docNumber, type, expirationDate, value, status));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Controller: " + ex);
        }
    }
    public void delete(int id, String provider, String docNumber, String type, String expirationDate, float value, String status){
        try {
            this.apDao.delete(setAccountPayable(id, provider, docNumber, type, expirationDate, value, status));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Controller: " + ex);
        }
    }
    
    private AccountPayable setAccountPayable(int id, String provider, String docNumber, String type, String expirationDate, float value, String status){
        AccountPayable ap = new AccountPayable();
        ap.setId(id);
        ap.setProvider(provider);
        ap.setDocNumber(docNumber);
        ap.setType(type);
        ap.setExpirationDate(expirationDate);
        ap.setValue(value);
        ap.setStatus(status);
        return ap;
    }

}
