/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Wojtek Jozkow
 */

public class Order {
    
    private Date placed;
    private Date delivered;
    
    //TODO wjozkow
    private String deliveryAddress;
    private PaymentMethod paymentMethod;
    
    public enum PaymentMethod{
        CASH,
        BANK_TRANSFER,
        BITCOIN        
    }
}
