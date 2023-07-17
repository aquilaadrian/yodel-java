package com.example.Services.Contracts.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.Domain.user.User;


public interface IUserRepository extends CrudRepository<User, String> {

    

    
}
