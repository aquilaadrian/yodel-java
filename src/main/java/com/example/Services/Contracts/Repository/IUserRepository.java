package com.example.Services.Contracts.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Domain.user.User;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {

    @Query("SELECT u FROM User u WHERE u.Email =?1")
    Optional<List<User>> findUserByEmail(String Email);

}
