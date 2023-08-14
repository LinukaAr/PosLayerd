
package pos.layerd.dao.custom;
//import pos.layerd.dao.CrudDao;
import pos.layerd.dao.SuperDao;
import pos.layerd.entity.CustomerEntity;

/**
 *
 * @author User
 */
public interface CustomerDao extends SuperDao{
    String addCustomer(CustomerEntity customerEntity)throws Exception;
}
