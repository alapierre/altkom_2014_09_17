/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.alltkom.logistic.jaxb.json.sample;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class XMLParseException extends RuntimeException {

    public XMLParseException() {
    }

    public XMLParseException(String message) {
        super(message);
    }

    public XMLParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public XMLParseException(Throwable cause) {
        super(cause);
    }
    
}
