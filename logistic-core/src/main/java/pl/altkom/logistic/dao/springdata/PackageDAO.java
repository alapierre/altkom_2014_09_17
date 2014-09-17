/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao.springdata;

import java.math.BigDecimal;
import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import pl.altkom.logistic.core.model.Package;
import pl.altkom.logistic.core.model.Package.PackageTyp;

/**
 *
 * @author Sylwia
 */
public interface PackageDAO extends CrudRepository<Package, Integer>{

    public Set<Package> findByTyp(PackageTyp typ);
    
    public Set<Package> findByWidthAndHeightAndLength(BigDecimal width, BigDecimal height, BigDecimal length);
    
    
}
