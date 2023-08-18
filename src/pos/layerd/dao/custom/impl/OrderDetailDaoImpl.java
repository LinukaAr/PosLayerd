
package pos.layerd.dao.custom.impl;
import java.util.ArrayList;
import pos.layerd.dao.CrudUtil;
import pos.layerd.dao.custom.OrderDetailDao;
import pos.layerd.entity.OrderDetailEntity;


public class OrderDetailDaoImpl implements OrderDetailDao {

    @Override
    public boolean add(OrderDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO orderdetail VALUES(?,?,?,?)", t.getOrderId(), t.getItemId(), t.getQty(), t.getDiscount());
    }

    @Override
    public boolean update(OrderDetailEntity t) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return false;
    }

    @Override
    public OrderDetailEntity get(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<OrderDetailEntity> getAll() throws Exception {
        return null;
    }   
}
