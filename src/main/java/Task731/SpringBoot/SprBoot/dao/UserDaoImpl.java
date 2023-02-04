package Task731.SpringBoot.SprBoot.dao;

import Task731.SpringBoot.SprBoot.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
//@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
        entityManager.flush();
    }

    @Override
    public void deleteUser(Integer id) {
        User user = entityManager.find(User.class, id);

        if (user != null) {
            entityManager.remove(user);
            entityManager.flush();
        }
    }


//    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

//    @Transactional(readOnly = true)
    @Override
    public User getUserById(Integer id) {
        return entityManager.find(User.class, id);
    }
}
