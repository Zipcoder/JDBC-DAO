package daos;

import java.util.List;

public interface DAO {

    public <T> T findById(Integer id);

    public List findAll();

    public <T> T update (T dto);

    public <T> T create (T dto);

    public void delete (Integer id);


//    String simpleQuery "select * from .car"
//
//    //iterate results column names match yoiur data
//    parameterized query
//            prepared statement connection.preparedStatement
//    data grep
//
//            running sql commdands thru java
//
//    Extracting methods out behind the DAO
}
