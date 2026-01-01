package dev.raphhax.CadastroDeNinja;

import org.h2.server.web.JakartaWebServlet; // <--- O SEGREDO ESTÁ AQUI!
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class H2Config {

    @Bean
    public ServletRegistrationBean h2servletRegistration() {
        // Agora estamos usando o JakartaWebServlet, que é compatível com seu Spring Boot 4
        ServletRegistrationBean registration = new ServletRegistrationBean(new JakartaWebServlet());

        registration.addUrlMappings("/h2-console/*");
        return registration;
    }
}