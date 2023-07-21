package com.example.Services.Contracts.User;

import com.example.Services.Contracts.User.Response.UserResponse;

public interface IUserInterface {

    public abstract UserResponse GetAllUsers();

    public abstract UserResponse RegisterUser();

}
