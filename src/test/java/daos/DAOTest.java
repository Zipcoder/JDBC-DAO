package daos;

import models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DAOTest {

    DAO testDao;


    @Before
    public void setUp() throws Exception {
        testDao = new DAO();
    }


    @Test
    public void findById() {
        User expected = testDao.findById(4);
        Assert.assertEquals("Nedda",expected.getName());
    }

    @Test
    public void findAll() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void createUser() {
    }

    @Test
    public void deleteUser() {
    }
}