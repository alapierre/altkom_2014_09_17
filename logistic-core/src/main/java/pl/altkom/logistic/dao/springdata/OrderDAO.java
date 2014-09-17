/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao.springdata;

import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pl.altkom.logistic.core.model.Order;
import pl.altkom.logistic.core.model.Order.PaymentMethod;


/**
 *
 * @author Wojtek Jozkow
 */
public interface OrderDAO extends CrudRepository<Order, Integer> {
    
    public List<Order> findByCustomerCustomerName(String name);
    public List<Order> findByPlacedBetween(Date from, Date to);
    public List<Order> findByPlacedBefore(Date before);
    public List<Order> findByDeliveredBefore(Date before);
    public List<Order> findByPaymentMethod(PaymentMethod pm);
    
}
