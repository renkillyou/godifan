package com.service;

import com.entity.Productseries;

import java.util.List;

public interface IProductseriesService {
    List<Productseries> selectAll();
    Productseries selectByPrimaryKey(Integer seriesId);
}
