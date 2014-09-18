/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.jaxb.sample;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import pl.alltkom.logistic.jaxb.json.sample.InvoiceSerializer;
import pl.com.softproject.commons.model.invoice.Invoice;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Json {
    
    @Test
    public void testToJson() throws IOException {
        
        InvoiceSerializer serializer = new InvoiceSerializer();
        
        Invoice invoice = serializer.fromFile(new File("src/main/resources/FS 1_MAG_05_2012.xml"));
        
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(invoice);
        
        System.out.println(str);
        
    }
    
}
