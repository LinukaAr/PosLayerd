
package pos.layerd.service.custom;

import pos.layerd.dto.CustomerDto;
import java.util.ArrayList;
import pos.layerd.service.SuperService;


public interface CustomerService extends SuperService {
    String addCustomer(CustomerDto customerDto) throws Exception;

    String updateCustomer(CustomerDto customerDto) throws Exception;

    String deleteCustomer(String id) throws Exception;

    CustomerDto getCustomer(String id) throws Exception;

    ArrayList<CustomerDto> getAllCustomer() throws Exception;
}
