package app.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import app.api.Calculo;
import jakarta.annotation.PostConstruct;
import jakarta.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/api")
public class JerseyConfiguration extends ResourceConfig {

    @PostConstruct
    public void init() {
        register(Calculo.class);
    }
}
