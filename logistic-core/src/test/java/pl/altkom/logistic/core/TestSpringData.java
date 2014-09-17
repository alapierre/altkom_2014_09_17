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
import pl.altkom.logistic.core.model.Car;
import pl.altkom.logistic.core.model.TaxRate;
import pl.altkom.logistic.dao.springdata.CarDAO;
import pl.altkom.logistic.dao.springdata.TaxRateDAO;

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
    private TaxRateDAO taxRateDAO;

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
    public void createCar() {
        String carName = "Zaporozec";
        Car car = new Car();
        car.setName(carName);
        carDAO.save(car);
        //Car foundCar = carDAO.findByName(carName);
        //assertNotNull(foundCar);
    }

    @Test
    public void createTaxRate() {
        TaxRate tr = new TaxRate();
        tr.setRate(18);
        taxRateDAO.save(tr);
        tr = new TaxRate();
        tr.setRate(22);
        taxRateDAO.save(tr);
        tr=new TaxRate();
        tr.setRate(22);
        taxRateDAO.save(tr);
        tr = new TaxRate();
        tr.setRate(27);
        taxRateDAO.save(tr);
    }

    @Test
    public void testFindById() {
        Iterable<TaxRate> findById = taxRateDAO.findById(2);
        System.out.println(findById.iterator().next());
    }
    
    @Test
    public void testFindByRate() {
        Iterable<TaxRate> findByRate = taxRateDAO.findByRate(22);
        findByRate.forEach(tr -> System.out.println(tr));
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
