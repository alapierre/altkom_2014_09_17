/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Wojtek Jozkow
 */
@Entity
@Table(name="orderTable")
@SuppressWarnings("PersistenceUnitPresent")
public class Order extends BaseEntity {
    
    private Date placed;
    private Date delivered;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Address deliveryAddress;
    
    @Enumerated(EnumType.ORDINAL) 
    private PaymentMethod paymentMethod;


    public Order() {
        
    }
    
    
    
    public enum PaymentMethod {
        CASH,
        BANK_TRANSFER,
        BITCOIN        
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    
    public Date getPlaced() {
        return placed;
    }

    public void setPlaced(Date placed) {
        this.placed = placed;
    }

    public Date getDelivered() {
        return delivered;
    }

    public void setDelivered(Date delivered) {
        this.delivered = delivered;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    
}
