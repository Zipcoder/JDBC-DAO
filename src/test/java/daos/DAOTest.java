package daos;

import models.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
        List<User> allUsers = testDao.findAll();
        Integer expected = 10;
        Integer actual = allUsers.size();

        Assert.assertEquals(expected,actual);
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