package com.example.Services.Contracts.User.Request;

public class UserRequest {

    public UserRequest(String purpose) {
        this.purpose = purpose;
    }

    public String purpose ;

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
}
