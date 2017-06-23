package br.com.cit.logistics_center;

import br.com.cit.logistics_center.controllers.DeliveryController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by neto on 21/06/17.
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = DeliveryController.class)
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
