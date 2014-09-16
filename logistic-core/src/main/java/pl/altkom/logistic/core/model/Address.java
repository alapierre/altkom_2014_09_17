/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import javax.persistence.Entity;

/**
 *
 * @author Malgorzata Zachara
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class Address extends BaseEntity {
    
    private String street;
    private Integer number;
    
    
    
    public Address() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
