package com.service;

import com.entity.Productinfo;

import java.util.List;
import java.util.Map;

public interface IProductinfoService {
    List<Productinfo> selectAll();
    List<Productinfo> selectBySeriesId(Integer seriesid);
    List<Productinfo> selectByIf(Map mp);
    Productinfo selectByPrimaryKey(Integer pid);
}
