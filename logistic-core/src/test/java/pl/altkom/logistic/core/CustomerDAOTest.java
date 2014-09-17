/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core;

import junit.framework.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.logistic.core.model.Address;
import pl.altkom.logistic.core.model.Customer;
import pl.altkom.logistic.core.model.CustomerType;
import pl.altkom.logistic.dao.springdata.CustomerDAO;

/**
 *
 * @author Bartek Podsiadły
 */
@ContextConfiguration("/core-test-context.xml")
@TransactionConfiguration(defaultRollback = false)
public class CustomerDAOTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    private CustomerDAO customerDao;
    
    @Test
    public void testMethods() {
        Address address = new Address();
        address.setStreet("pl. Bema");
        address.setNumber(2);
        
        Customer customer = new Customer();
        customer.setCustomerName("DHL");
        customer.setCustomerType(CustomerType.COMPANY);
        customer.setAddress(address);
        
        customer = customerDao.save(customer);
        Assert.assertNotNull(customer.getId());
        
        Iterable<Customer> customers = customerDao.findByCustomerNameLikeIgnoreCase("dh%");
        Assert.assertTrue(customers.iterator().hasNext());
        
        customers = customerDao.findByCustomerNameLikeIgnoreCaseAndCustomerType("dh%", CustomerType.PRIVATE);
        Assert.assertFalse(customers.iterator().hasNext());
        
        customers = customerDao.findByCustomerNameLikeIgnoreCaseAndCustomerType("dh%", CustomerType.COMPANY);
        Assert.assertTrue(customers.iterator().hasNext());
        
        customers = customerDao.findByCustomerNameLikeIgnoreCaseAndAddressStreetLikeIgnoreCase("dh%", "%Bem%");
        Assert.assertTrue(customers.iterator().hasNext());
        
        long count = customerDao.countByCustomerType(CustomerType.COMPANY);
        Assert.assertTrue(count > 0);
        
        customerDao.delete(customer);
    }
}
