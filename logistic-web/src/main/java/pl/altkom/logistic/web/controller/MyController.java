/*
 * Copyright 2011-08-31 the original author or authors.
 */
package pl.altkom.logistic.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pl.altkom.logistic.web.model.Drink;
import pl.altkom.logistic.web.model.Party;

/**
 *
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
@Controller
public class MyController {
    
    protected Logger logger = Logger.getLogger(getClass());
    
    @RequestMapping("/home")
    public ModelAndView home() {
        
        logger.debug("MyController.home()");
        
        return new ModelAndView("home");
    }
    
    @RequestMapping("/show")
    public ModelAndView show(@RequestParam() String imie) {
        
        ModelAndView model = new ModelAndView("show");
        
        model.addObject("imie", imie);
        
        return model;
    }
    
    @RequestMapping("/show2/{imie}")
    public ModelAndView show2(@PathVariable String imie) {
        
        ModelAndView model = new ModelAndView("show");
        
        model.addObject("imie", imie);
        
        return model;
    }
    
    @RequestMapping("/partyAsXML")
    public @ResponseBody Party partyAsXML() {
       
        Party party = new Party();
        party.setName("Impreza u cygana");
        party.setMumberOfGuests(100);
        
        return party;
        
    }
    
    @RequestMapping(value = "/drink", produces = "application/json;charset=utf-8")
    public @ResponseBody Drink drink() {
        
        Drink drink = new Drink();
        drink.setName("Mochito ąłńść");
        drink.setAlcohol(15);
        
        return drink;
        
    }
}
