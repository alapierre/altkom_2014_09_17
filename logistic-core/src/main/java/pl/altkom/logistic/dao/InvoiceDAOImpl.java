/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.logistic.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.altkom.logistic.core.model.Invoice;

/**
 *
 * @author Joanna Rosinska
 */
public class InvoiceDAOImpl implements InvoiceDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Invoice invoice) {
        em.persist(invoice);
    }

    @Override
    public Invoice load(int id) {
        return em.find(Invoice.class, id);
    }
}
