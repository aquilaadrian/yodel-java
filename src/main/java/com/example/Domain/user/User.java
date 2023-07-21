package com.example.Domain.user;

import java.time.LocalDate;
import java.time.Period;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "YodelUser")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @UuidGenerator
    private String Id;

    private String Name;

    @Transient
    private Integer Age;

    private LocalDate DateOfBirth;

    private String Email;

    /// Generating User with automatic UUID
    public User(String Name, LocalDate DateOfBirth, String Email) {

        this.Name = Name;
        this.DateOfBirth = DateOfBirth;
        this.Email = Email;
    }

    public Integer getAge() {
        return Period.between(this.DateOfBirth, LocalDate.now()).getYears();

    }

}
