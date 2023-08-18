
package pos.layerd.dao.custom.impl;

import java.util.ArrayList;
import pos.layerd.dao.CrudUtil;
import pos.layerd.dao.custom.ItemDao;
import pos.layerd.entity.ItemEntity;
import java.sql.ResultSet;



public class ItemDaoImpl implements ItemDao {

    @Override
    public boolean add(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Item VALUES(?,?,?,?,?)",
                t.getId(),
                t.getDescription(),
                t.getPackSize(),
                t.getUnitPrice(),
                t.getQoh());
    }

    @Override
    public boolean update(ItemEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Item SET  Description=?, PackSize=?, UnitPrice=?, QtyOnHand=? WHERE ItemCode = ?",
                t.getDescription(),
                t.getPackSize(),
                t.getUnitPrice(),
                t.getQoh(),
                t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM item WHERE ItemCode = ?", id);
    }

    @Override
    public ItemEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item WHERE ItemCode = ?", id);
        while (rst.next()) {
            return new ItemEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));
        }
        return null;
    }

    @Override
    public ArrayList<ItemEntity> getAll() throws Exception {
        ArrayList<ItemEntity> itemEntitys = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM item");
        while (rst.next()) {
            ItemEntity entity = new ItemEntity(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));
            itemEntitys.add(entity);
        }
        return itemEntitys;
    }   
}
