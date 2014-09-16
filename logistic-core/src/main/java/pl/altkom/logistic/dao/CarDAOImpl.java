/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
        java.util.List<Car> resultList = em.createQuery("SELECT c FROM Car c where c.name = :value1")
                .setParameter("value1", name).getResultList();
        return CollectionUtils.isEmpty(resultList)?null:resultList.get(0);
    }
    
}
