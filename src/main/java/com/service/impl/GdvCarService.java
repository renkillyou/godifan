package com.service.impl;

import com.dao.IGdvCarDao;
import com.entity.GdvCar;
import com.service.IGdvCarService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service(value = "gdvCarService")
public class GdvCarService implements IGdvCarService{

    @Autowired
    private IGdvCarDao dao;

    @Override
    public int insertSelective(GdvCar gdvcar) {
        return dao.insertSelective(gdvcar);
    }
}
