/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao;

import pl.altkom.logistic.core.model.Car;

/**
 *
 * @author instruktor
 */
public interface CarDAO {

    Car load(int id);
    
    Car findByName(String name);

    void save(Car car);
}
