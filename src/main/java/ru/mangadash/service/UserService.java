package ru.mangadash.service;

import ru.mangadash.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User updateUser);

    User getUserById(long id);

    void deleteUser(long id);

    User findUserByName(String username);
}
