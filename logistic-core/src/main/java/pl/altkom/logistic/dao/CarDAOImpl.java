/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
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
    
}
