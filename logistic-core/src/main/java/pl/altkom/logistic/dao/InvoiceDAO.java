/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.dao;

import pl.altkom.logistic.core.model.Invoice;

/**
 *
 * @author Joanna Rosinska
 */
public interface InvoiceDAO {

    Invoice load(int id);

    void save(Invoice invoice);
    
}
