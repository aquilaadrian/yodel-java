package com.example.Config;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.Domain.user.User;
import com.example.Services.Contracts.Repository.IUserRepository;
import com.example.Services.Infrastructure.Repository.UserRepository;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(IUserRepository repository) {

        return args -> {
            User mariam = new User("Mariam", 21, LocalDate.of(2000, Month.JULY, 5),
                    "mariam@gmail.com");
            User alex = new User("Alex", 25, LocalDate.of(2004, Month.JUNE, 5),
                    "alex@gmail.com");

            repository.saveAll(java.util.List.of(mariam, alex));

        };
    }

}
