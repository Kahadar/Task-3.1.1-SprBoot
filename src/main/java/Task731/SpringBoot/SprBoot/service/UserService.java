package Task731.SpringBoot.SprBoot.service;


import Task731.SpringBoot.SprBoot.model.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);


    List<User> getUsers();

    User getUserById(Integer id);
}
