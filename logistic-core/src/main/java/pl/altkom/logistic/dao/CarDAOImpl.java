/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.jpa.criteria.CriteriaBuilderImpl;
import org.hibernate.jpa.criteria.CriteriaQueryImpl;
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
    
    @Override
    public List<Car> getByName(String name){
//        
//          CriteriaBuilder cb = em.getCriteriaBuilder();
// 
//  CriteriaQuery<Car> q = cb.createQuery(Car.class);
//  Root<Car> c = q.from(Car.class);
//  q.select(c);
//  
//  
//  TypedQuery<Car> query = em.createQuery(q);
//  List<Car> results = query.getResultList();
  
            TypedQuery<Car> query = em.createQuery(
        "SELECT c FROM Car c WHERE c.name = :name", Car.class);
    List<Car> results= query.setParameter("name", name).getResultList();
  return results;
    }
    
}
