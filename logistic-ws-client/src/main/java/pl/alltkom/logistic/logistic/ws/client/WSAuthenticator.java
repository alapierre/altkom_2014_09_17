/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.alltkom.logistic.logistic.ws.client;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class WSAuthenticator extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        
        PasswordAuthentication pass = new PasswordAuthentication("admin", "test.112".toCharArray());
        
        return pass;
    }
    
    
    
}
