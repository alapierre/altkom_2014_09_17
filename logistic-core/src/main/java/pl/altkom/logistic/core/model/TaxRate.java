/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.logistic.core.model;

import javax.persistence.Entity;

/**
 *
 * @author Pawel Beder <AA@aa.com>
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class TaxRate extends BaseEntity {

    private int rate;
    private InvoiceItem item;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

}
