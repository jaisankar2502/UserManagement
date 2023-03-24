package com.user.UserManagement.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserForm {

    @NotBlank
    @Size(max =50)
    private String name;
    @NotBlank
    @Size(max=250)
    @Email
    private String email;
    private String phone;
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }


}
