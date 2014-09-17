/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.logistic.core.model.Car;
import pl.altkom.logistic.core.model.User;
import pl.altkom.logistic.dao.springdata.CarDAO;
import pl.altkom.logistic.dao.springdata.UserDAO;


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
    private UserDAO userDAO;
    
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
    public void createUser() {
        Car c1 = new Car();
        c1.setName("tarpan");
        
        
        
        User u1 = new User();
        u1.setFirstName("lukasz");
        u1.setLastName("skrzypczak");
        List<Car> arrayList = new ArrayList<>();
        arrayList.add(c1);
        u1.setCars(arrayList);
        
        userDAO.save(u1);
        carDAO.save(c1);
//        userDAO.flush();
        
        
        Iterable<User> result1 = userDAO.findByLastNameLikeIgnoreCase("skrzypczak");
        assertTrue(result1.iterator().hasNext());
        Iterable<User> result2 = userDAO.findByLastNameAndFirstName("skrzypczak","lukasz");
        assertTrue(result2.iterator().hasNext());
        Iterable<User> result3 = userDAO.findByFirstNameLikeAndCarsNameLike("lukasz","tarpan");
        assertTrue(result3.iterator().hasNext());
        Iterable<User> result4 = userDAO.findByLastNameLikeAndCarsNameLike("skrzy","tarpan");
        assertTrue(result4.iterator().hasNext());
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
    
}
