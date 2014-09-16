/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.logistic.core.model.Car;
import pl.altkom.logistic.dao.CarDAO;

/**
 *
 * @author instruktor
 */
@ContextConfiguration("/core-test-context.xml")
@TransactionConfiguration(defaultRollback = false)
public class TestContext extends AbstractTransactionalJUnit4SpringContextTests {
    
    @Autowired
    private CarDAO carDAO;
    
    @Test
    public void test() {
        System.out.println("11");
    }
    
    @Test
    public void testLoad() {
        
        Car car = carDAO.load(1);
        
        System.out.println("car " + car);
        
    }
    
    @Test
    public void testSave() {
        Car car = new Car();
        final String carName = "Lamborgini GT";
        car.setName(carName);
        carDAO.save(car);
        
        car = carDAO.findByName(carName);
        
        Assert.assertNotNull(car);
    }
    
}
