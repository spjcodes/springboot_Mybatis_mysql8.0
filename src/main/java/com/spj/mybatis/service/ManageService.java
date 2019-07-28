package com.spj.mybatis.service;

import com.spj.mybatis.dao.CustomerDao;
import com.spj.mybatis.model.Cusromer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ManageService {

    public List<Cusromer> getCustomerList();
    public Cusromer getCusromer(int id);
    public boolean updateCusromer(Cusromer cusromer);
    public Boolean deleteCusromer(int id);
    public boolean addCusromer(Cusromer cusromer);
}
