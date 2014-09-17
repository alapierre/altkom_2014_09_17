/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.logistic.web.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@XmlRootElement
public class Party {
    
    private String name;
    private int mumberOfGuests;

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public int getMumberOfGuests() {
        return mumberOfGuests;
    }

    public void setMumberOfGuests(int mumberOfGuests) {
        this.mumberOfGuests = mumberOfGuests;
    }
    
    
    
}
