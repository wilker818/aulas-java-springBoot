package io.github.wilker818;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Development
public class MinhaConfiguration {
    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Rodando a Configuração de Desenvolvimento");
        };
    }
}
