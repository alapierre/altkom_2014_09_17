/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.jaxb.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    
    @Test
    public void testCustomJson() throws IOException {
        
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, String>> list = new ArrayList<>();
        
        Map<String, String> map = new HashMap<>();
            
        map.put("id", "1");
        map.put("name", "nazwa");
        map.put("shortName", "kod");
        list.add(map);
        
        map.put("id", "2");
        map.put("name", "nazwa2");
        map.put("shortName", "kod2");
        list.add(map);
        
        String jsonStr = mapper.writeValueAsString(list);
        
        System.out.println(jsonStr);
        
    }
    
}
