/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.logistic.dao.springdata;

import org.springframework.data.repository.CrudRepository;
import pl.altkom.logistic.core.model.TaxRate;

/**
 *
 * @author Pawel Beder <AA@aa.com>
 */
public interface TaxRateDAO extends CrudRepository<TaxRate, Integer> {

    Iterable<TaxRate> findById(Integer id);

    Iterable<TaxRate> findByRate(Integer rate);

}
