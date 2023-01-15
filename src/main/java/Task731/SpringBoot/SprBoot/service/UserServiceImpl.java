package Task731.SpringBoot.SprBoot.service;

import Task731.SpringBoot.SprBoot.dao.UserDao;
import Task731.SpringBoot.SprBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void createUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        userDao.deleteUser(id);
    }


    @Override
    public List<User> getUsers() {
        return new ArrayList<>(userDao.getUsers());
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }
}
