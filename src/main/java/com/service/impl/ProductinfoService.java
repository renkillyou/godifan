package com.service.impl;

import com.dao.*;
import com.entity.*;
import com.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service(value = "productinfoService")
public class ProductinfoService implements IProductinfoService{

    @Autowired
    private IProductinfoDao dao;
    @Override
    public List<Productinfo> selectAll() {
        return dao.selectAll();
    }

    public List<Productinfo> selectBySeriesId(Integer seriesid){
        return dao.selectBySeriesId(seriesid);
    };

    public List<Productinfo> selectByIf(Map mp){
        return dao.selectByIf(mp);
    }

    public Productinfo selectByPrimaryKey(Integer pid) {
        return dao.selectByPrimaryKey(pid);
    }


    ;
}
