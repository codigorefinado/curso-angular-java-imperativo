package com.github.codigorefinado.cursodeangularjava.searchback;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Em algumas situações em que você está criando um microserviço tão pequeno,
 * alguma das boas prática podem ser desnecessárias, pode se tornar até "gold plating" ou "over kill".
 * <p>
 * Organizar suas classes seguindo o conceito de "feature folder" ou "layer folder", pode ser uma destas práticas.
 *
 * @ToDo Leia o JavaDoc do @SpringBootApplication
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Bean provider by Spring Boot: ");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }
}
