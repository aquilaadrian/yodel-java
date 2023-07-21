package com.example.Domain.user;

import java.time.LocalDate;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "YodelUser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    private String Id;

    private String Name;

    private Integer Age;

    private LocalDate DateOfBirth;

    private String Email;

    /// Generating User with automatic UUID
    public User(String Name, Integer Age, LocalDate DateOfBirth, String Email) {

        this.Name = Name;
        this.Age = Age;
        this.DateOfBirth = DateOfBirth;
        this.Email = Email;
    }

}
