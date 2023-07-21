package com.example.Services.Contracts.User;

import java.util.Optional;

import com.example.Domain.user.User;
import com.example.Services.Contracts.User.Response.UserResponse;

public interface IUserInterface {

    public abstract UserResponse GetAllUsers();

    public abstract Optional<UserResponse> RegisterUser(User user);

}
