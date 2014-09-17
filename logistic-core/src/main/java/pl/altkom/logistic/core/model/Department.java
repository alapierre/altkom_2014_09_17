/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

/**
 *
 * @author Radoslaw Lenik
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class Department extends BaseEntity  {
    
    @Size(max=128)
    @Column(name="NAME")
    private String departmentName;
    
    @OneToMany(mappedBy = "department",cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private List<User> users;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name="COUNTRY_ID")
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
}
