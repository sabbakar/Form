package com.simple_form.service;

import com.simple_form.model.UsersModel;
import com.simple_form.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UsersRepository usersRepository;

    public UsersModel registerUser(String login, String password, String email){
        if (login == null || password == null) {
            return null;
        } else {
            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setPassword(password);
            usersModel.setEmail(email);
            usersRepository.save(usersModel);
            return usersRepository.save(usersModel);
        }
    }

    public UsersModel authentication(String login, String password){
        return usersRepository.findByLoginAndPassword(login, password).orElse(null);

    }
}
