/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.jaxb.sample;

import java.io.File;
import org.junit.Test;
import pl.alltkom.logistic.jaxb.json.sample.InvoiceSerializer;
import pl.com.softproject.commons.model.invoice.Invoice;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class SerializerTest {
    
    @Test
    public void testRead() {
        
        InvoiceSerializer serializer = new InvoiceSerializer();
        
        Invoice invoice = serializer.fromFile(new File("src/resources/FS 1_MAG_05_2012.xml"));
        
    }
    
}
