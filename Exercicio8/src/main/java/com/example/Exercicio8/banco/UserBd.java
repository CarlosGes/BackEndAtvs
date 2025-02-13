package com.example.Exercicio8.banco;

import com.example.Exercicio8.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserBd {
    private List<User> users;




    public UserBd(){
        this.users = new ArrayList<>();
    }

    public List<User> findAll(){
        return new ArrayList<>(users);
    }

    public User getById(Long id){
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    //insert user
    public boolean insert(User user){
        users.add(user);
        return true;
    }


    //update user
    public boolean update(Long id, User user){
        User userBd = users.stream()
                .filter(u -> u.getId() == id).
                findFirst()
                .orElse(null);

        if(userBd == null){
            return false;
        }

        userBd.setNome(user.getNome());
        userBd.setSobrenome(user.getSobrenome());

        return true;
    }

}
