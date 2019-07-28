package com.spj.mybatis.dao;

import com.spj.mybatis.model.Cusromer;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CustomerDao  {

    @Select("select id, username, jobs, phone from t_cusromer")
    List<Cusromer> getAllCustomer();

    @Select("select id, username, jobs, phone from t_cusromer where id = #{id}")
    Cusromer getCustomer(int id);

    @Update("update t_cusromer set username = #{username}, jobs = #{jobs}, phone = #{phone} where id = #{id}")
    void updateCustomer(Cusromer cusromer);

    @Delete("delete  from t_cusromer where id = #{id}")
    void deleteCusromerByid(int id);

    @Insert("insert into t_cusromer(username, jobs, phone ) values ( #{username}, #{jobs}, #{phone})")
    void addCustomer(Cusromer cusromer);




}
