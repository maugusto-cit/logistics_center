package br.com.cit.logistics_center;

import br.com.cit.logistics_center.controllers.DeliveryController;
import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by neto on 21/06/17.
 */


/**
 * Responsable to start a Spring Boot Application.
 */
@EnableJSONDoc
@SpringBootApplication
@ComponentScan(basePackageClasses = DeliveryController.class)
public class Application {

    /**
     * First method executed in the application.
     */
    public static void main(String[] args) throws Exception {
        
        System.out.println(System.getenv("database_url"));
        
        SpringApplication.run(Application.class, args);
    }
}
