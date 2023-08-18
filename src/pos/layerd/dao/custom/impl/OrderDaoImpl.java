
package pos.layerd.dao.custom.impl;

import java.util.ArrayList;
import pos.layerd.dao.CrudUtil;
import pos.layerd.dao.custom.OrderDao;
import pos.layerd.entity.OrderEntity;

public class OrderDaoImpl implements OrderDao{

    @Override
    public boolean add(OrderEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Orders VALUES(?,?,?)", t.getId(), t.getDate(), t.getCustId());
    }

    @Override
    public boolean update(OrderEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return false;
    }

    @Override
    public OrderEntity get(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderEntity> getAll() throws Exception {
        return null;
    }   
}
