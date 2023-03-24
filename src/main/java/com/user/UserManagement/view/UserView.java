package com.user.UserManagement.view;

import com.user.UserManagement.model.User;

import java.util.Optional;

public class UserView {
    private final int userId;
     private final String userName;

    private final String email;


    public UserView(User user) {
        this.email= user.getEmail();
        this.phone= user.getPhone();
        this.userName=user.getUsername();
        this.userId= user.getStatus();
        this.status= user.getStatus();
    }


    public String getPhone() {
        return phone;
    }

    private final String phone;
    private final short status;



    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public short getStatus() {
        return status;
    }


}
