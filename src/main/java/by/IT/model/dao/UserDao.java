package by.IT.model.dao;

import by.IT.model.entities.User;
import by.IT.model.db.ConnectionManager;

import java.util.Objects;

public class UserDao {
    private static UserDao dao;

    public UserDao() {
        ConnectionManager.init();
    }

    public static UserDao getInstance() {
        return Objects.isNull(dao) ? new UserDao() : dao;
    }

    public User getUser(String login, String password) {
        return null;
    }

    public boolean addUser(User user, String password) {
        return false;
    }
}
