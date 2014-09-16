/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao;

import java.util.List;
import pl.altkom.logistic.core.model.Car;

/**
 *
 * @author instruktor
 */
public interface CarDAO {

    Car load(int id);

    void save(Car car);
    
    List<Car> getByName(String name);
    
}
