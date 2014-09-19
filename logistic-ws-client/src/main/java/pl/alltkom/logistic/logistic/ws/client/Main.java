/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.alltkom.logistic.logistic.ws.client;

import java.net.Authenticator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.com.softproject.sample.spring.ws.HelloServiceImplService;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Main {
    
    public static void main(String[] args) {
        
        ApplicationContext ac = new ClassPathXmlApplicationContext("logistic-ws-client.xml");
        
        //Authenticator a = ac.getBean("myAuthenticator", Authenticator.class);
        //System.out.println("a: "+a);
        //Authenticator.setDefault(a);
        
        HelloServiceImplService service = new HelloServiceImplService();
        
        String res = service.getHelloServiceImplPort().sayHallo("Alicja");

        System.out.println("res -> " + res);
    }
    
}
