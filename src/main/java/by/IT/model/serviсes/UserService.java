package by.IT.model.serviсes;

import by.IT.model.entities.User;
import by.IT.model.dao.UserDao;

import java.util.Objects;


public class UserService {
    private static UserService service;
    private UserDao dao;

    private UserService() {
        dao = UserDao.getInstance();
    }

    public static UserService getInstance() {
        return Objects.isNull(service) ? new UserService() : service;
    }

    public User getUser(String login, String password) {
        return dao.getUser(login, password);
    }

    public boolean addUser(User user, String password) {
        return dao.addUser(user, password);
    }
}
