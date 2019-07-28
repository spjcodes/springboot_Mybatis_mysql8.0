package com.spj.mybatis.action;

import com.spj.mybatis.model.Cusromer;
import com.spj.mybatis.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("manage")
public class Test {

    @Autowired
    private ManageService manageService;

    @GetMapping("getCoustomerList")
    @ResponseBody
    public List<Cusromer> getAll(){

        return  manageService.getCustomerList();
    }

    @PostMapping("getCustomer")
    @ResponseBody
    public Cusromer getCustomer(@RequestBody Cusromer cusromer){

        return manageService.getCusromer(cusromer.id);
    }

    @PostMapping("addCoustomer")
    @ResponseBody
    public boolean addCoustomer(@RequestBody Cusromer cusromer){

        return manageService.addCusromer(cusromer);
    }

    @PostMapping("deleteCustomer")
    @ResponseBody
    public boolean deleteCustomer(@RequestBody Cusromer cusromer) {

        return manageService.deleteCusromer(cusromer.id);

    }

    @PostMapping("updateCustomer")
    @ResponseBody
    public boolean addCustomer(@RequestBody Cusromer cusromer) {

        return manageService.updateCusromer(cusromer);
    }

}
