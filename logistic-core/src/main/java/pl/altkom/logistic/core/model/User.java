package pl.altkom.logistic.core.model;


import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

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

//    @ManyToMany
//    private Collection<Customer> customers;
    
    @OneToMany
    private Collection<Car> cars;

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
    
    public Collection<Car> getCars() {
        return cars;
    }

    public void setCars(Collection<Car> cars) {
        this.cars = cars;
    }
    
    
}
