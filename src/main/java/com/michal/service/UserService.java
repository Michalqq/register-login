package com.michal.service;

import com.michal.model.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}