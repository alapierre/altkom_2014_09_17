/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Currency;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.logistic.core.model.Car;
import pl.altkom.logistic.dao.springdata.CarDAO;
import pl.altkom.logistic.dao.springdata.InvoiceDAO;


/**
 *
 * @author instruktor
 */
@ContextConfiguration("/core-test-context.xml")
@TransactionConfiguration(defaultRollback = false)
public class TestSpringData extends AbstractTransactionalJUnit4SpringContextTests {
    
    @Autowired
    private CarDAO carDAO;
    
    
    @Autowired
    private InvoiceDAO invoiceDAO;
    
    @Test
    public void test() {
        System.out.println("11");
    }
    
    @Test
    public void testLoad() {
        Car car = carDAO.findOne(1);
        System.out.println("car " + car);
    }
    
    @Test
    public void createCar(){
        String carName = "Zaporozec";
        Car car = new Car();
        car.setName(carName);
        carDAO.save(car);
        //Car foundCar = carDAO.findByName(carName);
        //assertNotNull(foundCar);
    }
    
    @Test
    public void testSave() {
        
        Car car = new Car();
        car.setName("Testowy samochód");
        
        carDAO.save(car);
        
    }
    
    @Test
    public void testFindByName() {
        
        carDAO.findByNameLikeIgnoreCase("%t%");
        
    }
    
    @Test
    public void testFindByDate() {
        invoiceDAO.findByDate(Date.valueOf(LocalDate.now()));
    }

    @Test
    public void testFindByDateAfter() {
        invoiceDAO.findByDateAfter(Date.valueOf(LocalDate.now()));
    }

    @Test
    public void testFindByDateBefore() {
        invoiceDAO.findByDateBefore(Date.valueOf(LocalDate.now()));
    }
    
    @Test
    public void testFindByDateBetween() {
        invoiceDAO.findByDateBetween(Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now().plusDays(5)));
    }
    
    @Test
    public void testFindByInvoiceItemsCurrency() {
        invoiceDAO.findByInvoiceItemsCurrency(Currency.getInstance("EUR"));
    }
    
}
