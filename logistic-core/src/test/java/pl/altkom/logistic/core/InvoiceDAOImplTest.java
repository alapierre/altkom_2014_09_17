/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.core;

import java.util.Date;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import pl.altkom.logistic.core.model.Invoice;
import pl.altkom.logistic.dao.InvoiceDAO;


/**
 *
 * @author Joanna Rosinska
 */
public class InvoiceDAOImplTest extends AbstractTransactionalJUnit4SpringContextTests{
     @Autowired
    private InvoiceDAO invoiceDAO;
    
    @Test
    public void test() {
        System.out.println("11");
    }
    
    @Test
    public void testLoad() {
        Invoice invoice = invoiceDAO.load(1);
        System.out.println("invoice " + invoice);
    }
    
    @Test
    public void testSave() {
        
        Invoice invoice = new Invoice();
        invoice.setDate(new Date());
        
        invoiceDAO.save(invoice);
        
    }
}
