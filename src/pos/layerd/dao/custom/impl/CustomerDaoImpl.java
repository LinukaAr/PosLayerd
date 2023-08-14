
package pos.layerd.dao.custom.impl;

import java.util.ArrayList;
import pos.layerd.dao.CrudUtil;
import pos.layerd.dao.custom.CustomerDao;
import pos.layerd.entity.CustomerEntity;
import java.sql.ResultSet;



public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)",
                t.getId(), t.getTitile(), t.getName(), t.getDob(),
                t.getSalary(), t.getAddress(), t.getCity(), t.getProvince(),
                t.getZip());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Customer SET CustTitle =?, CustName=?, DOB=?, salary = ?, CustAddress=?, City=?, Province=?, PostalCode=? WHERE CustID=?",
                t.getTitile(), t.getName(), t.getDob(),
                t.getSalary(), t.getAddress(), t.getCity(), t.getProvince(),
                t.getZip(), t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE CustID=?",
                id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("Select * FROM Customer WHERE CustID = ?", id);
        
        while (rst.next()) {            
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            
            return customerEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getAll() throws Exception {
        ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();
        
        ResultSet rst = CrudUtil.executeQuery("Select * FROM Customer");
        
        while (rst.next()) {            
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            
           customerEntitys.add(customerEntity);
        }
        
        return customerEntitys;
    }
    
    
}
