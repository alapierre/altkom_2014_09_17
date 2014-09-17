/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao.springdata;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.altkom.logistic.core.model.User;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public interface UserDAO extends JpaRepository<User, Integer> {
    
    public Iterable<User> findByLastNameLikeIgnoreCase(String name);
    
    public Iterable<User> findByLastNameAndFirstName(String lastName,String firstName);
    
    public Iterable<User> findByFirstNameLikeAndCarsNameLike(String firstName,String name);
    
    public Iterable<User> findByLastNameLikeAndCarsNameLike(String lastName,String name);
    
}
