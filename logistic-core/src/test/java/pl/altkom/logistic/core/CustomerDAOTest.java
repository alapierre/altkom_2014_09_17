/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.logistic.core.model.CustomerType;
import pl.altkom.logistic.dao.springdata.CustomerDAO;

/**
 *
 * @author Bartek Podsiadły
 */
@ContextConfiguration("/core-test-context.xml")
@TransactionConfiguration(defaultRollback = true)
public class CustomerDAOTest extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    private CustomerDAO customerDao;
    
    @Test
    public void testFindByName() {
        
        customerDao.findByCustomerNameLikeIgnoreCase("%t%");
        
    }
    
    @Test
    public void testCountByCustomerType() {
        customerDao.countByCustomerType(CustomerType.PRIVATE);        
    }
    
    @Test
    public void testCountByCustomerNameAndCustomerType() {
        customerDao.findByCustomerNameLikeAndCustomerType("%t%", CustomerType.COMPANY);
    }
}
