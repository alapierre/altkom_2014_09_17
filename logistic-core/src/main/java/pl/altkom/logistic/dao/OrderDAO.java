/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao;

import pl.altkom.logistic.core.model.Order;

/**
 *
 * @author Wojtek Jozkow
 */
public interface OrderDAO {

    Order load(int id);

    void save(Order car);
    
}
