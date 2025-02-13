package com.example.Exercicio8.controller;

import com.example.Exercicio8.banco.UserBd;
import com.example.Exercicio8.model.User;

import java.util.List;

public class UserController {

    UserBd repository = new UserBd();

    //buscar todos
    public List<User> getAll(){
        return repository.findAll();
    }

    public User getById(long id){
        return repository.getById(id);
    }

    public boolean insert(User user){
        return repository.insert(user);
    }

    public User update(Long id, User user){
        boolean result = repository.update(id, user);

        if(result){
            return user;
        }
        return null;
    }

}
