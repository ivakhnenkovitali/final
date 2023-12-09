package by.IT.model.dao;

import by.IT.model.entities.User;
import by.IT.model.db.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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


    public User getUser(String login, String password) {
        try (Connection cn = ConnectionManager.getConnection();
             PreparedStatement ps = cn.prepareStatement(INSERT_USER)){
ps.setString(1,login);
ps.setString(2,password);



ResultSet rs = ps.executeQuery();
if (rs.next()){
    int id = rs.getInt(ID_COL);
    String name = rs.getString(NAME_COL);
    String email = rs.getString(EMAIL_COL);
    return new User(id, login, name, email);
}

    }catch (SQLException e){
        e.printStackTrace();


        }
}
