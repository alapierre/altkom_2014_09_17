package pl.altkom.logistic.core.model;


import javax.persistence.Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukasz s
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class User extends BaseEntity{
    
    private String firstName;
    
    private String lastName;

//    @OneToMany
//    private Collection<Customer> customers;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
    
}
