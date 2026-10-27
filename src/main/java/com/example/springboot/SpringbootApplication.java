package com.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

@SpringBootApplication
public class SpringbootApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringbootApplication.class);

    public static void main(String[] args) {
        log.info("Aplicação Startada");

        SpringApplication application = new SpringApplication(SpringbootApplication.class);
        application.addListeners((ApplicationListener<ContextClosedEvent>) event ->
                log.info("Aplicação encerrada: motivo = fechamento do contexto da aplicação"));

        application.run(args);
    }
}
