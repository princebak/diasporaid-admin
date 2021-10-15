package com.kindev.diasporaidadmin.service;

import com.kindev.diasporaidadmin.model.User;

public interface UserService {
    User createUser(User user);
    User findUser(User user);
}
