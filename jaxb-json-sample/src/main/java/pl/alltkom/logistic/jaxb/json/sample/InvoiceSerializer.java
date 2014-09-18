/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.alltkom.logistic.jaxb.json.sample;

import pl.com.softproject.commons.model.invoice.Invoice;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class InvoiceSerializer extends BaseXMLSerializer<Invoice>{

    public InvoiceSerializer() {
        super("pl.com.softproject.commons.model.invoice", 
                "invoice.xsd", 
                "http://www.softproject.com.pl/commons/model/invoice http://schema.softproject.com.pl/commons-invoice/invoice.xsd");
    }
    
}
