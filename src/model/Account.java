/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ramon
 */
public class Account {
    
    private int id;
    private String docNumber;
    private String type;
    private String expirationDate;
    private float value;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  
    public Date getDate() throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.parse(this.expirationDate);
    }
    
    public void setDate(Date expirationDate){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.expirationDate = df.format(expirationDate) ;
    }
    
}
