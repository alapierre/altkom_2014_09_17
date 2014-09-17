/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.altkom.logistic.core.model.Country;
import pl.altkom.logistic.core.model.Department;
import pl.altkom.logistic.dao.springdata.DepartmentDAO;
import static org.junit.Assert.*;
import org.springframework.util.CollectionUtils;
import pl.altkom.logistic.core.model.User;
/**
 *
 * @author Radoslaw Lenik
 */
@ContextConfiguration("/core-test-context.xml")
@TransactionConfiguration(defaultRollback = true)
public class DepartmentDAOTest extends AbstractTransactionalJUnit4SpringContextTests{
    
    @Autowired
    private DepartmentDAO departmentDao;
    
    @Test
    public void testCreateDepartmentWithCountry(){
        Country country = new Country();
        country.setCountryName("USSR");
        
        Department department = new Department();
        department.setCountry(country);
        department.setDepartmentName("Security");
        departmentDao.save(department);
        
        Set<Department> foundDepartments = departmentDao.findByCountry(country);
        assertFalse(CollectionUtils.isEmpty(foundDepartments));
        
    }
    
    @Test
    public void testCreateDepartmentWithUsers(){
        Department department = new Department();
        List<User> users = new ArrayList<>();
        users.add(createUser("John", "Matrix", department));
        department.setDepartmentName("Research");
        department.setUsers(users);
        departmentDao.save(department);

        Set<Department> foundDepartments = departmentDao.findByDepartmentNameLikeIgnoreCase("research");
        assertFalse(CollectionUtils.isEmpty(foundDepartments));
        Department retrievedDepartment = foundDepartments.iterator().next();
        assertFalse(CollectionUtils.isEmpty(retrievedDepartment.getUsers())); 
    }
    
    @Test
    public void testFindDepartmentByUserLastName(){
        List<User> users = new ArrayList<>();
        Department department = new Department();
        users.add(createUser("John", "Rambo", department));
        users.add(createUser("John", "Smith", department));
        department.setDepartmentName("Maintenance");
        department.setUsers(users);
        departmentDao.save(department);

        Set<Department> foundDepartments = departmentDao.findByUsersLastName("Smith");
        assertFalse(CollectionUtils.isEmpty(foundDepartments));
        Department retrievedDepartment = foundDepartments.iterator().next();
        assertFalse(CollectionUtils.isEmpty(retrievedDepartment.getUsers())); 
    }
    
    
    private User createUser(String firstName, String lastName, Department department){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setDepartment(department);
        return user;
    }
    
}
