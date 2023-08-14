
package pos.layerd.dao;

import java.util.ArrayList;


public interface CrudDao<T, ID> extends SuperDao {

    boolean add(T t) throws Exception;

    boolean update(T t) throws Exception;

    boolean delete(ID id) throws Exception;

    T get(ID id) throws Exception;

    ArrayList<T> getAll() throws Exception;

}
