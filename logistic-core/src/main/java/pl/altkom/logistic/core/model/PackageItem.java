/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import javax.persistence.Entity;

/**
 *
 * @author Sylwia
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class PackageItem extends BaseEntity{
    
    private String description;
    
    private int value;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
}
