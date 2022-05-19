package dao;

import java.sql.SQLException;
import java.util.List;

public interface IService<T> {
    public void insertProduct(T t) throws SQLException;
    public T selectProduct(int id);

    public List<T> selectAllProducts();

    public boolean deleteProduct(int id) throws SQLException;

    public boolean updateProduct(T t) throws SQLException;
    public List<T> searchByCountry(String country);
    public List<T> sortByName();
}
