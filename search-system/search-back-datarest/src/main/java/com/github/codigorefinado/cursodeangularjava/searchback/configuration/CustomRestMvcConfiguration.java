package com.github.codigorefinado.cursodeangularjava.searchback.configuration;

import com.github.codigorefinado.cursodeangularjava.searchback.model.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

//@Configuration
public class CustomRestMvcConfiguration {
//    @Bean
//    public RepositoryRestConfigurer repositoryRestConfigurer() {
//        return new RepositoryRestConfigurerAdapter() {
//            @Override
//            public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

// // sem esta configuração, ao anotar  um repository com RepositoryRestResource, ele não irá incluir no json o id como atributo
//                config.exposeIdsFor(Topic.class);
//                config.setReturnBodyForPutAndPost(true);
//            }
//        };
//    }
}
