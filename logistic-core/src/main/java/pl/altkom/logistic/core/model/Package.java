/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Entity;
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
    
    private PackageTyp typ;
    
    private BigDecimal weight;
    
    private BigDecimal width;
    
    private BigDecimal height;
    
    private BigDecimal length;
    
    private String status;
    
    @OneToOne
    @JoinColumn(name="ADDRESS_ID")
    private Address address;
    
    @OneToMany
    @JoinColumn(name="PACKAGE_ID")
    private Collection<PackageItem> packageItems;

    public enum PackageTyp{
        STANDARD, EXPRESS
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

    public PackageTyp getTyp() {
        return typ;
    }

    public void setTyp(PackageTyp typ) {
        this.typ = typ;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public Collection<PackageItem> getPackageItems() {
        return packageItems;
    }

    public void setPackageItems(Collection<PackageItem> packageItems) {
        this.packageItems = packageItems;
    }
    
    
}
