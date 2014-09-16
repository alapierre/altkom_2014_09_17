/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Size;

/**
 * 
 * @author Bartek Podsiadły
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class Customer extends BaseEntity {
    @Size(max=128)
    private String customerName;
    @Enumerated(EnumType.STRING)
    private CustomerType customerType;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
    
}
