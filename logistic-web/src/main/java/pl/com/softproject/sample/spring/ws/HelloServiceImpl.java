/*
 * Copyright 2014-09-18 the original author or authors.
 */

package pl.com.softproject.sample.spring.ws;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author Adrian Lapierre <adrian@softproject.com.pl>
 */
@WebService(endpointInterface = "pl.com.softproject.sample.spring.ws.HelloService")
public class HelloServiceImpl implements HelloService {
    
    @Resource
    private WebServiceContext wscontext;
    
    @Override
    public String sayHallo(String name) {
        
        System.out.println("wscontext = " + wscontext);
        
        System.out.println("logged user = " + wscontext.getUserPrincipal().getName()); 
        
        bySpringSecurity();
        
        return "Hello " + name;
    }
    
    private void bySpringSecurity() {
        
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        
        System.out.println("logged user by spring = " + name); 
    }
    
}
