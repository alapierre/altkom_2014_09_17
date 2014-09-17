/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.logistic.dao.springdata;

import java.util.Currency;
import java.util.Date;
import org.springframework.data.repository.CrudRepository;
import pl.altkom.logistic.core.model.Invoice;


/**
 *
 * @author Joanna Rosinska
 */
public interface InvoiceDAO extends CrudRepository<Invoice, Integer> {

      public Iterable<Invoice> findByDate(Date date);
      
      public Iterable<Invoice> findByDateBefore(Date date);
      
      public Iterable<Invoice> findByDateAfter(Date date);
      
      public Iterable<Invoice> findByDateBetween(Date date1, Date date2 );
      
      public Iterable<Invoice> findByInvoiceItemsCurrency(Currency currency );
      
}
