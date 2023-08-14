package pos.layerd.service.custom.impl;

import pos.layerd.dao.DaoFactory;
import pos.layerd.dao.custom.CustomerDao;
import pos.layerd.dto.CustomerDto;
import pos.layerd.entity.CustomerEntity;
import pos.layerd.service.custom.CustomerService;

public  class CustomerServiceImpl implements CustomerService {

    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    public String addCustomer(CustomerDto dto) throws Exception {

        CustomerEntity ce = new CustomerEntity(dto.getId(), dto.getTitile(),
                dto.getName(), dto.getDob(), dto.getSalary(),
                dto.getAddress(), dto.getCity(), dto.getProvince(),
                dto.getZip());

        if (customerDao.addCustomer(ce)) {
            return "Successfully Added";
        } else {
            return "Fail";
        }

    }

}
