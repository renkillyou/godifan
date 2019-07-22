package com.service.impl;

import com.dao.*;
import com.entity.Productkind;
import com.service.IProductkindService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service(value = "productkindService")
public class ProductkindService implements IProductkindService{

    @Autowired
    private IProductkindDao pkd;


    @Override
    public List<Productkind> selectAll() {
        return pkd.selectAll();
    }

    @Override
    public Productkind selectByPrimaryKey(Integer kindid) {
        return pkd.selectByPrimaryKey(kindid);
    }
}
