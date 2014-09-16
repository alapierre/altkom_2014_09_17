/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.logistic.core.model;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author Joanna Rosinska
 */
@Entity
@SuppressWarnings("PersistenceUnitPresent")
public class Invoice extends BaseEntity {

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;

    @OneToMany(mappedBy = "invoice")
    private Collection<InvoiceItem> invoiceItems;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Collection<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public void setInvoiceItems(Collection<InvoiceItem> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

}
