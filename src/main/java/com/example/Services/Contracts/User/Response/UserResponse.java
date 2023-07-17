package com.example.Services.Contracts.User.Response;

import java.util.List;

import com.example.Domain.user.User;
import java.util.Objects;

public class UserResponse {

    private String ResponeStatus;

    private List<User> Users;

    public UserResponse() {
    }

    public UserResponse(String ResponeStatus, List<User> Users) {
        this.ResponeStatus = ResponeStatus;
        this.Users = Users;
    }

    public String getResponeStatus() {
        return this.ResponeStatus;
    }

    public void setResponeStatus(String ResponeStatus) {
        this.ResponeStatus = ResponeStatus;
    }

    public List<User> getUsers() {
        return this.Users;
    }

    public void setUsers(List<User> Users) {
        this.Users = Users;
    }

    public UserResponse ResponeStatus(String ResponeStatus) {
        setResponeStatus(ResponeStatus);
        return this;
    }

    public UserResponse Users(List<User> Users) {
        setUsers(Users);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserResponse)) {
            return false;
        }
        UserResponse userResponse = (UserResponse) o;
        return Objects.equals(ResponeStatus, userResponse.ResponeStatus) && Objects.equals(Users, userResponse.Users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ResponeStatus, Users);
    }

    @Override
    public String toString() {
        return "{" +
                " ResponeStatus='" + getResponeStatus() + "'" +
                ", Users='" + getUsers() + "'" +
                "}";
    }

}
