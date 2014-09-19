/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.alltkom.logistic.logistic.ws.client;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */

public class WSAuthenticator extends Authenticator {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @PostConstruct
    public void init(){
        Authenticator.setDefault(this);
    }
    
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        
        //"admin", "test.112"
        PasswordAuthentication pass = new PasswordAuthentication(username, password.toCharArray());
        
        return pass;
    }
    
    
    
}
