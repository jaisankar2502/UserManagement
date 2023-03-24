package com.user.UserManagement.services.serviceimple;

import com.user.UserManagement.exception.NotFoundException;
import com.user.UserManagement.form.UserForm;
import com.user.UserManagement.model.User;
import com.user.UserManagement.repositories.UserRepository;
import com.user.UserManagement.services.UserService;
import com.user.UserManagement.view.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimple implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserView add(UserForm form) {

        return new UserView(userRepository.save(new User(form)));



    }

    @Override
    public UserView getUser(Long Id) throws NotFoundException {
        return  new UserView(userRepository.findByUserId(Id).orElseThrow(NotFoundException::new));

    }
}
