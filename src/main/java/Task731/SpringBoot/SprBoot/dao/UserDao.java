package Task731.SpringBoot.SprBoot.dao;


import Task731.SpringBoot.SprBoot.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);


    List<User> getUsers();

    User getUserById(Integer id);
}
