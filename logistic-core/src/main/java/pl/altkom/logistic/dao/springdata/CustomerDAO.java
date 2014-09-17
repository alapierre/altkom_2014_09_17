/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao.springdata;

import org.springframework.data.repository.CrudRepository;
import pl.altkom.logistic.core.model.Customer;
import pl.altkom.logistic.core.model.CustomerType;

/**
 *
 * @author Bartek Podsiadły
 */
public interface CustomerDAO extends CrudRepository<Customer, Integer>{
    Iterable<Customer> findByCustomerNameLikeIgnoreCase(String name);
    Iterable<Customer> findByCustomerNameLikeIgnoreCaseAndAddressStreetLikeIgnoreCase(String customerName, String address);
    Iterable<Customer> findByCustomerNameLikeIgnoreCaseAndCustomerType(String name, CustomerType type);
    long countByCustomerType(CustomerType type);
}
