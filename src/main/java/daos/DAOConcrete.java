package daos;

import models.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DAOConcrete implements DAO  {

    public <T> T findById(Integer id) {
        Connection connection = ConnectToDB.getConnection();

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from car where id=" + 6);
            if (rs.next()){

                return extractUserFromResultSet(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List findAll() {
        Connection connection = ConnectToDB.getConnection();
        return null;
    }

    public <T> T update(T dto) {
        Connection connection = ConnectToDB.getConnection();
        return null;
    }

    public <T> T create(T dto) {
        Connection connection = ConnectToDB.getConnection();
        return null;
    }

    public void delete(Integer id) {
        Connection connection = ConnectToDB.getConnection();

    }

    private <T>  T extractUserFromResultSet (ResultSet rs) throws SQLException {
        Car myCar = new Car();

        myCar.setCarId(rs.getInt("carId"));
        myCar.setMake((rs.getString("Make")));
        myCar.setModel((rs.getString("Model")));
        myCar.setCarId(rs.getInt("year"));
        myCar.setMake((rs.getString("color")));
        myCar.setMake((rs.getString("vin")));

        return (T) myCar;
    }
}
