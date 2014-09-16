/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core;
import java.util.Date;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.logistic.core.model.Car;
import pl.altkom.logistic.core.model.Order;
import pl.altkom.logistic.dao.CarDAO;
import pl.altkom.logistic.dao.OrderDAO;

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
    public void test() {
        System.out.println("11");
    }
    
    @Test
    public void testLoad() {
        Order order = orderDAO.load(1);
        System.out.println("order " + order);
    }
    
    @Test
    public void testSave() {
        
        Order order = new Order();
        order.setPlaced(new Date());
        
        orderDAO.save(order);
        
    }
    
}
