package com.example.Domain.user;

import java.time.LocalDate;



public class User {

    private Long Id;

    private String Name;

    private Integer Age;

    private LocalDate DateOfBirth;

    private String Email;

    public User(Long Id, String Name, Integer Age, LocalDate DateOfBirth, String Email) {
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.DateOfBirth = DateOfBirth;
        this.Email = Email;
    }

    public User( String Name, Integer Age, LocalDate DateOfBirth, String Email) {
        
        this.Name = Name;
        this.Age = Age;
        this.DateOfBirth = DateOfBirth;
        this.Email = Email;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", Name='" + getName() + "'" +
            ", Age='" + getAge() + "'" +
            ", DateOfBirth='" + getDateOfBirth() + "'" +
            ", Email='" + getEmail() + "'" +
            "}";
    }

    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getAge() {
        return this.Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public LocalDate getDateOfBirth() {
        return this.DateOfBirth;
    }

    public void setDateOfBirth(LocalDate DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}
