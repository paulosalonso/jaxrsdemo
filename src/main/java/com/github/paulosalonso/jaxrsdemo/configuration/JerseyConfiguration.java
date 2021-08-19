package com.github.paulosalonso.jaxrsdemo.configuration;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfiguration extends ResourceConfig {

    public JerseyConfiguration() {
        packages("com.github.paulosalonso.jaxrsdemo.controller");
    }
}
