/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ramon
 */
public class AccountReceivable extends Account {
    
    private String Client;

    public AccountReceivable() {
    }

    public String getClient() {
        return Client;
    }

    public void setClient(String Client) {
        this.Client = Client;
    }
    
}
