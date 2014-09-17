/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao.springdata;

import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import pl.altkom.logistic.core.model.Country;
import pl.altkom.logistic.core.model.Department;
import pl.altkom.logistic.core.model.User;

/**
 *
 * @author Radoslaw Lenik
 */
public interface DepartmentDAO extends CrudRepository<Department, Integer> {
    
    public Set<Department> findByCountry(Country country);
    public Set<Department> findByDepartmentNameLikeIgnoreCase(String name);
    public Set<Department> findByUsersLastName(String userLastName);
}
