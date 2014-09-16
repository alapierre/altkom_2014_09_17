/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Joanna Rosinska
 */
public class InvoiceItem extends BaseEntity{
    
    @ManyToOne
    @JoinColumn(name = "INV_ID")
    private Invoice invoice;
}
