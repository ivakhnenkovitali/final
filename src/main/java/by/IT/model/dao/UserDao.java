package by.IT.model.dao;

import by.IT.model.db.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

import static by.IT.constants.DbConstants.*;

public class UserDao {
    private static UserDao dao;

    public UserDao() throws SQLException {
        ConnectionManager.init();
    }

    public static UserDao getInstance() {
        return Objects.isNull(dao) ? new UserDao() : dao;
    }


    public boolean getUser(String login, String password) {
        try (Connection cn = ConnectionManager.getConnection();
             PreparedStatement ps = cn.prepareStatement(INSERT_USER)) {
            if (isAccessible(user.getLogin(), cn)) {
                ps.setString(1, user.getLogin());
                ps.setString(2, user.getName());
                ps.setString(3, user.getEmail());
                ps.setString(4, password);
                return ps.executeUpdate() > 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();


        }
        return false;
    }

    private boolean isAccessible(String login, Connection cn) {
        try (PreparedStatement ps = cn.prepareStatement(SELECT_USER_BY_LOGIN)) {
            ps.setString(1, login);


            return !ps.executeQuery().next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
