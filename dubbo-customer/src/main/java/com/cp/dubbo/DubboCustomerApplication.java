package com.cp.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo-customer.xml"})
public class DubboCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboCustomerApplication.class, args);
    }

}
