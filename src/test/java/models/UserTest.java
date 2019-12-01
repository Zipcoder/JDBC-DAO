package models;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class UserTest {

    User testUser;

    @Before
    public void setUp() throws Exception {
        testUser = new User(1,"Joe","testpass","joe@gmail.com","215-222-3333");
    }

    @Test
    public void getId() {
        Integer actual = 1;
        Integer expected = testUser.getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setId() {
        Integer actual = 6;
        testUser.setId(actual);
        Integer expected = testUser.getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getName() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void getPass() {
    }

    @Test
    public void setPass() {
    }

    @Test
    public void getEmail() {
    }

    @Test
    public void setEmail() {
    }

}