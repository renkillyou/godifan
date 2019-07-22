package com.dao;

import com.entity.*;

import java.util.List;

public interface IProductseriesDao {
    List<Productseries> selectAll();
    Productseries selectByPrimaryKey(Integer seriesId);
}
