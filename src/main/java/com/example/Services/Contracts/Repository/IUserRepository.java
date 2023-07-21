package com.example.Services.Contracts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Domain.user.User;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {

}
