/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 *
 * @author Radoslaw Lenik
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class Country extends BaseEntity {
    
    @Size(max=64)
    String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
