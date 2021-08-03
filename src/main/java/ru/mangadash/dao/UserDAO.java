package ru.mangadash.dao;

import ru.mangadash.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User updateUser);

    User getUserById(long id);

    void deleteUser(long id);

    User findUserByName(String username);
}
