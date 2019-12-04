package daos;

import com.sun.org.apache.xpath.internal.operations.Bool;
import models.Car;

import java.util.List;

public interface Dao<T> {
    public T findCarByid(int id);
    public List<T> findAll();
    public T update(Car dto);
    public T create(Car dto);
    public T delete (int id);
}
