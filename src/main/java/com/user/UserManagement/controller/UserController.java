package com.user.UserManagement.controller;

import com.user.UserManagement.exception.NotFoundException;
import com.user.UserManagement.form.UserForm;
import com.user.UserManagement.services.UserService;
import com.user.UserManagement.view.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public UserView adduser(@Valid @RequestBody UserForm userForm) {
        return userService.add(userForm);
    }

    @GetMapping("/{Id}")
    public UserView getuser(@PathVariable("Id") Long Id) throws NotFoundException {
        return userService.getUser(Id);

    }


}
