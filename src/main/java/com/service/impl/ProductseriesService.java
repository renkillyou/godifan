package com.service.impl;

import com.dao.IProductseriesDao;
import com.entity.Productseries;
import com.service.IProductseriesService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service(value = "productseriesService")
public class ProductseriesService implements IProductseriesService{

    @Autowired
    private IProductseriesDao dao;
    @Override
    public List<Productseries> selectAll() {
        return dao.selectAll();
    }

    @Override
    public Productseries selectByPrimaryKey(Integer seriesId) {
        return dao.selectByPrimaryKey(seriesId);
    }
}
