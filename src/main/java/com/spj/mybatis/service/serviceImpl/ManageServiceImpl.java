package com.spj.mybatis.service.serviceImpl;


import com.spj.mybatis.dao.CustomerDao;
import com.spj.mybatis.model.Cusromer;
import com.spj.mybatis.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Cusromer> getCustomerList() {
        return customerDao.getAllCustomer();
    }

    @Override
    public Cusromer getCusromer(int id) {
        return customerDao.getCustomer(id);
    }

    @Override
    public boolean updateCusromer(Cusromer cusromer) {

        try {
            customerDao.updateCustomer(cusromer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean deleteCusromer(int id) {

        try {
            customerDao.deleteCusromerByid(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addCusromer(Cusromer cusromer) {
        try {
            customerDao.addCustomer(cusromer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
