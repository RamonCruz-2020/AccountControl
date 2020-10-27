/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountPayableDAO;
import java.text.ParseException;
import javax.swing.JOptionPane;
import model.AccountPayable;

/**
 *
 * @author Ramon
 */
public class AccountPayableController {
    
    public void save(String provider, String docNumber, String type, String expirationDate, float value, String status){
        AccountPayable ap = new AccountPayable(provider, docNumber, type, expirationDate, value, status);
        AccountPayableDAO apDao = new AccountPayableDAO();
        try {
            apDao.create(ap);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Controller: " + ex);
        }
    }
    
}
