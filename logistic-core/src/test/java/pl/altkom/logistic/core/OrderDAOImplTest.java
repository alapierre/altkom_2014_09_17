/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.logistic.core.model.Customer;
import pl.altkom.logistic.core.model.Order;
import pl.altkom.logistic.dao.springdata.OrderDAO;



/**
 *
 * @author instruktor
 */
@ContextConfiguration("/core-test-context.xml")
@TransactionConfiguration(defaultRollback = false)
public class OrderDAOImplTest extends AbstractTransactionalJUnit4SpringContextTests {
    
    @Autowired
    private OrderDAO orderDAO;
    
    
    @Test
    public void testLoad() {
        Order order = orderDAO.findOne(1);
        System.out.println("order " + order);
    }
    
    @Test
    public void testSave() {
        
        Order order = new Order();
        order.setPlaced(new Date());
        orderDAO.save(order);
    }
    
    @Test
    public void testSaveWithCustomer() {
        
        Order order = new Order();
        order.setPlaced(new Date());
        Customer customer = new Customer();
        customer.setCustomerName("Piotr Pietrzyk");
        order.setCustomer(customer);
        orderDAO.save(order);
        
    }

    @Test
    public void testFindByCustomerCustomerName(){
        List<Order> results = orderDAO.findByCustomerCustomerName("Piotr Pietrzyk");
        System.out.println("size: "+results.size());
    }

    @Test
    public void testFindByPlacedBetween(){
        Calendar from = new GregorianCalendar(2013, 1, 1);
        Calendar to = new GregorianCalendar(2014, 12, 12);
        List<Order> results = orderDAO.findByPlacedBetween(from.getTime(),to.getTime());
        System.out.println("size placed: "+results.size());
    }

}
