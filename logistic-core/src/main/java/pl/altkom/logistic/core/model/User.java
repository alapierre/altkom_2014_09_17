package pl.altkom.logistic.core.model;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

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

    @ManyToOne
    private Department department;


    
//    @OneToMany
//    private Collection<Customer> customers;
   
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
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
    
//    public String getCustomers() {
//        return customers;
//    }
//
//    public void setCustomers(Collection<Customer> customers) {
//        this.customers = customers;
//    }
    
    
}
