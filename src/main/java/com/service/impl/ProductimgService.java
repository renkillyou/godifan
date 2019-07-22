package com.service.impl;

import com.service.IProductimgService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service(value = "productimgService")
public class ProductimgService implements IProductimgService{

}
