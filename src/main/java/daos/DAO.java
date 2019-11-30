package daos;

import models.User;
import models.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO implements UserDAO {

    private List<User> allUsers;

    public User findById(Integer id) {

        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE id=" + id);
            if(rs.next())
            {
                return extractUserFromResultSet(rs);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public List<User> findAll() {
        allUsers = new ArrayList<User>();
        Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user");
            while(rs.next())
            {
                allUsers.add(extractUserFromResultSet(rs));
            }
            return allUsers;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public Boolean updateUser(User dto) {
        return null;
    }

    public Boolean createUser(User dto) {
        return null;
    }

    public void deleteUser(Integer id) {

    }


    private User extractUserFromResultSet(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId( rs.getInt("id") );
        user.setName( rs.getString("name") );
        user.setPass( rs.getString("password") );
        user.setAge( rs.getInt("age") );
        return user;
    }
}
