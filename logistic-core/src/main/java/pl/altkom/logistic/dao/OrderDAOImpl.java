/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import pl.altkom.logistic.core.model.Order;


/**
 *
 * @author Wojtek Jozkow
 */
@Repository
public class OrderDAOImpl implements OrderDAO {
    
        @PersistenceContext
    private EntityManager em;
    
    
    @Override
    public Order load(int id) {
        return em.find(Order.class, id);
    }
    
    
    @Override
    public void save(Order car) {
        em.persist(car);
    }

}
