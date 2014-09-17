/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao.springdata;

import org.springframework.data.repository.CrudRepository;
import pl.altkom.logistic.core.model.Car;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public interface CarDAO extends CrudRepository<Car, Integer> {
    
    public Iterable<Car> findByNameLikeIgnoreCase(String name);
    
}
