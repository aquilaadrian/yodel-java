package com.example.Services.Contracts.User;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Services.Contracts.User.Response.UserResponse;


public interface IUserInterface {


    
    public abstract UserResponse GetAllUsers();
    
}
