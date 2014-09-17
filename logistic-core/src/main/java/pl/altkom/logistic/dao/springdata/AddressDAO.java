/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao.springdata;

import org.springframework.data.repository.CrudRepository;
import pl.altkom.logistic.core.model.Address;

/**
 *
 * @author Malgorzata Zachara
 */
public interface AddressDAO extends CrudRepository<Address, Integer>{
    public Iterable<Address> findByStreetAndNumber(String street, Integer number);
    
    public Iterable<Address> findByStreetAndNumberLessThan(String street, Integer number);
}
