/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.logistic.core.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Pawel Beder <AA@aa.com>
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class TaxRate extends BaseEntity {

    private int rate;
    
    @OneToOne(mappedBy="rate")
    private InvoiceItem item;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Tax Rate(" + "Id:" + id + " Rate:" + rate + ")";
    }
    
    

}
