package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.ContextClosedEvent;

@SpringBootApplication
public class SpringbootApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringbootApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootApplication.class);
        application.addListeners((ApplicationListener<ApplicationReadyEvent>) event ->
                log.info("Aplicação Startada"));
        application.addListeners((ApplicationListener<ContextClosedEvent>) event ->
                log.info("Aplicação encerrada: motivo = fechamento do contexto da aplicação"));

        application.run(args);
    }
}
