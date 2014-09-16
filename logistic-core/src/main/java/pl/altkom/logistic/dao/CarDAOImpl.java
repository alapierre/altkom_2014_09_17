/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import pl.altkom.logistic.core.model.Car;

/**
 *
 * @author instruktor
 */
@Repository
public class CarDAOImpl implements CarDAO {
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Car load(int id) {
        return em.find(Car.class, id);
    }
    
    @Override
    public void save(Car car) {
        em.persist(car);
    }

    @Override
    public Car findByName(String name) {
        String ql = "SELECT c FROM Car AS c WHERE c.name = :name";
        
        Query query = em.createQuery(ql);
        query.setParameter("name", name);
        List<Car> cars = query.getResultList();
        
        if (!CollectionUtils.isEmpty(cars)) {
            return cars.get(0);
        }
        
        return null;
    }
    
}
