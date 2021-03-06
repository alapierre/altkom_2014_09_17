/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.logistic.core.model;

import java.math.BigDecimal;
import java.util.Currency;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Joanna Rosinska
 */
@Entity
public class InvoiceItem extends BaseEntity {

    private BigDecimal price;

    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "INV_ID")
    private Invoice invoice;
    
    @OneToOne
    @JoinColumn(name="TAXRATE_ID")
    private TaxRate rate;

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
