package com.user.UserManagement.services;

import com.user.UserManagement.exception.NotFoundException;
import com.user.UserManagement.form.UserForm;
import com.user.UserManagement.view.UserView;
import org.springframework.data.crossstore.ChangeSetPersister;

public interface UserService {
    UserView add(UserForm form);

    UserView getUser(Long Id) throws NotFoundException;
}
