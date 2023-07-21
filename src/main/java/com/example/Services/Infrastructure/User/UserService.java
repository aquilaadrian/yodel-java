package com.example.Services.Infrastructure.User;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Domain.user.User;
import com.example.Services.Contracts.Repository.IUserRepository;
import com.example.Services.Contracts.User.IUserInterface;
import com.example.Services.Contracts.User.Response.UserResponse;

@RestController
public class UserService implements IUserInterface {

    private final IUserRepository UserRepository;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.UserRepository = userRepository;
    }

    @Override
    @GetMapping()
    @RequestMapping(path = "api/user/getall")
    public UserResponse GetAllUsers() {
        List<User> dto = new ArrayList<User>();
        dto.add(new User("1L", "Mariam", 21, LocalDate.of(2000, Month.JULY, 5), "mariam@gmail.com"));
        var response = new UserResponse("Ok", UserRepository.findAll());
        // return dto;
        return response;

    }

    @Override
    @GetMapping()
    @RequestMapping(path = "api/user/register")
    public UserResponse RegisterUser() {
        List<User> dto = new ArrayList<User>();
        dto.add(new User("1L", "Mariam", 21, LocalDate.of(2000, Month.JULY, 5), "mariam@gmail.com"));
        var response = new UserResponse("Ok", UserRepository.findAll());
        // return dto;
        return response;

    }

}
