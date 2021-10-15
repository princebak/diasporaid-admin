package com.kindev.diasporaidadmin.service.implementation;

import com.kindev.diasporaidadmin.model.User;
import com.kindev.diasporaidadmin.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private List<User> users = Arrays.asList( new User("prince","admin","admin"),
                                              new User("marie","validator1","firstValidator"),
                                              new User("larry","validator2","secondValidator")
    );

    @Override
    public User createUser( User user ) {
        users.add( user );
        return user;
    }

    @Override
    public User findUser(User user) {
        return users.stream().filter(
                currentUser -> currentUser.getUsername().equalsIgnoreCase(user.getUsername()) &&
                        currentUser.getPassword().equals(user.getPassword())
        ).findFirst().orElse(null);
    }
}
