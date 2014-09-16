/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Sylwia
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class Package extends BaseEntity{
    
    private int size;
    
    private BigDecimal weight;
    
    private String status;
    
    @OneToOne
    @JoinColumn(name="ADDRESS_ID")
    private Address address;
    
    @OneToMany
    @JoinColumn(name="PACKAGE_ID")
    private Collection<PackageItem> packageItems;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
