package com.auradev.potfoliobackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.Customizer;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .cors(Customizer.withDefaults()) // ✅ enables CORS via WebConfig
            .csrf(csrf -> csrf.disable())    // ⚠️ disable CSRF for APIs unless using sessions
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/public/**", "/api/contact", "/api/newsletter").permitAll()
                .requestMatchers("/api/admin/**").hasRole("ADMIN")
                .requestMatchers("/api/**").permitAll() // 👈 Temporarily allow all API access
                .anyRequest().denyAll()
            );

        return http.build();
    }
}
