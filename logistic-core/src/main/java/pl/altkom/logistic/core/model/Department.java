/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    
    
    
}
