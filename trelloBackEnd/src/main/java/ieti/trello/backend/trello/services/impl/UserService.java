package ieti.trello.backend.trello.services.impl;

import ieti.trello.backend.trello.entities.User;
import ieti.trello.backend.trello.persistence.IUserPersistence;
import ieti.trello.backend.trello.services.ITaskService;
import ieti.trello.backend.trello.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserService implements IUserService {

    @Autowired
    IUserPersistence userPersistence;


    @Override
    public List<User> getUsersList() {
        return userPersistence.getUsersList();
    }

    @Override
    public User getUserById(String userId) {
        return userPersistence.getUserById(userId);
    }

    @Override
    public User createUser(User user) {
        return userPersistence.createUser(user);
    }

    @Override
    public User updateUser(User user) {
        return userPersistence.updateUser(user);
    }

    @Override
    public void removeUser(String userId) {
        userPersistence.removeUser(userId);
    }
}
