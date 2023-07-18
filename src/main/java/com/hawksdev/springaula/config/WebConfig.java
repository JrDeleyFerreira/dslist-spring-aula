package com.hawksdev.springaula.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/* Classe de restrição de hosts para acessar backend 
 * CORS_ORIGINS no application.properties
 * Configurável no Railway - CI/CD na Nuvem
*/
@Configuration
public class WebConfig {

  @Value("${cors.origins}")
  private String corsOrigins;

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("*").allowedOrigins(corsOrigins);
      }
    };
  }

}